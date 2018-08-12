package device.android;

import org.stringtemplate.v4.ST;

import models.Singleton;

public class DeviceActionsAndroid implements interfaces.DeviceActionsInterface {

	@Override
	public String pressBack(){
		ST c = new ST(Singleton.getInstance().getStringCommands().getProperty("ANDROID_PRESSBACK"));
		return c.render();
	}
	
	@Override
	public String screenshot() {
		return "\t@Rule\n\tpublic final GrantPermissionRule mGrantPermissionRule = GrantPermissionRule.grant(READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE);\n"
				+"\t@Rule\n\tpublic final TestListener listener = new TestListener();"
				
				+"\n\tclass TestListener extends TestWatcher{\n"
			   +"\t@Override\n"
			   +"\tprotected void failed(Throwable e, Description description) {\n"
			   +"\t\tScreenCapture screen = Screenshot.capture();\n"
			   +"\t\tscreen.setFormat(Bitmap.CompressFormat.PNG);\n"
			   +"\t\tscreen.setName(\"MTDI-screenshotError\");\n"
			   +"\t\ttry {\n"
			   +"\t\t\tscreen.process();\n"
			   +"\t\t} catch (IOException ex) {\n"
			   +"\t\t\tthrow new IllegalStateException(ex);\n"
			   +"\t\t}\n"
			   +"\t\t\tsuper.failed(e, description);\n"
			   +"\t\t}\n"
			   +"\t}\n";
	}
	
}
