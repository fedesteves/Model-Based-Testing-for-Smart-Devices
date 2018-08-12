package abstractClasses;

import interfaces.PanelNavigateInterface;

public abstract class Navigate implements PanelNavigateInterface{
	public abstract String go(String panelName);
}
