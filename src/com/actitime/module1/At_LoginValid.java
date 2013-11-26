package com.actitime.module1;

import org.testng.annotations.Test;

import com.actitime.libraries.Config;
import com.actitime.libraries.ProjectSpecificLibrary;

public class At_LoginValid extends Config
{
	@Test
	public void testAt_LoginValid() throws Exception
	{
		ProjectSpecificLibrary.login("admin", "manager");
		Thread.sleep(5000);
		String expTitle = "actiTIME - Enter Time-Track";
		ProjectSpecificLibrary.verifyTitle(expTitle);
		ProjectSpecificLibrary.logout();
		ProjectSpecificLibrary.verifyTitle("actiTIME - Login");
	}
}
