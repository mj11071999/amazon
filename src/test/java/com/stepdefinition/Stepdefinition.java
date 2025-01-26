package com.stepdefinition;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
	public static WebDriver driver;
	
	@Before
	public void beforehooks(Scenario s) {
     String name = s.getName();
     System.out.println("scenario name:"+name);
	}
	@After
	public void afterhooks(Scenario s) {
    Status status = s.getStatus();
    System.out.println("scenario status:"+status);
	}
	@Given("user must launch the browser")
	public void user_must_launch_the_browser() {
 System.out.println("Browser launch sucessfully");
	}

	@Given("user must launch the url")
	public void user_must_launch_the_url() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Maven_Pro\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	}

	
	@When("user enter the {string} in username field")
	public void user_enter_the_in_username_field(String usern) {
		WebElement user = driver.findElement(By.id("user-name"));
	     user.sendKeys(usern);
	}
	@When("user enter the {string} in the password field")
	public void user_enter_the_in_the_password_field(String passw) {
		WebElement pass = driver.findElement(By.id("password"));
	     pass.sendKeys(passw);
	}

	@Then("user click on login button and it navigate to the products page")
	public void user_click_on_login_button_and_it_navigate_to_the_products_page() {
     WebElement click = driver.findElement(By.id("login-button"));
     click.click();
	}
	@When("user add to their chart button")
	public void user_add_to_their_chart_button() {
		WebElement button = driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[5]"));
		button.click();
		
	}
	@Then("user click on the add to chart button and it navigate to the next page")
	public void user_click_on_the_add_to_chart_button_and_it_navigate_to_the_next_page() {
		WebElement element = driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']"));
		element.click();
	}
	@Then("user click on the checkout button and it navigate to the next page")
	public void user_click_on_the_checkout_button_and_it_navigate_to_the_next_page() {
		WebElement a1 = driver.findElement(By.xpath("//a[text()='CHECKOUT']"));
		a1.click();
	}
	@When("user entering their {string} in the name field")
	public void user_entering_their_in_the_name_field(String first) {
		WebElement name = driver.findElement(By.id("first-name"));
		name.sendKeys(first);
	}
	@When("user entering their {string} in the secondname field")
	public void user_entering_their_in_the_secondname_field(String second) {
		WebElement last = driver.findElement(By.id("last-name"));
		last.sendKeys(second);
	}

	@When("user entering their {string} in the box")
	public void user_entering_their_in_the_box(String postal) {
		WebElement post = driver.findElement(By.id("postal-code"));
		post.sendKeys(postal);
	}
	
	
	@Then("user click on continue and it navigate to the next page")
	public void user_click_on_continue_and_it_navigate_to_the_next_page() {
		WebElement ele1 = driver.findElement(By.xpath("//input[@type='submit']"));
		ele1.click();
	}
	@Then("user click to finish button to conform the order")
	public void user_click_to_finish_button_to_conform_the_order() {
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='FINISH']"));
		ele2.click();
	}
}
