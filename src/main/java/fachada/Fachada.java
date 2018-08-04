package fachada;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import commandLine.Menu;
import connection.ConnectionIOS;
import constants.CommandConstants;
import constants.GeneralConstants;
import constants.MenuConstants;
import devices.Devices;
import enums.EnumDevices;
import enums.EnumOS;
import executor.Executor;
import generator.CodeGenerator;
import models.AndroidIOS;
import models.Singleton;
import parser.Parser;
import utils.ConsoleRunner;
import utils.FileHelper;
import utils.PrintUI;

public class Fachada {
	
	// Inicia todo el flujo del sistema
	public static void main(String[] args) {
		PrintUI messages = new PrintUI();
		try {
			Menu menu = new Menu();
			String[] params = menu.checkArgs(args);
			
			if (!menu.argsOk(args.length)) // Muestro ayuda
				messages.showHelp();
			else {  // Todo ok
				PrintUI.showMessage("\n**** INICIO MTDI ****\n");
				
				// Se crea instancia de singleton
				Singleton instance = Singleton.getInstance();
				Properties prop = new Properties();
				prop.load(new FileInputStream(new File(GeneralConstants.PROPERTIES_PATH)));
				

				
				String sys = params[0];
				int counter = 0, tope = 0;
				if(sys == EnumOS.ALL)
					tope = 2;
				else 
					tope = 1;
				while(counter < tope) { 
					if ((tope == 2) && (counter == 0))
						sys = EnumOS.ANDROID;
					else if ((tope == 2) && (counter == 1))
						sys = EnumOS.IOS;
					counter++;
						
						
					if (sys == EnumOS.ANDROID) {
						//Se copia Proyecto Gx a otro directorio
						PrintUI.showMessage("Copiando proyecto...");
						FileHelper.copyProjectGx(params[3], params[5]);
						PrintUI.showMessage("done\n");
					} else if (sys == EnumOS.IOS) {
						ConnectionIOS.connectToMac();
					}
				
					//Carga parametros en singleton
					PrintUI.showMessage("Cargando informacion...");
					loadParamsInSingleton(sys, devices(params[1]), new AndroidIOS(prop.getProperty("PATH_TO_COPY_PROJECT"), ""), new AndroidIOS(params[4], ""), params[5], params[6]);
					PrintUI.showMessage("done\n");
					
					//Verifica dispositivos conectados
					PrintUI.showMessage("Verificando dispositivos...");
					Devices.devicesVerify(instance, devices(params[1]));
					PrintUI.showMessage("done\n");
					
					// Crea parser
					Parser p = new parser.Parser();
					// Obtiene comandos de UI, ***ANTLR***
					PrintUI.showMessage("Parseando comandos UI...");
					ArrayList<String> uiTests = p.getCommandsUI(params[2]);
					PrintUI.showMessage("done\n");
				
					// Parsea comandos de UI a comandos internos
					PrintUI.showMessage("Parseando comandos UI a comandos internos...");
					ArrayList<String> commands = p.parser(uiTests);
					PrintUI.showMessage("done\n");
					
					//Genera codigo y graba en archivo
					String codeTest;
					PrintUI.showMessage("Generando test "+sys.toString().toUpperCase()+"...");
					codeTest = CodeGenerator.generateTests(commands, sys);
					CodeGenerator.writeTestToFile(codeTest, sys);
					PrintUI.showMessage("done\n");
	
				
					// Ejecuta los Tests
					PrintUI.showMessage("Ejecutando...\n");
					Executor.executeTests(sys);

				}
				PrintUI.showMessage("\n**** FIN MTDI ****\n");
			}
			
		} catch (Error | IOException e) {
			PrintUI.showMessage("\nERROR: "+e.getMessage());
			PrintUI.showMessage("\n\n"+MenuConstants.HELP);
			PrintUI.showMessage("\n**** FIN MTDI ****\n");
		} 
		System.exit(1);
	}
		
	public static ArrayList<String> devices(String argD){
		ArrayList<String> devices = new ArrayList<String>();
		if(!argD.contains(EnumDevices.ALL)){
			if(!argD.contains(CommandConstants.FIELD_SEPARATOR))
				devices.add(argD);
			else{
				String[] split = argD.split(CommandConstants.FIELD_SEPARATOR);
				for(int i=0; i<split.length; i++){
					devices.add(split[i]);
				}
			}
		}
		return devices;
	}
		
	public static void loadParamsInSingleton(String OS, ArrayList<String> devices, AndroidIOS projectPath, AndroidIOS packageApp, String mainObject, String takeScreenShot) {
		Singleton instance = Singleton.getInstance();
		instance.setMainObject(mainObject);
		instance.setClassName(GeneralConstants.TEST_FILE_NAME);
		instance.setProjectPath(new AndroidIOS(projectPath.getAndroid(), projectPath.getIOS()));
		instance.setPackageName(new AndroidIOS(packageApp.getAndroid(), packageApp.getIOS()));
		switch(OS){
			case EnumOS.ANDROID: 
				instance.setOs(EnumOS.ANDROID);  
				instance.setAdbPath(FileHelper.loadAndroidSdkPath(projectPath.getAndroid()));
				instance.setDevicesList(ConsoleRunner.getConnectedDevicesAndroid());
				break;
			case EnumOS.IOS: 
				instance.setOs(EnumOS.IOS); 
				instance.setDevicesList(ConsoleRunner.getConnectedDevicesIOS());
				break;
			case EnumOS.ALL: 
				instance.setOs(EnumOS.ALL); 
				break;
		}
		
		if (takeScreenShot == GeneralConstants.YES)
			instance.setScreenshot(true);
		else
			instance.setScreenshot(false);
	}
}
