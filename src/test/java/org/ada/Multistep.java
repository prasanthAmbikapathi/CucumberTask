package org.ada;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Multistep {
	WebDriver driver;
	@Given("user is on the adactin login page")
	public void user_is_on_the_adactin_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
	}
	@When("user should enter {string} and {string}")
	public void user_should_enter_and(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		
	}
	@When("user should click login button")
	public void user_should_click_login_button() {
		
		driver.findElement(By.id("login")).click();
		
	}
	@When("user shoud select {string},{string},{string} click search box")
	public void user_shoud_select_click_search_box(String string, String string2, String string3) {
		driver.findElement(By.id("location")).sendKeys(string);
		driver.findElement(By.id("hotels")).sendKeys(string2);
		driver.findElement(By.id("room_type")).sendKeys(string3);
		driver.findElement(By.id("Submit")).click();
		
	}
	@When("Select the hotel and click continue button")
	public void select_the_hotel_and_click_continue_button() {
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
	}
	@When("fill the personel details and click the booknow button {string},{string},{string},{string},{string},{string},{string},{string}")
	public void fill_the_personel_details_and_click_the_booknow_button(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
		driver.findElement(By.id("first_name")).sendKeys(string);
		driver.findElement(By.id("last_name")).sendKeys(string2);
		driver.findElement(By.id("address")).sendKeys(string3);
		driver.findElement(By.id("cc_num")).sendKeys(string4);
		driver.findElement(By.id("cc_type")).sendKeys(string5);
		driver.findElement(By.id("cc_exp_month")).sendKeys(string6);
		driver.findElement(By.id("cc_exp_year")).sendKeys(string7);
		driver.findElement(By.id("cc_cvv")).sendKeys(string8);
		
		
		driver.findElement(By.id("book_now")).click();
		
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.id("order_no"));
		String orderId = findElement.getAttribute("value");
		System.out.println(orderId);
		
		
	}
	@Then("user should verify after login success message .")
	public void user_should_verify_after_login_success_message()  {
		
	}




	
}
