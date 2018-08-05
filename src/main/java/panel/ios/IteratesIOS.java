package panel.ios;

import org.stringtemplate.v4.ST;

import abstractClasses.Iterate;
import models.Singleton;

public class IteratesIOS extends Iterate {

	@Override
	public String listTap(String controlName, String position) {// FALTA
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_LISTTAP"));
		c.add("controlName", controlName.toLowerCase());
		c.add("position", position);
		String output = c.render();
		return output;
	}

	@Override
	public String listScroll(String controlName, String position) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_SCROLLTAP"));
		c.add("controlName", controlName.toLowerCase());
		c.add("position", position);
		String output = c.render();
		return output;
	}

}
