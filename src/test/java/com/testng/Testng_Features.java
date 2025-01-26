package com.testng;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_Features {
	public WebDriver driver;
	@BeforeSuite
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Maven_Pro\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 System.out.println("Launchbrowser");
	}
	@BeforeTest
     public void launchurl() {
     driver.get("https://www.facebook.com/");
     System.out.println("Launchurl");
	}
	@org.testng.annotations.BeforeClass
	public void credentials() {
    WebElement element = driver.findElement(By.id("email"));
    element.sendKeys("merlin11jmj@gmail.com");
   
    WebElement element2 = driver.findElement(By.id("pass"));
    element2.sendKeys("12335566");
    System.out.println("Credentials");
	}
	@BeforeMethod
	public void login() {
     WebElement click = driver.findElement(By.xpath("//button[@value='1']"));
     click.click();
     System.out.println("login");
	}
	@Test(priority = -1)
	public void john() {
      System.out.println("John");
	}
	@Test(priority = 1)
	public void adams() {
     System.out.println("Adams");
	}
	@Test(priority = -1,invocationCount = 4)
	public void mary() {
     System.out.println("Mary");
	}
	@AfterMethod
	public void logout() {
     System.out.println("Logout");
	}
	@AfterClass
	public void refresh() {
    System.out.println("Refresh");
	}
	@AfterTest
	public void screenshot() {
    System.out.println("Screenshot");
	}
	@AfterSuite
	public void quit() {
    System.out.println("Quit");
	}
	
	
	
	
	
	
	
}
