package com.parabank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.pages.HomePage;
import com.parabank.qa.pages.LoggedInPage;
import com.parabank.qa.pages.OpenNewAccountPage;

public class LoggedInPageTest extends TestBase{

	HomePage hpg;
	LoggedInPage lpt;
	OpenNewAccountPage opna;

	public LoggedInPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		TestBase.initialization();
		hpg = new HomePage();
		lpt = new LoggedInPage();
		opna = new OpenNewAccountPage();
		lpt = hpg.loginFunction("Chetan82", "111111");
	}

	@Test
	public void VerifyLoggedInUserName()
	{
		opna = lpt.clickOpenNewAccountLink();
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
