package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S08RediffRegistration {
	WebDriver driver;
	
	@Given("Launch rediff registration page")
	public void launch_rediff_registration_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@When("I Enter fullName {string}")
	public void i_enter_full_name(String fullName) {
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input")).sendKeys(fullName);
	}

	@When("I enter rediffid {string}")
	public void i_enter_rediffid(String id) {
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[3]/div/input")).sendKeys(id);
	}

	@When("I enter {string} and confirmPassword")
	public void i_enter_and_confirm_password(String ps) {
	    driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys(ps);
	    driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys(ps);
	}

	@When("Click on Check Availablity button")
	public void click_on_check_availablity_button() {
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[4]/input")).click();
	}

	@Then("Message should display")
	public void message_should_display() {
	   System.out.println("Message: " + driver.findElement(By.xpath("//*[@id=\"check_availability\"]/div/span")).getText());
	}
}
