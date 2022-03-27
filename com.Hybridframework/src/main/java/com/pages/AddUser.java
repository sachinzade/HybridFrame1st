package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUser {
	
	WebDriver audriver;
	
	public AddUser(WebDriver driver) 
	{
		this.audriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	WebElement userName;

	@FindBy(id = "mobile")
	WebElement mobileNumber;

	@FindBy(id = "email")
	WebElement emailId;

	@FindBy(id = "course")
	WebElement CourseNmae;

	@FindBy(id = "Male")
	WebElement gender;

	@FindBy(xpath = "//select[contains(@class, 'form-control')]")
	WebElement state;

	@FindBy(id = "password")
	WebElement pass;

	@FindBy(xpath = "//*[contains(@placeholder, 'FriendMobile')]")
	WebElement friendMobile;

	@FindBy(id = "submit")
	WebElement submit;
	
	public void addUserInfo() 
	{
		userName.sendKeys("Sachin Zade");
		mobileNumber.sendKeys("8308559493");
		emailId.sendKeys("szade50@gmail.com");
		CourseNmae.sendKeys("Selenium");
		gender.click();
		Select s = new Select(state);
		s.selectByVisibleText("Maharashtra");
		pass.sendKeys("123456");
		friendMobile.sendKeys("9405779493");
		submit.click();
	}
	
}
