package panel.ios;

import org.stringtemplate.v4.ST;

import abstractClasses.Iterate;
import models.Singleton;

public class IteratesIOS extends Iterate {

	@Override
	public String listTap(String position) {// FALTA
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_LISTTAP"));
		c.add("position", position);
		String output = c.render();
		return output;
	}

	@Override
	public String listScroll(String position) {
		return "";
	}

	@Override
	public String listInsert() {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_LISTINSERT"));
		String output = c.render();
		return output;
	}

	@Override
	public String listSave() {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_LISTSAVE"));
		String output = c.render();
		return output;
	}

	@Override
	public String listCancel() {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_LISTCANCEL"));
		String output = c.render();
		return output;
	}

	@Override
	public String listSearch(String text) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_LISTSEARCH"));
		c.add("text", text);
		String output = c.render();
		return output;
	}

	@Override
	public String listDelete(String position) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_LISTDELETE"));
		c.add("position", position);
		String output = c.render();
		return output;
	}

	@Override
	public String listUpdate(String position) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_LISTUPDATE"));
		c.add("position", position);
		String output = c.render();
		return output;
	}

}
