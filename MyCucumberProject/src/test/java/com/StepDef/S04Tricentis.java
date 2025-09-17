package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class S04Tricentis {
	WebDriver driver;
	@Given("Open Tricentis Application")
	public void open_tricentis_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://sampleapp.tricentis.com/101/index.php");
	}

	@When("Click on Automobile Link")
	public void click_on_automobile_link() {
	    driver.findElement(By.partialLinkText("Auto")).click();
	}

	@When("Select Make as {string}")
	public void select_make_as(String make) {
	    new Select(driver.findElement(By.id("make"))).selectByContainsVisibleText(make);
	}

	@When("Enter Engine Performance as {string}")
	public void enter_engine_performance_as(String ep) {
	    driver.findElement(By.id("engineperformance")).sendKeys(ep);
	}

	@When("Enter Date of Manufacture as {string}")
	public void enter_date_of_manufacture_as(String date) {
	    driver.findElement(By.id("dateofmanufacture")).sendKeys(date);
	}

	@Then("Process should complete")
	public void process_should_complete() {
	    System.out.println("Thanks for registration!!!");
	}

	@When("Click on Truck Link")
	public void click_on_truck_link() {
	    driver.findElement(By.linkText("Truck")).click();
	}

	@When("Select No of Seats as {string}")
	public void select_no_of_seats_as(String seats) {
	    new Select(driver.findElement(By.id("numberofseats"))).selectByContainsVisibleText(seats);
	}

	@When("Select Fuel type {string}")
	public void select_fuel_type(String ft) {
		new Select(driver.findElement(By.id("fuel"))).selectByContainsVisibleText(ft);
	}

	@When("Enter payload as {string}")
	public void enter_payload_as(String pl) {
	    driver.findElement(By.id("payload")).sendKeys(pl);
	}

	@Then("Process should incomplete")
	public void process_should_incomplete() {
	    System.out.println("Sorry for invoncinence.");
	}
}
