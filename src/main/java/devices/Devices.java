package devices;

import java.util.ArrayList;

import constants.WarningConstants;
import enums.EnumOS;
import models.Singleton;
import utils.ConsoleRunner;

public class Devices {
	

	public static void devicesVerify(String system, Singleton instance) throws Error {
		ArrayList<String> devices = instance.getDevicesList();
		ArrayList<String> devicesConnected = new ArrayList<String>();
		if(system == EnumOS.ANDROID)
			devicesConnected = ConsoleRunner.getConnectedDevicesAndroid();
		else if (system == EnumOS.IOS)
			devicesConnected = ConsoleRunner.getConnectedDevicesIOS();
		for(int i=0; i<devices.size(); i++) {
			if(!devicesConnected.contains(devices.get(i))) {
				throw new Error(WarningConstants.WARNING_DEVICE_NOT_CONNECTED + " "+ devices.get(i));
			}
		}
	}	

}
