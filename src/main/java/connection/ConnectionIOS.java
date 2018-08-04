package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import constants.ErrorConstants;
import constants.GeneralConstants;
import models.Singleton;


public class ConnectionIOS {

	// Establece la conexion con el servidor y ejecuta comandos
	public static void connectToMac() throws Error {
		try {
			Session session;
			JSch jsch = new JSch();
			Properties prop = new Properties();
			prop.load(new FileInputStream(new File(GeneralConstants.PROPERTIES_PATH)));
			String username = prop.getProperty("IOS_USERNAME");
			String password = prop.getProperty("IOS_PASSWORD");
			String host = prop.getProperty("IOS_HOST");
			int port = Integer.parseInt(prop.getProperty("IOS_PORT"));
			
			session = jsch.getSession(username, host, port);
			session.setPassword(password);
			session.setConfig("StrictHostKeyChecking", "no");
			session.connect(Integer.parseInt(prop.getProperty("IOS_SESSION_TIMEOUT")));
			
			Singleton.getInstance().setSession(session);
		} catch (JSchException | IOException e) {
			throw new Error(ErrorConstants.CONNECTION);
		}
	}
	
	public static void disconnectMac() {
        Singleton.getInstance().getSession().disconnect();
	}
	
}