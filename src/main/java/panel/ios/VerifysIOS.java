package panel.ios;

import org.stringtemplate.v4.ST;

import abstractClasses.Verify;
import models.Singleton;

public class VerifysIOS extends Verify {
	
	@Override
	public String verifyText(String controlName, String textToCheck) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_VERIFYTEXT"));
		c.add("controlName", controlName);
		c.add("textToCheck", textToCheck);
		c.add("textToCheckAux", textToCheck.replaceAll("\"", ""));
		String output = c.render();
		return output;
	}

	@Override
	public String isDisplayed(String controlName) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_ISDISPLAYED"));
		c.add("controlName", controlName);
		String output = c.render();
		return output;
	}

	@Override
	public String isCompletelyDisplayed(String controlName) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_ISCOMPLETELYDISPLAYED"));
		c.add("controlName", controlName);
		String output = c.render();
		return output;
	}

	@Override
	public String hasFocus(String controlName) {
		// No esta disponible en la API
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_HASFOCUS"));
		String output = c.render();
		return output;
	}

	@Override
	public String isEnabled(String controlName) {
		// No esta disponible en la API
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_ISENABLED"));
		String output = c.render();
		return output;
	}

	@Override
	public String isClickable(String controlName) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_ISCLICKABLE"));
		c.add("controlName", controlName);
		String output = c.render();
		return output;
	}

}
