package models;
import java.util.ArrayList;
import java.util.Properties;

import com.jcraft.jsch.Session;

public class Singleton {
    private static Singleton instance = null;
	private String os;
	private AndroidIOS projectPath;
	private String packageName;
	private String className;
    private ArrayList<String> devicesList;
    private String adbPath;
    private boolean screenshot;
    private String mainObject;
    private Session session;
    private Properties stringCommands;


	protected Singleton() {
    	projectPath = new AndroidIOS("", "");
    	devicesList = new ArrayList<String>();
    }

    public static Singleton getInstance() {
		if(instance == null) {
		   instance = new Singleton();
		}
		return instance;
    }
   
	public void setDevicesList(ArrayList<String> devicesList) {
		this.devicesList = devicesList;
	}

	
	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public AndroidIOS getProjectPath() {
		return projectPath;
	}

	public void setProjectPath(AndroidIOS projectPath) {
		this.projectPath = projectPath;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public static void setInstance(Singleton instance) {
		Singleton.instance = instance;
	}

	public ArrayList<String> getDevicesList() {
		return devicesList;
	}

	public String getAdbPath() {
		return adbPath;
	}

	public void setAdbPath(String adbPath) {
		this.adbPath = adbPath;
	}

	public boolean isScreenshot() {
		return screenshot;
	}

	public void setScreenshot(boolean screenshot) {
		this.screenshot = screenshot;
	}

	public String getMainObject() {
		return mainObject;
	}

	public void setMainObject(String mainObject) {
		this.mainObject = mainObject;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Properties getStringCommands() {
		return stringCommands;
	}

	public void setStringCommands(Properties stringCommads) {
		this.stringCommands = stringCommads;
	}
	

}
