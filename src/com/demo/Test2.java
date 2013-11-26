package com.demo;

	import org.testng.Reporter;
	import org.testng.annotations.Test;

	import com.actitime.libraries.Config;

	public class Test2 extends Config 
	{
		@Test
		public void testTest1()
		{
			Reporter.log("Running testTest1");
		}
		@Test
		public void testTest2()
		{
			Reporter.log("Running testTest2");
			Reporter.log("Hello");
		}
	}
