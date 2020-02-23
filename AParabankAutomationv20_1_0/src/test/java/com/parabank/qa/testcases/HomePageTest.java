package com.parabank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.pages.ForgotPasswordPage;
import com.parabank.qa.pages.HomePage;
import com.parabank.qa.pages.LoggedInPage;
import com.parabank.qa.pages.RegisterPage;
import com.parabank.qa.util.TestUtil;

public class HomePageTest extends TestBase{

	HomePage hp;
	LoggedInPage lp;
	ForgotPasswordPage fp;
	RegisterPage rg;
	

	public HomePageTest()
	{
		super();
	}


	@BeforeMethod
	public void setup()
	{
		TestBase.initialization();
		hp = new HomePage();
		lp = new LoggedInPage();
		fp = new ForgotPasswordPage();
		rg = new RegisterPage();
	}

	@Test
	public void VerifyLoginFunctionality() throws Exception
	{
		String uname = TestUtil.getCellData(prop.getProperty("TestDataFilePath"), prop.getProperty("LoginDataSheet"), 1, 0);
		String pword = TestUtil.getCellData(prop.getProperty("TestDataFilePath"), prop.getProperty("LoginDataSheet"), 1, 1);
		lp = hp.loginFunction(uname, pword);
		String liun = lp.LoggedInUserNameText();
		Assert.assertEquals(liun, "Welcome Chetan Kumar");
	}
	@Test
	public void VerifyForgotPasswordLink()
	{
		fp = hp.clickForgotPasswordLink();
	}
	@Test
	public void VerifyRegisterLink()
	{
		rg = hp.clickRegisterLink();
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
