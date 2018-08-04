package executor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

import connection.ConnectionIOS;
import constants.ErrorConstants;
import constants.GeneralConstants;
import enums.EnumOS;
import models.Singleton;
import models.TestResult;
import utils.ConsoleRunner;
import utils.FileHelper;
import utils.PrintUI;

public class Executor {
	
	public static void executeTests(String system) throws Error {
		if(system.equals(EnumOS.ANDROID)){
			PrintUI.showMessage("\n"+EnumOS.ANDROID+"\n");
			executeTestsAndroid();
		}
		else{
			PrintUI.showMessage("\n"+EnumOS.IOS+"\n");
			executeTestsIos();
		}
	}
	
	// Ejecuta los tests en los dispositivos Android
	private static void executeTestsAndroid() throws Error {
		FileHelper.modifyBuildGradle();
		PrintUI.showMessage("Compilando apk...");
		TestResult result = ConsoleRunner.executeCmdAndroid(GeneralConstants.GRADLE);
		if (TestResult.resulttestFailed(result.getResultCode())) {
			PrintUI.showMessage(TestResult.resultManager(result, EnumOS.ANDROID)); 
			throw new Error(ErrorConstants.COMPILATION_FAILED);
		} 
		PrintUI.showMessage("done\n");
		for(int i=0; i<Singleton.getInstance().getDevicesList().size(); i++){
			PrintUI.showMessage("\n\nDispositivo: "+Singleton.getInstance().getDevicesList().get(i)+"\n");
			PrintUI.showMessage("Instalando apk-debug...");
			result = ConsoleRunner.executeCmdAndroid(GeneralConstants.ADB_PATH+" -s "+Singleton.getInstance().getDevicesList().get(i)+GeneralConstants.ADB_INSTALL_APK_DEBUG);
			if (TestResult.resulttestFailed(result.getResultCode())) {
				PrintUI.showMessage(TestResult.resultManager(result, EnumOS.ANDROID)); 
			} else {
				PrintUI.showMessage("done\n");
				PrintUI.showMessage("Instalando apk-debug-androidTest...");
				result = ConsoleRunner.executeCmdAndroid(GeneralConstants.ADB_PATH+" -s "+Singleton.getInstance().getDevicesList().get(i)+GeneralConstants.ADB_INSTALL_APK_TEST);
				if (TestResult.resulttestFailed(result.getResultCode())) {
					PrintUI.showMessage(TestResult.resultManager(result, EnumOS.ANDROID)); 
				} else {
					PrintUI.showMessage("done\n");
					PrintUI.showMessage("Ejecutando test...");
					result = ConsoleRunner.executeCmdAndroid(GeneralConstants.ADB_PATH+" -s "+Singleton.getInstance().getDevicesList().get(i)+" shell am instrument -w -e class " + Singleton.getInstance().getPackageName().getAndroid()+ "." + Singleton.getInstance().getMainObject().toLowerCase() + "." + Singleton.getInstance().getClassName() + " "+Singleton.getInstance().getPackageName().getAndroid() +  "." + Singleton.getInstance().getMainObject().toLowerCase() + GeneralConstants.ANDROID_RUNNER);
					PrintUI.showMessage("done\n");
					PrintUI.showMessage("RESULTADO:\t");
					PrintUI.showMessage(TestResult.resultManager(result, EnumOS.ANDROID)); 
					PrintUI.showMessage("\n");
					
				}
			}
		}
	}
	
	// Ejecuta los tests en los dispositivos IOS
	private static void executeTestsIos() throws Error {
		try {
			ConnectionIOS.connectToMac();
			
			Singleton s = Singleton.getInstance();
			Properties prop = new Properties();
			prop.load(new FileInputStream(new File(GeneralConstants.PROPERTIES_PATH)));
			
			Session session = Singleton.getInstance().getSession();
			PrintUI.showMessage("Enviando archivo test a Mac...");
			sendFileToMac(session, prop.getProperty("PATH_IOS")+GeneralConstants.PATH_IOS_DESTINATION, prop.getProperty("IOS_PROJECT_PATH").substring(2).replaceAll(" ", "\\\\ ")+"/"+s.getMainObject()+"UITests/"+s.getMainObject()+"UITests.swift");
			PrintUI.showMessage("done\n");
			
			PrintUI.showMessage("Compilando app en Mac...");
			ConsoleRunner.executeCmdIOS("cd "+ prop.getProperty("IOS_PROJECT_PATH").replaceAll(" ", "\\\\ ")+";"+GeneralConstants.IOS_COMPILE);
			PrintUI.showMessage("done\n");
			
			String command, cd, project;
			for(int i=0; i<s.getDevicesList().size(); i++){
				PrintUI.showMessage("\n\nDispositivo: "+s.getDevicesList().get(i)+"\n");
				PrintUI.showMessage("Instalando app...");
		        command = "cd "+prop.getProperty("IOS_PROJECT_PATH").replaceAll(" ", "\\\\ ")+"/build/Debug-iphonesimulator/ ;"
		        		+"xcrun simctl install "+s.getDevicesList().get(i)+" "+s.getMainObject()+".app";
		        ConsoleRunner.executeCmdIOS(command);
		        PrintUI.showMessage("done\n");
		     
		        PrintUI.showMessage("Ejecutando test...");
		        cd = "cd "+prop.getProperty("IOS_PROJECT_PATH").replaceAll(" ", "\\\\ ")+"/;";
		        project = s.getMainObject()+".xcodeproj";
		        command = cd+" xcodebuild test -project "+project+" -scheme "+s.getMainObject()+" -destination id="+s.getDevicesList().get(i)+" -only-testing:"+s.getMainObject()+"UITests/"+GeneralConstants.TEST_FILE_NAME+"/"+GeneralConstants.TEST_NAME;
		        executeIOSAux(command, session);
		        
			}	

			ConnectionIOS.disconnectMac();
			
		} catch (IOException e) {
			ConnectionIOS.disconnectMac();
			throw new Error(ErrorConstants.PROPERTY_NOT_FOUND); 
		}	
	}
	
	// Ejecuta test ios
	private static void executeIOSAux(String command, Session session) {
		ArrayList<String> result = ConsoleRunner.executeCmdIOS(command);
        int resultCode = 1;
        String resultMessage = " ";
        for(int z=result.size()-1; z>=0; z--) {
	        if (result.get(z).contains("TEST SUCCEEDED")) {
	        	resultCode = 0;
	        }
	        else if(result.get(z).contains("Assertion Failure")){
	        	resultMessage += result.get(z);
	        }
        }
        PrintUI.showMessage("\nRESULTADO:\t");
        PrintUI.showMessage(TestResult.resultManager(new TestResult(resultCode, resultMessage), EnumOS.IOS));
        PrintUI.showMessage("\n");
	}

	
	// Envia el archivo de test al servidor
	private static void sendFileToMac(Session session, String sourceFile, String destinationFile) {
		ChannelSftp sftpChannel = null;
        try {
        	sftpChannel = (ChannelSftp) session.openChannel("sftp");
            sftpChannel.connect();
			sftpChannel.put(sourceFile, destinationFile);
		} catch (SftpException | JSchException e) {
			throw new Error(ErrorConstants.IOS_FILE);
		}
        finally{
        	if(sftpChannel != null)
        		sftpChannel.disconnect();
        }
	}
}
