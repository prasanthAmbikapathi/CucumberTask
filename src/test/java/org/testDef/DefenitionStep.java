package org.testDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.textui.TestRunner;

public class DefenitionStep {
	WebDriver driver;
	
	@Given("user is on the adackin login page")
	public void user_is_on_the_adackin_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
	}
	
	
	@When("user should enter username and password")
	public void user_should_enter_username_and_password() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("1karthikeyan");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123karthi");
		
	}
	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
	}
	@Then("user should verify after login success message .")
	public void user_should_verify_after_login_success_message() {
		
		Assert.assertTrue("verify afetr login", true);
		
		
		
	}










}
