package panel.ios;

import org.stringtemplate.v4.ST;

import abstractClasses.Actions;
import enums.EnumSwipe;
import models.Singleton;

public class ActionsIOS extends Actions{

	@Override
	public String tap(String controlName) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_TAP"));
		c.add("controlName", controlName);
		String output = c.render();
		return output;
	}

	@Override
	public String longTap(String controlName) {
		// No esta disponible en la API
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_LONGTAP"));
		String output = c.render();
		return output;
	}

	@Override
	public String doubleTap(String controlName) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_DOUBLETAP"));
		c.add("controlName", controlName);
		String output = c.render();
		return output;
	}

	@Override
	public String typeText(String controlName, String textToType) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_TYPETEXT"));
		c.add("controlName", controlName);
		c.add("textToType", textToType);
		String output = c.render();
		return output;
	}

	@Override
	public String swipe(EnumSwipe swipe) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_SWIPE"));
		c.add("actionName", swipe.toString());
		String output = c.render();
		return output;
	}

	@Override
	public String setDate(String controlName, String day, String month, String year) {
		// FALTA
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_SETDATE"));
		String output = c.render();
		return output;
	}

	@Override
	public String setTime(String controlName, String hour, String minute) {
		// FALTA
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_SETTIME"));
		String output = c.render();
		return output;
	}

}
