package com.MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;

@Listeners(com.MyTests.MyListner.class)
public class D07MyTest {
	@Test
	public void test1() {
		System.out.println("Test 1");
		Assert.assertTrue(true);
	}
	@Test
	public void test2() {
		System.out.println("Test 2");
		Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("Test 3");
		throw new SkipException("Test for skip");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

}
