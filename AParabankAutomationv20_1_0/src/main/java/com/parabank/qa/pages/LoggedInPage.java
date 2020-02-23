package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.parabank.qa.base.TestBase;

public class LoggedInPage extends TestBase{


	@FindBy(xpath = "//a[contains(.,'Open New Account')]")
	WebElement OpenNewAccountLink;

	@FindBy(xpath = "//a[contains(.,'Accounts Overview')]")
	WebElement AccountsOverviewLink;

	@FindBy(xpath = "//a[contains(.,'Transfer Funds')]")
	WebElement TransferFundsLink;

	@FindBy(xpath = "//a[contains(.,'Bill Pay')]")
	WebElement BillPayLink;

	@FindBy(xpath = "//a[contains(.,'Find Transactions')]")
	WebElement FindTransactionsLink;

	@FindBy(xpath = "//a[contains(.,'Update Contact Info')]")
	WebElement UpdateContactInfoLink;

	@FindBy(xpath = "//a[contains(.,'Request Loan')]")
	WebElement RequestLoanLink;

	@FindBy(xpath = "//a[contains(.,'Log Out')]")
	WebElement LogOutLink;

	@FindBy(xpath = "//p[@class='smallText'][contains(.,'Welcome')]")
	WebElement LoggedInUserName;

	public LoggedInPage()
	{
		PageFactory.initElements(driver, this);
	}


	public OpenNewAccountPage clickOpenNewAccountLink()
	{
		OpenNewAccountLink.click();
		return new OpenNewAccountPage();
	}
	public LoggedInPage clickAccountsOverviewLink()
	{
		AccountsOverviewLink.click();
		return new LoggedInPage();
	}
	public TransferFundsPage clickTransferFundsLink()
	{
		TransferFundsLink.click();
		return new TransferFundsPage();
	}
	public BillPayPage clickBillPayLink()
	{
		BillPayLink.click();
		return new BillPayPage();
	}
	public FindTransactionsPage clickFindTransactionsLink()
	{
		FindTransactionsLink.click();
		return new FindTransactionsPage();
	}
	public UpdateContactInfoPage clickUpdateContactInfoLink()
	{
		UpdateContactInfoLink.click();
		return new UpdateContactInfoPage();
	}
	public RequestLoanPage clickRequestLoanLink()
	{
		RequestLoanLink.click();
		return new RequestLoanPage();
	}
	public HomePage clickLogOutLink()
	{
		LogOutLink.click();
		return new HomePage();
	}
	public String LoggedInUserNameText()
	{
		return LoggedInUserName.getText();

	}

}
