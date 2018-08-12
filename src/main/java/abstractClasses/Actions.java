package abstractClasses;

import enums.EnumSwipe;
import interfaces.PanelActionsInterface;

public abstract class Actions implements PanelActionsInterface{
	public abstract String tap(String controlName);
	public abstract String longTap(String controlName);
	public abstract String doubleTap(String controlName);
	public abstract String typeText(String viecontrolNamew, String textToWrite);
	public abstract String swipe(EnumSwipe swipe);
	public abstract String setDate(String controlName, String day, String month, String year);
	public abstract String setTime(String controlName, String hour, String minute);
}
