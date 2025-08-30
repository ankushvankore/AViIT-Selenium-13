package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class RediffUtility {
	WebDriver driver;
	
	@FindBy (xpath = "//input[@placeholder='Enter your full name']")WebElement fullName;
	@FindBys({@FindBy(css = "input[id^=\"login\"]"),
		@FindBy(xpath = "//input[@placeholder=\"Enter Rediffmail ID\"]")})WebElement rediffId;
	
	public RediffUtility(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
	}

	public void setFullName(String fn) {
		//driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(fn);
		fullName.sendKeys(fn);
	}
	public void setRediffId(String rid) {
		//driver.findElement(By.xpath("//input[@placeholder=\"Enter Rediffmail ID\"]")).sendKeys(rid);
		rediffId.sendKeys(rid);
	}
	public void setPassword(String ps) {
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys(ps);
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys(ps);
	}
	public void setBirthDate(String day, String month, String year)
	{
		new Select(driver.findElement(By.xpath("//select[contains(@name, \"DOB_Day\")]"))).selectByVisibleText(day);
		new Select(driver.findElement(By.xpath("//select[contains(@name, \"DOB_Month\")]"))).selectByVisibleText(month);
		new Select(driver.findElement(By.xpath("//select[contains(@name, \"DOB_Year\")]"))).selectByVisibleText(year);
	}
	/*public void checkAvailablity() {
		driver.findElement(By.xpath("//input[contains(@name, \"btnchkavail\")]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"check_availability\"]/div/span")).getText());
	}*/
	public String checkAvailablity() {
		driver.findElement(By.xpath("//input[contains(@name, \"btnchkavail\")]")).click();
		return driver.findElement(By.xpath("//*[@id=\"check_availability\"]/div/span")).getText();
	}
}
