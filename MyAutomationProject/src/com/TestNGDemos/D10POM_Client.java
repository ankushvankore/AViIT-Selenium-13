package com.TestNGDemos;

import org.testng.annotations.Test;

import graphql.Assert;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class D10POM_Client {
	WebDriver driver;
	RediffUtility r1;
	@Test
	public void rediffRegistration1() {
		r1.setFullName("Kajal Barne");
		r1.setRediffId("Kajal");
		r1.setPassword("kajal@123");
		r1.setBirthDate("24", "NOV", "2000");
		Assert.assertTrue(r1.checkAvailablity().contains("Yippie"));
	}
	
	@Test
	public void rediffRegistration2()
	{
		r1.setFullName("Ankush");
		r1.setRediffId("ankushvankore2025");
		r1.setPassword("Ankush@123");
		r1.setBirthDate("29", "JAN", "1979");
		Assert.assertTrue(r1.checkAvailablity().contains("Yippie"));
	}

	@BeforeMethod
	public void clearData() {
		driver.navigate().refresh();
	}
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		r1 = new RediffUtility(driver);
	}

	@AfterTest
	public void afterTest() {
	}

}
