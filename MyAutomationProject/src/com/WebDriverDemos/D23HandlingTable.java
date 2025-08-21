package com.WebDriverDemos;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D23HandlingTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement>headers = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		
		for(WebElement h : headers)
			System.out.println(h.getText());
		
		List<WebElement>rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("Total Rows: " + rows.size());
		
		Random rnd = new Random();
		int n = rnd.nextInt(rows.size());
		
		System.out.println(rows.get(n).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + (n+1) + "]")).getText());
		int i;
		for(i = 0; i < rows.size(); i++)
		{
			if(rows.get(i).getText().contains("Morepen Labs.Lt"))
				break;
		}
		System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + (i+1) + "]")).getText());
		
		List<WebElement>currentPrice = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"));
		double[]cpArray = new double[currentPrice.size()];
		
		for(int j = 0; j < currentPrice.size(); j++) {
			//String cp = currentPrice.get(j).getText();
			//cp = cp.replace(",", "");
			//cpArray[j] = Double.parseDouble(cp);
			cpArray[j] = Double.parseDouble(currentPrice.get(j).getText().replace(",", ""));
			//System.out.println(cpArray[i]);
		}
		Arrays.sort(cpArray);
		System.out.println("Highest: " + cpArray[cpArray.length-1]);
		
		
		driver.close();
	}

}
