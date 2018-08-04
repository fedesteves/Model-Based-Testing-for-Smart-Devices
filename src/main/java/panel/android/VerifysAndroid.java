package panel.android;

import abstractClasses.Verify;

public class VerifysAndroid extends Verify {
	
	@Override
	public String verifyText(String controlName, String textToCheck) {
		String controlNameAux = controlName.trim().toLowerCase().replaceAll("&", "");
		return "onControl(withTagValue(is("+controlNameAux.substring(0, 2).toUpperCase()+controlNameAux.substring(2, controlNameAux.length())+"))).check(matches(withText("+textToCheck+")));";
	}

	@Override
	public String isDisplayed(String controlName) {
		return "onControl(withName("+controlName+")).check(matches(isDisplayed()));";
	}

	@Override
	public String isCompletelyDisplayed(String controlName) {
		return "onControl(withName("+controlName+")).check(matches(isCompletelyDisplayed()));";
	}

	@Override
	public String hasFocus(String controlName) {
		return "onControl(withName("+controlName+")).check(matches(hasFocus()));";
	}

	@Override
	public String isEnabled(String controlName) {
		return "onControl(withName("+controlName+")).check(matches(isEnabled()));";
	}

	@Override
	public String isClickable(String controlName) {
		return "onControl(withName("+controlName+")).check(matches(isClickable()));";
	}

}
