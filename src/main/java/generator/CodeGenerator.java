package generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import abstractClasses.Actions;
import abstractClasses.Iterate;
import abstractClasses.Navigate;
import abstractClasses.Verify;
import constants.CommandConstants;
import constants.ErrorConstants;
import constants.GeneralConstants;
import device.android.DeviceActionsAndroid;
import device.ios.DeviceActionsIOS;
import enums.EnumOS;
import enums.EnumSwipe;
import interfaces.DeviceActionsInterface;
import panel.android.ActionsAndroid;
import panel.android.IteratesAndroid;
import panel.android.NavigateAndroid;
import panel.android.VerifysAndroid;
import panel.ios.ActionsIOS;
import panel.ios.IteratesIOS;
import panel.ios.NavigateIOS;
import panel.ios.VerifysIOS;
import utils.FileHelper;


public class CodeGenerator {
	
	public static String generateTests(ArrayList<String> tests, String system) {
		String generatedTest = "";
		for(int i=0; i<tests.size(); i++){
			// Indentacion del codigo
			if(i != 0)
				generatedTest += "\n";
			generatedTest += "\t\t";
			
			String action = tests.get(i).split("\\(")[0].toUpperCase();
			switch(action){
				case CommandConstants.TYPE_RUN_ACTION: 
					String runActionAux = tests.get(i).split("\\(")[1];
					runActionAux = runActionAux.substring(0, runActionAux.length()-1);
					String runAction[] = runActionAux.split(CommandConstants.FIELD_SEPARATOR);
					String runActionType = runAction[0];
					String runControl = "";
					String runParamOne = "";
					String runParamTwo = "";
					String runParamThree = "";
					if(runAction.length > 1)
						runControl = runAction[1];
					if(runAction.length > 2)
						runParamOne = runAction[2];
					if(runAction.length > 3)
						runParamTwo = runAction[3];
					if(runAction.length > 4)
						runParamThree = runAction[4];
					generatedTest += getRunActionTest(runActionType, runControl, runParamOne, runParamTwo, runParamThree, system);
					break;
				case CommandConstants.TYPE_VERIFY: 
					String verifyAux = tests.get(i).split("\\(")[1];
					verifyAux = verifyAux.substring(0, verifyAux.length()-1);
					String verifyS[] = verifyAux.split(CommandConstants.FIELD_SEPARATOR);
					String assertControl = verifyS[1];
					String assertProperty = verifyS[0];
					String assertValue = "";
					if(verifyS.length == 3)
						assertValue = verifyS[2];
					generatedTest += getVerifyTest(assertProperty.trim(), assertControl, assertValue, system);
					break;
				case CommandConstants.TYPE_NAVIGATE: 
					String navigateAux = tests.get(i).split("\\(")[1];
					String navigate = navigateAux.substring(0, navigateAux.length()-1);
					generatedTest += getNavigateTest(navigate, system);
					break;
				case CommandConstants.TYPE_ITERATE: 
					String iterateAction = tests.get(i).split("\\(")[1];
					iterateAction = iterateAction.substring(0,iterateAction.length() -1);
					String iterate[] = iterateAction.split(CommandConstants.FIELD_SEPARATOR);
					iterateAction = iterate[0];
					String iterateControl = iterate[1].replace("\"","");
					String iteratePosition = iterate[2].replace("\"","");
					generatedTest += getIterateTest(iterateAction, iterateControl, iteratePosition, system);
					break;
			}
		}
		return generatedTest;
	}
	
	// Tests de tipo Iteracion
	private static String getIterateTest(String action, String control, String position, String system) {
		String generatedTest = "";
		Iterate iterate;
		if(system == EnumOS.ANDROID)
			iterate = new IteratesAndroid();
		else
			iterate = new IteratesIOS();

		switch(action.toUpperCase()){
			case CommandConstants.ACTION_BACK:
				generatedTest += iterate.listScroll(control, position);
				break;
			case CommandConstants.ACTION_TAP:
				generatedTest += iterate.listTap(control, position);
				break;
		}
		return generatedTest;
	}
	
	// Tests de tipo Accion
	private static String getRunActionTest(String action, String control, String param1, String param2, String param3, String system) {
		String generatedTest = "";
		Actions actions;
		if(system == EnumOS.ANDROID)
			actions = new ActionsAndroid();
		else
			actions = new ActionsIOS();

		DeviceActionsInterface deviceActions;
		if(system == EnumOS.ANDROID)
			deviceActions = new DeviceActionsAndroid();
		else
			deviceActions = new DeviceActionsIOS();
		
		switch(action.toUpperCase()){
			case CommandConstants.ACTION_BACK:
				generatedTest += deviceActions.pressBack();
				break;
			case CommandConstants.ACTION_TAP:
				generatedTest += actions.tap(control);
				break;
			case CommandConstants.ACTION_LONG_TAP:
				generatedTest += actions.longTap(control);
				break;
			case CommandConstants.ACTION_DOUBLE_TAP:
				generatedTest += actions.doubleTap(control);
				break;
			case CommandConstants.ACTION_SWIPE_UP:
				generatedTest += actions.swipe(EnumSwipe.swipeUp);
				break;
			case CommandConstants.ACTION_SWIPE_DOWN:
				generatedTest += actions.swipe(EnumSwipe.swipeDown);
				break;
			case CommandConstants.ACTION_SWIPE_LEFT:
				generatedTest += actions.swipe(EnumSwipe.swipeLeft);
				break;
			case CommandConstants.ACTION_SWIPE_RIGHT:
				generatedTest += actions.swipe(EnumSwipe.swipeRight);
				break;
			case CommandConstants.ACTION_TYPE_TEXT:
				generatedTest += actions.typeText(control, param1);
				break;
			case CommandConstants.ACTION_EDIT_DATE:
				generatedTest += actions.setDate(control, param1.replace("\"", ""), param2.replace("\"", ""), param3.replace("\"", ""));
				break;
			case CommandConstants.ACTION_EDIT_TIME:
				generatedTest += actions.setTime(control, param1.replace("\"", ""), param2.replace("\"", ""));
				break;
			}
		return generatedTest;
	}
	
	// Devuelve el texto de un test tipo Verify
	private static String getVerifyTest(String property, String view, String textToType, String system) {
		String generatedTest = "";
		Verify verify;
		if(system == EnumOS.ANDROID)
			verify = new VerifysAndroid();
		else
			verify = new VerifysIOS();
		switch(property.toUpperCase()){
			case CommandConstants.VERIFY_HAS_FOCUS:
				generatedTest += verify.hasFocus(view); break;
			case CommandConstants.VERIFY_IS_CLICKABLE:
				generatedTest += verify.isClickable(view); break;
			case CommandConstants.VERIFY_IS_COMPLETELY_DISPLAYED:
				generatedTest += verify.isCompletelyDisplayed(view); break;
			case CommandConstants.VERIFY_IS_DISPLAYED:
				generatedTest += verify.isDisplayed(view); break;
			case CommandConstants.VERIFY_IS_ENABLED:
				generatedTest += verify.isEnabled(view); break;
			case CommandConstants.VERIFY_COMPARE_TEXT:
				generatedTest += verify.verifyText(view, textToType); break;
		}
		
		return generatedTest;
	}
	
	// Tests de tipo Accion
	private static String getNavigateTest(String panel, String system) {
		String generatedTest = "";
		Navigate navigate;
		if(system == EnumOS.ANDROID)
			navigate = new NavigateAndroid();
		else
			navigate = new NavigateIOS();
		generatedTest += navigate.go(panel);
		return generatedTest;
	}

	// GENERA EL ARCHIVO .JAVA o .SWIFT
	public static void writeTestToFile(String generatedTest, String system) throws Error {
		if(system.equals(EnumOS.ANDROID)){
			FileHelper.cleanTestDir();
			FileHelper.createFileAndroid(GeneralConstants.PATH_ANDROID, generatedTest);
		}
		else{
			Properties prop = new Properties();
			try {
				prop.load(new FileInputStream(new File(GeneralConstants.PROPERTIES_PATH)));
				FileHelper.createFileIOS(prop.getProperty("PATH_IOS"), generatedTest);
			} catch (IOException e) {
				throw new Error(ErrorConstants.PROPERTY_NOT_FOUND);
			}
		}
	}
	
}



