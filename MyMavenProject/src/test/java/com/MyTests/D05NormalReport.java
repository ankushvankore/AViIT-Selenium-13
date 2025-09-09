package com.MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D05NormalReport {

	public static void main(String[] args) {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("Reports/NormalReport.html");
		//The html file that contains the report
		ExtentReports report = new ExtentReports();
		//This object represents the report
		report.attachReporter(htmlReport);
		//Store this report in the html file
		ExtentTest test;
		
		//Environment Configuration
		report.setSystemInfo("User Name: ", "Kajal");
		report.setSystemInfo("Address", "Pune");
		report.setSystemInfo("Machine", "Dell");
		report.setSystemInfo("OS", "Windows 11");
		report.setSystemInfo("Browser", "Chrome");
		
		//Look and feel about the report
		htmlReport.config().setDocumentTitle("My First Extent Report");
		htmlReport.config().setReportName("Google Test");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("dd-MMM-yyyy");
		
		test = report.createTest("Google Title Test");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		System.out.println("Title: " + driver.getTitle());

		driver.close();
		
		test.log(Status.PASS, MarkupHelper.createLabel("Title Test", ExtentColor.GREEN));
		
		test = report.createTest("Google Search Test");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Maven", Keys.ENTER);

		driver.close();
		
		test.log(Status.FAIL, MarkupHelper.createLabel("Search Test", ExtentColor.RED));
		
		report.flush();		
		//will generate the report
	}

}
