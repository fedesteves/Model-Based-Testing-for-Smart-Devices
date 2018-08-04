package interfaces;

public interface PanelVerifysInterface {
	String verifyText(String view, String textToCheck);
	String isDisplayed(String view);
	String isCompletelyDisplayed(String view);
	String hasFocus(String view);
	String isEnabled(String view);
	String isClickable(String view);
}
