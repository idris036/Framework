package com.actitime.module2;

import org.testng.annotations.Test;

import com.actitime.libraries.Config;
import com.actitime.libraries.ProjectSpecificLibrary;

public class At_CreateCustomer_Invalid extends Config
{
	@Test
	public void testAt_CreateCustomer_Invalid() throws Exception
	{
		ProjectSpecificLibrary.login("admin", "manager");
		Thread.sleep(5000);
		String expTitle = "actiTIME - Enter Time-Track";
		ProjectSpecificLibrary.verifyTitle(expTitle);
		ProjectSpecificLibrary.clickOnTaskTab();
		ProjectSpecificLibrary.clickOnProjectAndCustomer();
		ProjectSpecificLibrary.createNewCustomer();
		ProjectSpecificLibrary.enterCustDetails("");
		ProjectSpecificLibrary.verifyErrorText("All fields marked with * must be filled in. Please specify: Customer Name.");
		ProjectSpecificLibrary.logout();	
		
	}
}
