package panel.android;

import abstractClasses.Iterate;

public class IteratesAndroid extends Iterate {

	@Override
	public String listTap(String view, String position) {
		return "onView(withId(\""+view+"\")).perform(RecyclerViewActions.actionOnItemAtPosition("+position+", click()));";
	}

	@Override
	public String listScroll(String view, String position) {
		return "onView(withId(\""+view+"\")).perform(RecyclerViewActions.scrollToPosition("+position+"));";
	}

}
