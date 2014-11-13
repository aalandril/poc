package ui.swing.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtils {
	private final static String PROPERTIES_FILE = "config.properties";
	public static Properties loadProperties() {
		Properties props = new Properties();
		try {
			InputStream input = PropertyUtils.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE); //new FileInputStream(PROPERTIES_FILE);
			props.load(input);
		} catch (FileNotFoundException fnfe) {
			// ignore, returning an empty properties object
		} catch (IOException ioe) {
			// ignore, returning an empty properties object
		}
		return props;
	}
}
