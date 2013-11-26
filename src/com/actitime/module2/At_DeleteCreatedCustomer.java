package com.actitime.module2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.libraries.Config;
import com.actitime.libraries.ProjectSpecificLibrary;

public class At_DeleteCreatedCustomer extends Config
{
	@Test
	public void testAt_DeleteCreatedCustomer() throws Exception
	{
		ProjectSpecificLibrary.login("admin", "manager");
		Thread.sleep(5000);
		String expTitle = "actiTIME - Enter Time-Track";
		ProjectSpecificLibrary.verifyTitle(expTitle);
		ProjectSpecificLibrary.clickOnTaskTab();
		ProjectSpecificLibrary.clickOnProjectAndCustomer();
		//Select and delete customer created
		driver.findElement(By.xpath("//a[text()='CustomerA']")).click();
		driver.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
		driver.findElement(By.id("deleteButton")).click();
		ProjectSpecificLibrary.verifySuccessText("Customer has been successfully deleted.");
		ProjectSpecificLibrary.logout();
		Thread.sleep(3000);
		ProjectSpecificLibrary.verifyTitle("actiTIME - Login");		
	}
}
