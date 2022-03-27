package com.base;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;

import com.Utility.PropertiesUtils;

@Listeners(com.listeners.ListenrsEx.class)

public class BaseClass {
	
	public static WebDriver driver =null;
	
	public static Logger log = Logger.getLogger("BaseClass");
	
	public static void intialization()
	{
		log.info("reading properties file for browser name");
		String browser = PropertiesUtils.readProperty("browser");
		log.info(" browser found");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		log.info("intialize the chromebrowser");
		}//if ends
		
		if (browser.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}//if ends
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get(PropertiesUtils.readProperty("url"));
		log.info("url found");
		
	}//intialization ends
	

	public static void main(String[] args) 
	{
		intialization();
	}//main ends

}
