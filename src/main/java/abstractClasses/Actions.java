package abstractClasses;

import enums.EnumSwipe;
import interfaces.PanelActionsInterface;

public abstract class Actions implements PanelActionsInterface{
	public abstract String tap(String view);
	public abstract String longTap(String view);
	public abstract String doubleTap(String view);
	public abstract String typeText(String view, String textToWrite);
	public abstract String swipe(EnumSwipe swipe);
	public abstract String setDate(String view, String day, String month, String year);
	public abstract String setTime(String view, String hour, String minute);
}
