package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashbordPage 
{
	
	WebDriver dpdriver;
	
	public DashbordPage(WebDriver driver) 
	{
		this.dpdriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1")
	WebElement header;

	@FindBy(xpath = "//*[text()='Users']")
	WebElement user;

	@FindBy(xpath = "//*[text()='Add User']")
	WebElement addUser;

	public boolean verifyHeader() 
	{
		return header.isDisplayed();
	}
	
	public AddUser clickUserBtn() 
	{
		user.click();
		addUser.click();
		return new AddUser(dpdriver);
	}
	
	
	
}
