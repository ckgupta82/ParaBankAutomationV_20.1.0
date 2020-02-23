package com.parabank.qa.base;
/*
 * 
 * THis is Test Base Class
 * Author: CHetan Kumar
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.parabank.qa.util.TestUtil;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;
	String configPropertiesFilePath = System.getProperty("user.dir")+"\\src\\main\\java\\com\\parabank\\qa\\config\\config.properties";	
	public TestBase()
	{
		try 
		{	prop = new Properties();
		FileInputStream ip = new FileInputStream(configPropertiesFilePath);
		prop.load(ip);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public static void initialization()
	{

		if(prop.getProperty("brower").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(prop.getProperty("browser").equals("Chrome"))
		{
			System.getProperty("webdriver.chrome.driver",".\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("IE"))
		{
			System.getProperty("webdriver.IE.driver",".\\IEDriverServer\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(prop.getProperty("browser").equals("Edge"))
		{
			System.getProperty("webdriver.edge.driver",".\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUTS, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitWaitTime, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("BaseURL"));
	}
}
