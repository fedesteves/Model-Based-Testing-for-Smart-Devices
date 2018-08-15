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
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_LONGTAP"));
		c.add("controlName", controlName);
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
		if (controlName.contains("&")){
			controlName = controlName.toLowerCase().trim(); 
		} else {
			controlName = controlName.toLowerCase().trim().replaceAll("&", ""); 
			controlName = controlName.substring(0, 1).toUpperCase() + controlName.substring(1);
		}
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
		String monthAux = "";
		switch (month){
			case "02": 
				monthAux= "February";
				break;
			case "03": 
				monthAux= "March";
				break;
			case "04": 
				monthAux= "April";
				break;
			case "05": 
				monthAux= "May";
				break;
			case "06": 
				monthAux= "June";
				break;
			case "07": 
				monthAux= "July";
				break;
			case "08": 
				monthAux= "August";
				break;
			case "09": 
				monthAux= "September";
				break;
			case "10": 
				monthAux= "October";
				break;
			case "11": 
				monthAux= "November";
				break;
			case "12": 
				monthAux= "December";
				break;
			default: 
				monthAux= "January";
				break;
		}
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_SETDATE"));
		c.add("controlName", controlName.toLowerCase());
		c.add("year", year.trim());
		c.add("month", monthAux.trim());
		c.add("day", day.trim());
		String output = c.render();
		return output;
	}

	@Override
	public String setTime(String controlName, String hour, String minute) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_SETTIME"));
		c.add("controlName", controlName.toLowerCase());
		
		String temp = "AM";
		if(Integer.parseInt(hour) >= 12)
			temp = "PM";
		c.add("am_pm", temp);
		
		String hourAux = "";
		if(Integer.parseInt(hour) >= 12)
			hourAux = String.valueOf(Integer.parseInt(hour) - 12);
		c.add("hour", hourAux.trim());
		c.add("minute", minute.trim());
		
		
		String output = c.render();
		return output;
	}

}
