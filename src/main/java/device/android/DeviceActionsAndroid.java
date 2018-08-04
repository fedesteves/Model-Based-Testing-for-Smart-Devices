package device.android;

public class DeviceActionsAndroid implements interfaces.DeviceActionsInterface {

	@Override
	public String pressBack(){
		return "onView(isRoot()).perform(pressBack());";
	}
	
	@Override
	public String screenshot() {
		return "@Rule\n"
           + "public TestRule watcher = new TestWatcher() {\n"
	       +" \t@Override\n"
	       + "\tprotected void failed(Throwable e, Description description) {\n"
	       + "     \t\tsuper.failed(e, description);\n"
	       + "     \t\tFile path = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+\"MTDI\");\n"
	       + "     \t\tif (!path.exists()) {\n"
	       + "     \t\t\t    path.mkdirs();\n"
	       + "	   \t\t}\n"
	       + "     \t\tUiDevice device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());\n"
	       + "     \t\tString filename =  MTDI_Error\n"
	       + "     \t\tdevice.takeScreenshot(new File(path, filename));\n"
	       + "\t}"
	       + "};\n\n\n";
	}
	
}
