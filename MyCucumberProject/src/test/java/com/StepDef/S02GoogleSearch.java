package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S02GoogleSearch {
	WebDriver driver;
	@Given("Launch Google")
	public void launch_google() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://google.com");
	}

	@When("Enter keyword to search")
	public void enter_keyword_to_search() {
	    driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
	}

	@When("Hit enter key")
	public void hit_enter_key() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("Valid search should display")
	public void valid_search_should_display() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("Selenium"));
	}
}
