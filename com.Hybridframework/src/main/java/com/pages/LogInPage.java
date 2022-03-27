package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	WebDriver lpdriver;
	
	public LogInPage(WebDriver driver) 
	{
		this.lpdriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement loginBttn ;
	
	@FindBy(xpath="//*[text()='Register a new membership']")
	WebElement register;
	
	public RegistrationPage signIn() 
	{
		register.click();
		return new RegistrationPage(lpdriver);
		
	}
	
	public void logIn(String uname, String pass) 
	{
		userName.sendKeys(uname);
		password.sendKeys(pass);
		loginBttn.click();
	}
	
	public DashbordPage validLogin() 
	{

		userName.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginBttn.click();
		return new DashbordPage(lpdriver);
		
	}
	
	
}
