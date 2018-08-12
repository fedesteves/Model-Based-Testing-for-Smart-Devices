package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import constants.GeneralConstants;
import constants.ErrorConstants;
import models.Singleton;
import models.TestResult;

public class ConsoleRunner {
		
	// Ejecuta un comando en consola
	public static TestResult executeCmdAndroid(String cmdCommand) throws Error {
		
		//PrintUI.showMessage("\n"+cmdCommand+"\n");
		
		String s = null;
		int resultCode = 0;
		String resultMessage = "";
        try {
            Process p = Runtime.getRuntime().exec(cmdCommand);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            while ((s = stdInput.readLine()) != null) {
            	//PrintUI.showMessage(s+"\n");
            	// Si contiene ese texto es porque crasheo en alguna clase
            	if(s.contains("android.") && resultMessage == "" ){
            		resultMessage += "\n"+s;
            		resultCode = 1;
            	}
            	if (s.contains("FAILED") && resultMessage == ""){
            		resultMessage += "\n"+s;
            		resultCode = 1;
            	}
            }
            
            // Cachea otros errores
            while ((s = stdError.readLine()) != null && !cmdCommand.contains("gradle")) {
	            resultCode = 1;
            }
        }
        catch (IOException e) {
        	resultCode = 1;
        	throw new Error(ErrorConstants.COMMAND+cmdCommand);
        }

        return new TestResult(resultCode, resultMessage);
	}
	
	public static ArrayList<String> getConnectedDevicesAndroid() throws Error {
		String s = null;
		ArrayList<String> devicesList = new ArrayList<String>();
		int counter = 0;
        try {
            Process p = Runtime.getRuntime().exec(GeneralConstants.ADB_DEVICES);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((s = stdInput.readLine()) != null) {
            	counter++;
        		if(counter > 1){
        			devicesList.add(s.split("\\s+")[0]);
        		}	
            } 
        }
        catch (IOException e) {
        	throw new Error(ErrorConstants.COMMAND+GeneralConstants.ADB_DEVICES);
        }

        // La lista de dispositivos siempre trae la ultima linea vacia
        if(devicesList.size() >= 1){
        	devicesList.remove(devicesList.size()-1);
        }
        return devicesList;
	}

	// Ejecuta un comando a traves de SSH
	public static ArrayList<String> executeCmdIOS(String command) throws Error {
        try {
        	Session session = Singleton.getInstance().getSession();
	        ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
	        InputStream in = channelExec.getInputStream();
	        
	        //PrintUI.showMessage("\n"+command+"\n");
	        
            channelExec.setCommand(command);
			channelExec.connect();
	        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
	        StringBuilder builder = new StringBuilder();
	        String line;
	        ArrayList<String> list = new ArrayList<>();
	        while ((line = reader.readLine()) != null) {
	        	//PrintUI.showMessage(line+"\n");
	        	list.add(line);
	            builder.append(line);
	            builder.append("\n");
	        }
			channelExec.disconnect();
	        return list;
		} catch (JSchException | IOException e) {
			throw new Error(ErrorConstants.COMMAND_MAC);
		}
	}
	
	// Ejecuta un comando en consola
	public static ArrayList<String> getConnectedDevicesIOS() {
		ArrayList<String> devicesList = new ArrayList<String>();
    	ArrayList<String> devices = executeCmdIOS(GeneralConstants.GET_DEVICES_IOS);
    	String s;
        for(int i=0; i<devices.size(); i++){
        	s = devices.get(i);
        	if(s.contains("Booted") && !devicesList.contains(s.split("\\(")[1].split("\\)")[0])){
            	devicesList.add(s.split("\\(")[1].split("\\)")[0]);
        	}
        } 
        return devicesList;
	}
}
