package panel.ios;

import abstractClasses.Verify;

public class VerifysIOS extends Verify {
	
	@Override
	public String verifyText(String controlName, String textToCheck) {
		return "let x = mainTable().read(edit: "+controlName+")\n" +
				"validateEquals(expression1: x, expression2: "+textToCheck+", message: \"El valor deberia ser "+textToCheck.replaceAll("\"", "")+"\")";
	}

	@Override
	public String isDisplayed(String controlName) {
		return "mainTable().isVisible(map: "+controlName+")";
	}

	@Override
	public String isCompletelyDisplayed(String controlName) {
		return "mainTable().isVisible(map: "+controlName+")";
	}

	@Override
	public String hasFocus(String controlName) {
		// No esta disponible en la API
		return "";
	}

	@Override
	public String isEnabled(String controlName) {
		// No esta disponible en la API
		return "";
	}

	@Override
	public String isClickable(String controlName) {
		return "mainTable().isVisible(map: "+controlName+")";
	}

}
