package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesUtils {

	public static FileInputStream fis = null;
	public static Properties prop = null;
	
	public static String readProperty(String key) 
	{
		prop = new Properties();
		
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
			prop.load(fis);
			
			} catch (Exception e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}//readProperties Ends
	
	 public static void main(String[] args) {
		System.out.println((System.getProperty("user.dir")+"/src/main/resources/config.properties"));
		 System.out.println(readProperty("browser"));
	}
}
