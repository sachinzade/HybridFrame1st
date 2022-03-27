package com.tests;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.AddUser;
import com.pages.DashbordPage;
import com.pages.LogInPage;
import com.pages.RegistrationPage;

public class LogintTest extends BaseClass {

	public LogInPage lp = null;
	public DashbordPage dp = null;
	public AddUser au = null;
	
	@BeforeSuite
	public void setUp()
	{
		intialization();
		lp = new LogInPage(driver);
		dp = new DashbordPage(driver);
		au = new AddUser(driver);
		
	}

	@Test(priority=1)
	public void logIn()
	{
		lp.validLogin();
		//String expected = "JavaByKiran | Dashboard";
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
	@Test(priority=2)
	public void dashPage()
	{
		boolean val = dp.verifyHeader();
		Assert.assertTrue(val);
	}	
	
	@Test(priority=3)
	public void checkUserBtn()
	{
		dp.clickUserBtn();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Add User");
	}
	
	@Test(priority=4)
	public void checkAddUser()
	{
		dp.clickUserBtn();
		au.addUserInfo();
		String alert = driver.switchTo().alert().getText();
		String actRsl = alert;
		driver.switchTo().alert().accept();
		String expRsl = "User Added Successfully. You can not see added user.";
		Assert.assertEquals(actRsl, expRsl);
	}
}
