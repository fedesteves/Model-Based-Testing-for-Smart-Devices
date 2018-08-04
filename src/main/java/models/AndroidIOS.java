package models;

// Clase para guardar valores dependiendo el OS
public class AndroidIOS {
	private String androidValue;
	private String iosValue;
	
	
	public AndroidIOS(String androidValue, String iosValue) {
		super();
		this.androidValue = androidValue;
		this.iosValue = iosValue;
	}

	public String getAndroid() {
		return androidValue;
	}

	public void setAndroidValue(String androidValue) {
		this.androidValue = androidValue;
	}

	public String getIOS() {
		return iosValue;
	}

	public void setIosValue(String iosValue) {
		this.iosValue = iosValue;
	}
	
	
	

}
