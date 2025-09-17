package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class S06AutomationTest {
	WebDriver driver;
	
	//@Before
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	}
	//@After
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	@When("Enter valid name as {string}")
	public void enter_valid_name_as(String name) {
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
	}

	@When("Enter valid Emailid as {string}")
	public void enter_valid_emailid_as(String email) {
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	}

	@Then("Test ok")
	public void test_ok() {
	    System.out.println("Test Ok");
	}

	@When("Enter invalid name as {string}")
	public void enter_invalid_name_as(String name) {
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
	}

	@When("Enter invalid Emailid as {string}")
	public void enter_invalid_emailid_as(String email) {
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	}

	@Then("Test fail")
	public void test_fail() {
	    System.out.println("Test Fail");
	}
}
