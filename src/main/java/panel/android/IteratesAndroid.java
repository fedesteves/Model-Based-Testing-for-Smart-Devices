package panel.android;

import org.stringtemplate.v4.ST;

import abstractClasses.Iterate;
import models.Singleton;

public class IteratesAndroid extends Iterate {

	@Override
	public String listTap(String view, String position) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_LISTTAP"));
		c.add("view", view);
		c.add("position", position);
		String output = c.render();
		return output;
	}

	@Override
	public String listScroll(String view, String position) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_SCROLLTAP"));
		c.add("view", view);
		c.add("position", position);
		String output = c.render();
		return output;
	}

}
