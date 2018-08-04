package panel.ios;

import abstractClasses.Actions;
import enums.EnumSwipe;

public class ActionsIOS extends Actions{

	@Override
	public String tap(String controlName) {
		return "mainTable().tap(text: "+controlName+")";
	}

	@Override
	public String longTap(String controlName) {
		// No esta disponible en la API
		return "";
	}

	@Override
	public String doubleTap(String controlName) {
		return "mainTable().tap(text: "+controlName+")\nmainTable().tap(text: "+controlName+")";
	}

	@Override
	public String typeText(String controlName, String textToType) {
		return "mainTable().fill(edit: "+controlName+", value: "+textToType+")";
	}

	@Override
	public String swipe(EnumSwipe swipe) {
		return "XCUIApplication().otherElements[\"Maintable\"]."+swipe.toString()+"()";
	}

	@Override
	public String setDate(String controlName, String day, String month, String year) {
		return "";
	}

	@Override
	public String setTime(String controlName, String hour, String minute) {
		return "";
	}

}
