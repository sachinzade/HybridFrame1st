package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage 
{
	WebDriver rpdriver;

	public RegistrationPage(WebDriver driver) 
	{
		this.rpdriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "name")
	WebElement name;

	@FindBy(id = "mobile")
	WebElement mobile;

	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "password")
	WebElement pass;

	@FindBy(xpath = "//*[text()='Sign In']")
	WebElement signInBtn;
	
	public void registration() 
	{
		name.sendKeys("Sachin Zade");
		mobile.sendKeys("9405779493");
		email.sendKeys("szade50@gmail.com");
		pass.sendKeys("123456");
		signInBtn.click();
	}
}
