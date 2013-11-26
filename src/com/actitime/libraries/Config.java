package com.actitime.libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Config 
{
	public static WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		String browserType = GenericLibrary.getCellValue("./Config.xlsx", "Sheet1", 0, 1);
		String url = GenericLibrary.getCellValue("./Config.xlsx", "Sheet1", 1, 1);
		
		if(browserType.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			Reporter.log("Opened in IE", true);
		}
		else if(browserType.equals("GC"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			Reporter.log("Opened in GC", true);
		}
		else
		{
			driver = new FirefoxDriver();
			Reporter.log("Opened in MFF", true);
		}
		
		driver.get(url);
		Reporter.log("Opening the app");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
		Reporter.log("Closing the app, browser", true);
	}
}
