package panel.ios;

import org.stringtemplate.v4.ST;

import abstractClasses.Navigate;
import models.Singleton;

public class NavigateIOS extends Navigate{

	@Override
	public String go(String panelName) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("IOS_GO"));
		c.add("panelName", panelName);
		String output = c.render();
		return output;
	}
	
}
