package abstractClasses;

import interfaces.PanelIteratesInterface;

public abstract class Iterate implements PanelIteratesInterface{
	public abstract String listTap(String position);
	public abstract String listScroll(String position);
	
	public abstract String listInsert();
	public abstract String listSave();
	public abstract String listCancel();
	public abstract String listSearch(String text);
	public abstract String listDelete(String position);
	public abstract String listUpdate(String position);
	
}
