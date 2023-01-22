package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RealTimeXpath {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/table-data-download-demo.html");
		driver.manage().window().maximize();
		
		List<WebElement> tableNames = driver.findElements(By.xpath("//th[text()='Name']//following::tr//td[1]"));
	
		for (int i = 0; i < tableNames.size(); i++) {
			
			String names = tableNames.get(i).getText();
			System.out.println(names);
		}
	System.out.println("=========================");
	
		List<WebElement> tableOffice = driver.findElements(By.xpath("//th[text()='Name']//following::tr//td[3]"));
		
		for (int i = 0; i < tableOffice.size(); i++) {
			
			String office = tableNames.get(i).getText();
			System.out.println(office);
		}
	System.out.println("=========================");
	
	
	List<WebElement> nameRes = driver.findElements(By.xpath("//th[text()='Name']//following::tr//td[1]"));
	
	
	List<WebElement> salaryRes = driver.findElements(By.xpath("//th[text()='Name']//following::tr//td[6]"));
	
	int nameSize = nameRes.size();
	int salarySi = salaryRes.size();
	
	for (int i = 0; i < 10; i++) {
		String n = nameRes.get(i).getText();
		String s = salaryRes.get(i).getText();
		
		System.out.println(n+"_"+s);
		
	}
	
	System.out.println("=========================");
	
	for (int i = 0; i < salaryRes.size(); i++) {
		if (salaryRes.get(i).getText().equals("$86,000")) 
		
		
		{
			System.out.println(nameRes.get(i).getText());
			
		}
		
	
	}

	}
	
}
	

