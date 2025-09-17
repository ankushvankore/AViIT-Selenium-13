package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D08DependsOnDemo {
	@Test
	public void login() {
		System.out.println("Login Test");
		//Assert.assertFalse(true);
	}
	@Test(dependsOnMethods = "login")
	public void logout() {
		System.out.println("Logout Test");
	}
}
