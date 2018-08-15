package facade;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import commandLine.Menu;
import connection.ConnectionIOS;
import constants.CommandConstants;
import constants.ErrorConstants;
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

public class Facade {
	
	// Inicia todo el flujo del sistema
	public static void main(String[] args) {
		PrintUI messages = new PrintUI();
		try {
			Menu menu = new Menu();
			String[] params = menu.checkArgs(args);
			
			if (!menu.argsOk(args.length)) // Muestro ayuda
				messages.showHelp();
			else {  // Todo ok
				PrintUI.showMessage("\n*************************************");
				PrintUI.showMessage("\n************ INICIO MTDI ************");
				PrintUI.showMessage("\n*************************************\n");
				
				// Se crea instancia de singleton
				Singleton instance = Singleton.getInstance();

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
					
					PrintUI.showMessage("\n\n");
					PrintUI.showMessage("*** "+sys.toString()+" ***\n");

					if (sys == EnumOS.ANDROID) {
						//Se copia Proyecto Gx a otro directorio
						if (params[8].contains(GeneralConstants.YES)) {
							PrintUI.showMessage("Copiando proyecto...");
							FileHelper.copyProjectGx(params[5], params[3]);
							PrintUI.showMessage("done\n");
						}
					} else if (sys == EnumOS.IOS) {
						ConnectionIOS.connectToMac();
					}
					
					String android_proj_path =System.getProperty("user.dir")+"\\"+GeneralConstants.PATH_TO_COPY_PROJECT;
					String ios_proj_path = "~"+params[6];
					
					//Carga parametros en singleton
					PrintUI.showMessage("Cargando informacion...");
					 // (System, devices, projectPath, packageApp, mainObject, takeScreenShot)
					loadParamsInSingleton(sys, devices(params[1]), new AndroidIOS(android_proj_path, ios_proj_path), params[7], params[3], params[4]);
					PrintUI.showMessage("done\n");
					
					//Verifica dispositivos conectados
					PrintUI.showMessage("Verificando dispositivos...");
					Devices.devicesVerify(sys, instance);
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
				PrintUI.showMessage("\n************* FIN MTDI **************");
				PrintUI.showMessage("\n*************************************\n");
			}
			
		} catch (Error e) {
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
		} else {
			devices.add(EnumDevices.ALL);
		}
		return devices;
	}
		
	public static void loadParamsInSingleton(String OS, ArrayList<String> devices, AndroidIOS projectPath, String packageApp, String mainObject, String takeScreenShot) throws Error {
		Singleton instance = Singleton.getInstance();
		instance.setMainObject(mainObject);
		instance.setClassName(mainObject+GeneralConstants.TEST_FILE_NAME);
		instance.setProjectPath(new AndroidIOS(projectPath.getAndroid(), projectPath.getIOS()));
		instance.setPackageName(packageApp);
		
		switch(OS){
			case EnumOS.ANDROID: 
				instance.setOs(EnumOS.ANDROID);  
				instance.setAdbPath(FileHelper.loadAndroidSdkPath(projectPath.getAndroid()));
				break;
			case EnumOS.IOS: 
				instance.setOs(EnumOS.IOS); 
				break;
			case EnumOS.ALL: 
				instance.setOs(EnumOS.ALL); 
				
				//ANDROID
				instance.setAdbPath(FileHelper.loadAndroidSdkPath(projectPath.getAndroid()));

				break;
		}
		
		instance.setDevicesList(devices);
		
		if (devices.size()==1 && devices.get(0).equals(EnumDevices.ALL)){
			ArrayList<String> devicesAux = new ArrayList<String>();
			if (OS.equals(EnumOS.ANDROID))
				devicesAux.addAll(ConsoleRunner.getConnectedDevicesAndroid());
			else if (OS.equals(EnumOS.IOS))
				devicesAux.addAll(ConsoleRunner.getConnectedDevicesIOS());
			else {
				devicesAux.addAll(ConsoleRunner.getConnectedDevicesAndroid());
				devicesAux.addAll(ConsoleRunner.getConnectedDevicesIOS());
			}
			instance.setDevicesList(devicesAux);
		}
		
		
		//Carga archivo de string de comandos
		try {
			Properties propCommands = new Properties();
			propCommands.load(new FileInputStream(new File(GeneralConstants.COMMAND_STRINGS_PATH)));
			Singleton.getInstance().setStringCommands(propCommands);
		} catch (IOException e) {
			throw new Error(ErrorConstants.PROPERTY_COMMANDS_NOT_FOUND);
		}
		
		if (takeScreenShot == GeneralConstants.YES)
			instance.setScreenshot(true);
		else
			instance.setScreenshot(false);
	}
}
