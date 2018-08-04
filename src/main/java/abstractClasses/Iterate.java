package abstractClasses;

import interfaces.PanelIteratesInterface;

public abstract class Iterate implements PanelIteratesInterface{
	public abstract String listTap(String view, String position);
	public abstract String listScroll(String view, String position);
}
