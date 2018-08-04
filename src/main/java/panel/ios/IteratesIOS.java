package panel.ios;

import org.stringtemplate.v4.ST;

import abstractClasses.Iterate;
import models.Singleton;

public class IteratesIOS extends Iterate {

	@Override
	public String listTap(String view, String position) {// FALTA
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_LISTTAP"));
		String output = c.render();
		return output;
	}

	@Override
	public String listScroll(String view, String position) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_SCROLLTAP"));
		String output = c.render();
		return output;
	}

}
