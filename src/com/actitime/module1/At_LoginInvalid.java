package com.actitime.module1;

import org.testng.annotations.Test;

import com.actitime.libraries.Config;
import com.actitime.libraries.ProjectSpecificLibrary;

public class At_LoginInvalid extends Config
{
	@Test
	public void testAt_LoginInvalid() throws Exception
	{
		ProjectSpecificLibrary.login("", "a");
		Thread.sleep(3000);
		String expText = "Username or Password is invalid. Please try again.";
		ProjectSpecificLibrary.verifyErrorText(expText);		
	}
}
