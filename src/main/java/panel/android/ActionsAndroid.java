package panel.android;

import org.stringtemplate.v4.ST;

import abstractClasses.Actions;
import enums.EnumSwipe;
import models.Singleton;

public class ActionsAndroid extends Actions{
	
	@Override
	public String tap(String controlName) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_TAP"));
		c.add("controlName", controlName);
		String output = c.render();
		return output;
	}

	@Override
	public String longTap(String controlName) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_LONGTAP"));
		c.add("controlName", controlName);
		String output = c.render();
		return output;
	}

	@Override
	public String doubleTap(String controlName) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_DOUBLETAP"));
		c.add("controlName", controlName);
		String output = c.render();
		return output;
	}

	@Override
	public String typeText(String controlName, String textToType) {
		
		if (controlName.contains("&")){
			controlName = controlName.toLowerCase().trim().replaceAll("&", ""); 
			controlName = controlName.substring(0, 1).toUpperCase() + controlName.substring(1);
		}
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_TYPETEXT"));
		c.add("controlName", controlName);
		c.add("textToType", textToType);
		String output = c.render();
		return output;
	}

	@Override
	public String swipe(EnumSwipe swipe) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_SWIPE"));
		c.add("actionName", swipe.toString());
		String output = c.render();
		return output;
	}

	@Override
	public String setDate(String controlName, String day, String month, String year) {
		controlName = controlName.trim().toLowerCase().replaceAll("&", "");
		controlName = controlName.substring(0, 1).toUpperCase() + controlName.substring(1);
		String monthAux = month;
		if(Integer.parseInt(month.trim()) < 10 && month.trim().length() > 1)
			monthAux = month.substring(1, 2);
		String dayAux = day;
		if(Integer.parseInt(day.trim()) < 10 && day.trim().length() > 1)
			dayAux = day.substring(1, 2);
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_SETDATE"));
		c.add("controlName", controlName);
		c.add("year", year.trim());
		c.add("month", monthAux.trim());
		c.add("day", dayAux.trim());
		String output = c.render();
		return output;
	}

	@Override
	public String setTime(String controlName, String hour, String minute) {
		controlName = controlName.trim().toLowerCase().replaceAll("&", "");
		controlName = controlName.substring(0, 1).toUpperCase() + controlName.substring(1);
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_SETTIME"));
		c.add("controlName", controlName);
		
		String hourAux = hour;
		if(Integer.parseInt(hour.trim()) < 10 && hour.trim().length() > 1)
			hourAux = hour.substring(1, 2);
		c.add("hour", hourAux.trim());
		
		String minuteAux = minute;
		if(Integer.parseInt(minute.trim()) < 10 && minute.trim().length() > 1)
			minuteAux = minute.substring(1, 2);
		c.add("minute", minuteAux.trim());
		String output = c.render();
		return output;
	}

}
