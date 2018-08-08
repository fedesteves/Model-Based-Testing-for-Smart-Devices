package constants;

import models.Singleton;

public class GeneralConstants {
	public static Singleton i = Singleton.getInstance();
	
	// Mensaje al terminar
	public static final String OUTPUT_SUCCESS = "EXITOSO";
	public static final String OUTPUT_FAILED = "FALLIDO";
	
	public static final String PROPERTIES_PATH = "config.properties";
	public static final String COMMAND_STRINGS_PATH = "config.commands";
	
	

	/************** ANDROID ***************************************
	 ****************************************************************
	 ***************************************************************/
	public static final String SUBDIR_GX_PROJECT_PATH = "\\mobile\\Android\\";
	public static final String GRADLE_PROPERTY_SDK_DIR = "sdk.dir";
	public static final String GRADLE_PROPERTY_FILE_NAME = "local.properties";
	public static final String GRADLE_BUILD_FILE_NAME = "build.gradle";
	public static final String TEST_NAME = "testOne";
	public static final String TEST_FILE_NAME = "UITests";
	public final static String ANDROID_RUNNER = ".test/android.support.test.runner.AndroidJUnitRunner";
	public static final String ADB_PATH = i.getAdbPath()+"\\platform-tools\\adb";
	public final static String ADB_INSTALL_APK_DEBUG = " install -r -t "+i.getProjectPath().getAndroid()+i.getMainObject()+"\\build\\outputs\\apk\\debug\\"+i.getMainObject()+"-debug.apk";
	public final static String ADB_INSTALL_APK_TEST = " install -r "+i.getProjectPath().getAndroid()+i.getMainObject()+"\\build\\outputs\\apk\\androidTest\\debug\\"+i.getMainObject()+"-debug-androidTest.apk";
	public final static String ADB_DEVICES = ADB_PATH+" devices";
	//public final static String ADB_RUN_CLASS = ADB_PATH+" shell am instrument -w -e class " + i.getPackageName().getAndroid()+ "." + i.getClassName() + " "+i.getPackageName().getAndroid()+ANDROID_RUNNER;
	public static final String GRADLE_PATH = i.getProjectPath().getAndroid();
	public final static String GRADLE = GRADLE_PATH+"gradlew.bat -p "+ i.getProjectPath().getAndroid() +" assembleAndroidTest";
	public final static String PATH_ANDROID = i.getProjectPath().getAndroid() + i.getMainObject() + "\\src\\androidTest\\java\\" + i.getPackageName().getAndroid().replaceAll("\\.", "\\\\")+"\\"
			+ i.getMainObject().toLowerCase()+"\\" +i.getMainObject()+TEST_FILE_NAME+".java";
	public final static String PATH_ANDROID_AUX = i.getProjectPath().getAndroid() + i.getMainObject() + "\\src\\androidTest\\java\\" + i.getPackageName().getAndroid().replaceAll("\\.", "\\\\")+"\\"
			+ i.getMainObject().toLowerCase();
	public final static String DEPENDENCY_ANDROID = "\n\tandroidTestImplementation (\'com.android.support.test.espresso:espresso-contrib:2.0\') {exclude module:\'support-annotations\'}\n";
	public final static String DEPENDENDY_ANDROID_SCREENSHOT = "\nandroidTestImplementation 'com.android.support.test.uiautomator:uiautomator-v18:2.1.2'\n";
	public final static String YES = "YES";
	public final static String NO = "NO";
	
	
	
	// Constantes al crear la clase .java
	public final static String ACTIVITY_RULE = "\t@Rule \n\tpublic GenexusActivityTestRule<Main> mActivityRule = new GenexusActivityTestRule<>(Main.class);";
	public final static String IMPORTS_ANDROID = 
			  "import org.junit.Test;\n"
			+ "import android.content.Intent;\n"
			+ "import android.support.test.espresso.contrib.PickerActions;\n"
			//+ "import android.support.test.espresso.contrib.RecyclerViewActions;\n"
			+ "import android.support.test.InstrumentationRegistry;\n"
			+ "import android.support.test.rule.ActivityTestRule;\n"
			+ "import org.junit.Rule;\n"
            + "import static android.support.test.espresso.Espresso.onView;\n"
            + "import static android.support.test.espresso.action.ViewActions.*;\n"
            + "import static android.support.test.espresso.matcher.ViewMatchers.*;\n"
			+ "import android.os.Environment;\n"
			+ "import android.support.test.InstrumentationRegistry;\n"
			//+ "import android.support.test.uiautomator.UiDevice;\n"
			+ "import static org.hamcrest.Matchers.is;\n"
			+ "import com.genexus.uitesting.rules.GenexusActivityTestRule;\n"
			+ "import static com.genexus.uitesting.matchers.Selectors.*;\n"
			+ "import static com.genexus.uitesting.matchers.ControlMatchers.*;\n"
			+ "import static com.genexus.uitesting.matchers.DataMatchers.*;\n"
			+ "import org.junit.Rule;\n"
			+ "import org.junit.rules.TestRule;\n"
			+ "import org.junit.rules.TestWatcher;\n"
			+ "import org.junit.runner.Description;\n"
			+ "import static android.support.test.espresso.assertion.ViewAssertions.*;\n\n\n";
	

	/* CABEZAL DE LA CLASE */
	public final static String TEST_HEADER_ANDROID = "package "+i.getPackageName().getAndroid()+ "." +i.getMainObject().toLowerCase()+";\n\n"
            + IMPORTS_ANDROID
			+ "public class "+i.getClassName()+"{\n\n"
			+ ACTIVITY_RULE;
	
	// ESTAS CONSTANTES SE ENCARGAN DE ESPACIOS, LINEAS, ETC
	public final static String TEST_HEADER_TOP = "\n\n\t@Test\n\tpublic void "+TEST_NAME;
	public final static String TEST_HEADER_BOT = "\n\t}\n\n}";
	public final static String TEST_HEADER_SEPARATOR = "(){\n";
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	/************** IOS ***************************************
	 ****************************************************************
	 ***************************************************************/
	public static final String GET_DEVICES_IOS = "xcrun simctl list";
	public static final String IOS_COMPILE = "xcodebuild -scheme \""+i.getMainObject()+"\" -destination generic/platform=\"iOS Simulator\" -configuration Debug build";
	
	public final static String PATH_IOS_DESTINATION = i.getMainObject()+TEST_FILE_NAME+".swift";
	
	
	public final static String TEST_HEADER_IOS = "import XCTest\n\nclass "+TEST_FILE_NAME+": XCTestCase { \n" +
												 "\n\toverride func setUp() {\n" +
												 "\t\tsuper.setUp()\n" +
												 "\t\tcontinueAfterFailure = false\n" +
												 "\t\tXCUIApplication().launch()\n" +
												 "\t}";
	public final static String TEST_TEAR_IOS = "\n\toverride func tearDown() {\n" +
										       "\t\tsuper.tearDown()\n\t}";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
