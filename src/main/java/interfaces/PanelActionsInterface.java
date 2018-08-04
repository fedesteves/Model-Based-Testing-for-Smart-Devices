package interfaces;

import enums.EnumSwipe;

public interface PanelActionsInterface {
	String tap(String view);
	String longTap(String view);
	String doubleTap(String view);
	String typeText(String view, String textToType);
	String swipe(EnumSwipe swipe);
	String setDate(String view, String day, String month, String year);
	String setTime(String view, String hour, String minute);
}
