package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath = "//input[contains(@name,'username')]")
	WebElement userName;

	@FindBy(xpath = "//input[contains(@name,'password')]")
	WebElement passWord;

	@FindBy(xpath = "//input[contains(@value,'Log In')]")
	WebElement loginBtn;

	@FindBy(xpath = "//a[contains(.,'Forgot login info?')]")
	WebElement forgotPasswordLink;

	@FindBy(xpath = "//a[contains(.,'Register')]")
	WebElement registerLink;

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}

	public LoggedInPage loginFunction(String uname,String pword)
	{
		userName.sendKeys(uname);
		passWord.sendKeys(pword);
		loginBtn.click();
		return new LoggedInPage();
	}

	public ForgotPasswordPage clickForgotPasswordLink()
	{
		forgotPasswordLink.click();
		return new ForgotPasswordPage();
	}
	public RegisterPage clickRegisterLink()
	{
		registerLink.click();
		return new RegisterPage();
	}
}
