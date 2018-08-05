package abstractClasses;

import interfaces.PanelIteratesInterface;

public abstract class Iterate implements PanelIteratesInterface{
	public abstract String listTap(String controlName, String position);
	public abstract String listScroll(String controlName, String position);
}
