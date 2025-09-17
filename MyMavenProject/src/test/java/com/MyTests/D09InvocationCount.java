package com.MyTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D09InvocationCount {
	@Test (dataProvider = "getData")
	public void myTest(String d) {
		System.out.println("This is MyTest!!!");
	}
	
	@Test(invocationCount = 5)
	public void mySecondTest()
	{
		System.out.println("This is my Second Test");
	}
	
	@DataProvider
	public String[][]getData()
	{
		return new String[][] {
			new String[] {"One"},
			new String[] {"Two"},
			new String[] {"Three"},
			new String[] {"Four"},
			new String[] {"Five"},
			};
		}
	
}
