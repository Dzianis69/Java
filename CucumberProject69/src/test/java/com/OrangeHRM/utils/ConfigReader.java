package com.OrangeHRM.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static Properties prop;

	public static Properties readProperty(String filePath) {

		 try {
	            prop = new Properties();
	            FileInputStream fis = new FileInputStream(ConstantReader.PROPERTIES_FILE_PATH);
	            prop.load(fis);
	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return prop;
	    }
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}
