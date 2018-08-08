package panel.android;

import org.stringtemplate.v4.ST;

import abstractClasses.Iterate;
import models.Singleton;

public class IteratesAndroid extends Iterate {

	@Override
	public String listTap(String position) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_LISTTAP"));
		c.add("position", position);
		String output = c.render();
		return output;
	}

	@Override
	public String listScroll(String position) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_LISTSCROLL"));
		c.add("position", position);
		String output = c.render();
		return output;
	}
	
	public String listInsert() {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_LISTINSERT"));
		String output = c.render();
		return output;
	}
	
	public String listSave() {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_LISTSAVE"));
		String output = c.render();
		return output;
	}
	
	public String listCancel() {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_LISTCANCEL"));
		String output = c.render();
		return output;
	}
	
	public String listSearch(String text) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_LISTSEARCH"));
		c.add("text", text);
		String output = c.render();
		return output;
	}
	
	public String listDelete(String position) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_LISTDELETE"));
		c.add("position", position);
		String output = c.render();
		return output;
	}
	
	public String listUpdate(String position) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_LISTUPDATE"));
		c.add("position", position);
		String output = c.render();
		return output;
	}

}
