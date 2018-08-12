package abstractClasses;

import interfaces.PanelVerifysInterface;

public abstract class Verify implements PanelVerifysInterface{
	public abstract String hasFocus(String controlName);
	public abstract String verifyText(String controlName, String textToCheck);
	public abstract String isDisplayed(String controlName);
	public abstract String isCompletelyDisplayed(String controlName);
	public abstract String isEnabled(String controlName);
	public abstract String isClickable(String controlName);
}
