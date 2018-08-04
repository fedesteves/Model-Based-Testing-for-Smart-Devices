package abstractClasses;

import interfaces.PanelVerifysInterface;

public abstract class Verify implements PanelVerifysInterface{
	public abstract String hasFocus(String view);
	public abstract String verifyText(String view, String textToCheck);
	public abstract String isDisplayed(String view);
	public abstract String isCompletelyDisplayed(String view);
	public abstract String isEnabled(String view);
	public abstract String isClickable(String view);
}
