package panel.android;

import abstractClasses.Actions;
import enums.EnumSwipe;

public class ActionsAndroid extends Actions{
	
	@Override
	public String tap(String controlName) {
		return "onControl(withName("+controlName+")).perform(click());";
	}

	@Override
	public String longTap(String controlName) {
		return "onControl(withName("+controlName+")).perform(longClick());";
	}

	@Override
	public String doubleTap(String controlName) {
		return "onControl(withName("+controlName+")).perform(doubleClick());";
	}

	@Override
	public String typeText(String controlName, String textToType) {
		String controlNameAux = controlName.trim().toLowerCase().replaceAll("&", "");
		return "onControl(withTagValue(is("+controlNameAux.substring(0, 2).toUpperCase()+controlNameAux.substring(2, controlNameAux.length())+"))).perform(typeText("+textToType+"));";
	}

	@Override
	public String swipe(EnumSwipe swipe) {
		return "onControl(withResourceName(\"scrollViewLayoutContentScroll\")).perform("+swipe.toString()+"());";
	}

	@Override
	public String setDate(String controlName, String day, String month, String year) {
		String monthAux = month;
		if(Integer.parseInt(month.trim()) < 10 && month.trim().length() > 1)
		monthAux = month.substring(1, 2);
		return "onControl(withLabelCaption("+controlName+")).perform(click());\n" +
		"onControl(withResourceName(\"datePicker\")).perform(PickerActions.setDate("+year.trim()+","+monthAux.trim()+","+ day+"));\n" +
		"onControl(withResourceName(\"button1\")).perform(click());";
	}

	@Override
	public String setTime(String controlName, String hour, String minute) {
		return "onControl(withTagValue(is("+controlName+"))).perform(replaceText(\""+hour.trim()+":"+minute.trim()+":00\"));";
	}

}
