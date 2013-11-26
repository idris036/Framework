package com.actitime.libraries;

import org.openqa.selenium.By;

import com.actitime.assertions.Assertions;

public class ProjectSpecificLibrary extends Config
{
	public static void login(String username, String pwd)
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
	}
	
	public static void logout()
	{
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	}
	
	public static void verifyTitle(String expTitle)
	{
		String actTitle = driver.getTitle();
		Assertions.assertTitle(expTitle, actTitle);
	}
	
	public static void clickOnTaskTab()
	{
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
	}
	
	public static void clickOnProjectAndCustomer()
	{
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
	}
	
	public static void createNewCustomer()
	{
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	}
	
	public static void enterCustDetails(String custName)
	{
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(custName);
		driver.findElement(By.name("createCustomerSubmit")).click();
	}
	
	public static void verifyErrorText(String expText)
	{
		String actText = driver.findElement(By.className("errormsg")).getText();
		Assertions.assertText(expText, actText);
	}
	
	public static void verifySuccessText(String expText)
	{
		String actText = driver.findElement(By.className("successmsg")).getText();
		Assertions.assertText(expText, actText);
	}
	
}
