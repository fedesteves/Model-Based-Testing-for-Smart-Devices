package panel.android;

import org.stringtemplate.v4.ST;

import abstractClasses.Navigate;
import models.Singleton;

public class NavigateAndroid extends Navigate{

	@Override
	public String go(String panel) {
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_GO"));
		c.add("panel", panel);
		String output = c.render();
		return output;
	}
	
}
