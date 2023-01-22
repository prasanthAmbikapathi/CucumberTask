package org.testDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinSteps {
	
	WebDriver driver;

	@Given("user is on the adackin login page")
	public void user_is_on_the_adackin_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
	}
	@When("user should enter {string} and {string}")
	public void user_should_enter_and(String name, String pass) {
		
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys(name);
		
		WebElement pw = driver.findElement(By.id("password"));
		pw.sendKeys(pass);
		
	}
	@When("user should click login button")
	public void user_should_click_login_button() {
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}
//	@Then("user should verify after login success message .")
//	public void user_should_verify_after_login_success_message(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	}




}
