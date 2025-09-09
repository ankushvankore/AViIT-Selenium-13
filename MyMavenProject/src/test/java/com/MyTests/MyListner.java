package com.MyTests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener
{
	public void onStart(ITestContext result)
	{
		System.out.println("Test Starts");
	}
	public void onFinish(ITestContext result)
	{
		System.out.println("Test Ends");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case fail: " + result.getName());
		System.out.println(result.getThrowable());
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test case skip: " + result.getName());
		System.out.println(result.getThrowable());
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test case started: " + result.getName());
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Pass: " + result.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
	}
}
