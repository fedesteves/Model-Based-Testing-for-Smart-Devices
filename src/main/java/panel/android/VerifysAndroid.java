package panel.android;

import org.stringtemplate.v4.ST;

import abstractClasses.Verify;
import models.Singleton;

public class VerifysAndroid extends Verify {
	
	@Override
	public String verifyText(String controlName, String textToCheck) {
		String controlNameAux = controlName.trim().toLowerCase().replaceAll("&", "");
		controlNameAux = controlNameAux.substring(0, 1).toUpperCase()+controlNameAux.substring(1, controlNameAux.length());
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_VERIFYTEXT"));
		c.add("controlName", controlNameAux);
		c.add("textToCheck", textToCheck);
		String output = c.render();
		return output;
	}

	@Override
	public String isDisplayed(String controlName) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_ISDISPLAYED"));
		c.add("controlName", controlName);
		String output = c.render();
		return output;
	}

	@Override
	public String isCompletelyDisplayed(String controlName) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_ISCOMPLETELYDISPLAYED"));
		c.add("controlName", controlName);
		String output = c.render();
		return output;
	}

	@Override
	public String hasFocus(String controlName) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_HASFOCUS"));
		c.add("controlName", controlName);
		String output = c.render();
		return output;
	}

	@Override
	public String isEnabled(String controlName) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_ISENABLED"));
		c.add("controlName", controlName);
		String output = c.render();
		return output;
	}

	@Override
	public String isClickable(String controlName) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_ISCLICKABLE"));
		c.add("controlName", controlName);
		String output = c.render();
		return output;
	}

}
