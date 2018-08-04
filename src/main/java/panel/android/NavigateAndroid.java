package panel.android;

import abstractClasses.Navigate;

public class NavigateAndroid extends Navigate{

	@Override
	public String go(String panel) {
		return "onControl(withText("+panel+")).perform(click());";
	}
	
}
