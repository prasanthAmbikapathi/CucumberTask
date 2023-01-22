package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.seleniumeasy.com/table-data-download-demo.html");
	driver.manage().window().maximize();
	
	
	List<WebElement> names = driver.findElements(By.xpath("//th[text()='Name']//following::tr//td[1]"));
	
	List<WebElement> ages = driver.findElements(By.xpath("//th[text()='Name']//following::tr//td[4]"));
	
	
	
	for (int i = 0; i < names.size(); i++) {
		if (names.get(i).getText().equals("Ashton Cox")) {
			System.out.println(ages.get(i).getText());
			
		}
		
		
		
	}
	
	
	
	
	
	
	
}
}