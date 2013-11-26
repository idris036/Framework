package com.actitime.assertions;

import junit.framework.Assert;

import org.testng.Reporter;



public class Assertions 
{
	public static void assertTitle(String expected, String actual)
	{
		Assert.assertEquals(expected, actual);
		Reporter.log("Expected title "+expected+" matches with "+actual+" actual title");
	}
	public static void assertText(String expected, String actual)
	{
		Assert.assertEquals(expected, actual);
		Reporter.log("Expected text "+expected+" matches with "+actual+" actual text");
	}
}
