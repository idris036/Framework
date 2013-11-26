package com.actitime.module2;

import org.testng.annotations.Test;

import com.actitime.libraries.Config;
import com.actitime.libraries.ProjectSpecificLibrary;

public class At_CreateCustomerValid extends Config
{
	@Test
	public void testAt_CreateCustomerValid() throws Exception
	{
		ProjectSpecificLibrary.login("admin", "manager");
		Thread.sleep(5000);
		String expTitle = "actiTIME - Enter Time-Track";
		ProjectSpecificLibrary.verifyTitle(expTitle);
		ProjectSpecificLibrary.clickOnTaskTab();
		ProjectSpecificLibrary.clickOnProjectAndCustomer();
		ProjectSpecificLibrary.createNewCustomer();
		ProjectSpecificLibrary.enterCustDetails("CustomerA");
		String expText = "Customer \"CustomerA\" has been successfully created.";
		ProjectSpecificLibrary.verifySuccessText(expText);
		ProjectSpecificLibrary.logout();
		Thread.sleep(3000);
		ProjectSpecificLibrary.verifyTitle("actiTIME - Login");
	}
}
