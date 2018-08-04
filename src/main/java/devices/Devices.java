package devices;

import java.util.ArrayList;

import constants.ErrorConstants;
import constants.WarningConstants;
import models.Singleton;
import utils.PrintUI;

public class Devices {
	

	public static void devicesVerify(Singleton instance, ArrayList<String> devices) throws Error {
		devicesFunction(instance, devices);
	}
	
	public static void devicesFunction(Singleton instance, ArrayList<String> devices) throws Error {
		// Si no hay dispositivos Android conectados, se termina la ejecucion
		if (instance.getDevicesList().size() == 0) {
			throw new Error(ErrorConstants.NO_DEVICES);
		}
		// Si ingreso una lista de ID
		else if(devices.size() != 0){
			checkDevicesConnected(instance, devices);
		}
	}
	

	// Verifica que los dispositivos indicados esten conectados
	public static void checkDevicesConnected(Singleton instance, ArrayList<String> devices) {
		ArrayList<String> devicesConnected = Singleton.getInstance().getDevicesList(); 
		for(int i=0; i<devices.size(); i++) {
			if(!devicesConnected.contains(devices.get(i))) {
				PrintUI.showMessage(WarningConstants.WARNING_DEVICE_NOT_CONNECTED);
			}
		}
	}
}
