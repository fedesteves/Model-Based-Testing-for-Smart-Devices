package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.codehaus.plexus.util.FileUtils;
import constants.GeneralConstants;
import device.android.DeviceActionsAndroid;
import device.ios.DeviceActionsIOS;
import models.Singleton;
import constants.ErrorConstants;

public class FileHelper {

	public static void copyProjectGx(String projectPath, String objectMain) throws Error {
		FileHelper.copyProjectAndroid(projectPath+GeneralConstants.SUBDIR_GX_PROJECT_PATH, objectMain);
	}
	
	// Genera la clase .java que precisa Android
	@SuppressWarnings("resource")
	public static void createFileAndroid(String path, String generatedTest) throws Error {
		String textToWrite = GeneralConstants.TEST_HEADER_ANDROID;
		
		if(Singleton.getInstance().isScreenshot())
			textToWrite += new DeviceActionsAndroid().screenshot();
		
		textToWrite += 	GeneralConstants.TEST_HEADER_TOP + GeneralConstants.TEST_HEADER_SEPARATOR
						+ generatedTest
				        + GeneralConstants.TEST_HEADER_BOT;
		try {
			if (!existFile(path)){
				new File(path.substring(0, path.length()-(Singleton.getInstance().getMainObject().length())-(GeneralConstants.TEST_FILE_NAME.length())- 6)).mkdirs();
			}
			new FileOutputStream(new File(path)).write(textToWrite.getBytes());
		} catch (IOException e) {
			throw new Error(ErrorConstants.CREATE_FILE);
		}
	}

	@SuppressWarnings("resource")
	public static void createFileIOS(String path, String generatedTest) throws Error {
		String tear = GeneralConstants.TEST_TEAR_IOS;
		if(Singleton.getInstance().isScreenshot())
			tear = new DeviceActionsIOS().screenshot();
		String textToWrite = GeneralConstants.TEST_HEADER_IOS+tear+"\n\n\tfunc "+GeneralConstants.TEST_NAME+"(){\n"+generatedTest+"\n\t}\n}";
		try {
			if (!existFile(path)){
				new File(path).mkdirs();
			}
			new FileOutputStream(new File(path+GeneralConstants.PATH_IOS_DESTINATION)).write(textToWrite.getBytes());
		} catch (IOException e) {
			throw new Error(ErrorConstants.CREATE_FILE);
		}
	}

	// Recibe el path del Gradle a traves del properties
	public static String loadAndroidSdkPath(String projectPath) throws Error {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream(projectPath+"\\"+GeneralConstants.GRADLE_PROPERTY_FILE_NAME);
			prop.load(input);
			if(prop.getProperty(GeneralConstants.GRADLE_PROPERTY_SDK_DIR) == null)
				throw new Error(ErrorConstants.PROPERTY_SDK);
			return prop.getProperty(GeneralConstants.GRADLE_PROPERTY_SDK_DIR);
		} catch (IOException ex) {
			throw new Error(ErrorConstants.PROPERTY_NOT_FOUND);
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {}
			}
		}
	}
	
	// Se hace una copia del proyecto original Gx
	public static void copyProjectAndroid(String projectPath, String mainObjectName) throws Error {
		try {
			String current_dir = System.getProperty("user.dir");
			String dir_name = GeneralConstants.PATH_TO_COPY_PROJECT;
			String path = current_dir+"\\"+dir_name;
			if(existDir(path)) { 
				FileUtils.deleteDirectory(new File(path));
			}else {
				FileUtils.mkdir(path);
			}
			Copy.main(new String[] {"-r", projectPath, path});
			FileUtils.deleteDirectory(new File(path+"/build"));
			FileUtils.deleteDirectory(new File(path+"/.gradle"));
		} catch (IOException e) {
			throw new Error(ErrorConstants.PATH_NOT_FOUND);
		}
	}
	
	// Elimina el directorio de tests por si hay algun archivo corrupto
	public static void cleanTestDir() throws Error {
		if(existDir(GeneralConstants.PATH_ANDROID_AUX)) { 
			try {
				FileUtils.deleteDirectory(new File(GeneralConstants.PATH_ANDROID_AUX));
				new File(GeneralConstants.PATH_ANDROID_AUX).mkdirs();
			} catch (IOException e) {
				throw new Error(ErrorConstants.PATH_NOT_FOUND);
			}
		}
	}
	
	
	// Verifica que existe un archivo
	public static boolean existFile(String filePathString) {
		return (new File(filePathString).exists() && !new File(filePathString).isDirectory());
	}
	
	// Verifica si existe un directorio
	public static boolean existDir(String dirPathString){
		return (new File(dirPathString).exists() && new File(dirPathString).isDirectory());
	}
	
	public static void modifyBuildGradle() throws Error{
		try {
			Singleton i = Singleton.getInstance();
			String path = i.getProjectPath().getAndroid()+i.getMainObject()+"\\"+GeneralConstants.GRADLE_BUILD_FILE_NAME;		
			BufferedReader reader = new BufferedReader(new FileReader(path));
	        String line = "";
	        String newString = "";

			while((line = reader.readLine())!=null)
			{
				newString += line+"\n";
				if(line.contains("dependencies")){
					if(line.equals(GeneralConstants.DEPENDENCY_ANDROID) || line.equals(GeneralConstants.DEPENDENDY_ANDROID_SCREENSHOT))
						newString += "";
					else 
						newString = newString+GeneralConstants.DEPENDENCY_ANDROID; //+ GeneralConstants.DEPENDENDY_ANDROID_SCREENSHOT;
					
				}
			}
	        BufferedWriter erasor = new BufferedWriter(new FileWriter(path));
	        erasor.write(newString);
	        erasor.close();
	        reader.close();
			
		} catch (FileNotFoundException e) {
			throw new Error(ErrorConstants.PATH_NOT_FOUND);
		} catch (IOException e) {
			throw new Error(ErrorConstants.PATH_NOT_FOUND);
		}
	}
	
	
}
