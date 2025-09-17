package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S05AmazonLinks {
	WebDriver driver;
	
	@Given("Launch {string}")
	public void launch(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		
		//driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div/div/span/span/button"));
	}

	@When("Click on Sell Link")
	public void click_on_sell_link() {
	    driver.findElement(By.linkText("Sell")).click();
	}

	@Then("Sell page should display")
	public void sell_page_should_display() {
	    System.out.println("Title: " + driver.getTitle());
	}

	@When("Click on Best Sellers Link")
	public void click_on_best_sellers_link() {
		driver.findElement(By.linkText("Bestsellers")).click();
	}

	@Then("Best Sellers page should display")
	public void best_sellers_page_should_display() {
		System.out.println("Title: " + driver.getTitle());
	}

	@When("Click on Mobiles Link")
	public void click_on_mobiles_link() {
		driver.findElement(By.linkText("Mobiles")).click();
	}

	@Then("Mobiles page should display")
	public void mobiles_page_should_display() {
		System.out.println("Title: " + driver.getTitle());
	}

	@When("Click on Electronics Link")
	public void click_on_electronics_link() {
		driver.findElement(By.linkText("Electronics")).click();
	}

	@Then("Electronics page should display")
	public void electronics_page_should_display() {
		System.out.println("Title: " + driver.getTitle());
	}

}
