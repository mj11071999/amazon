package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Timeout_Concept {
	
		public WebDriver driver;
		@Test(timeOut = 2000)
		public void login() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\adams\\eclipse-workspace\\Maven_Pro\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 System.out.println("Launchbrowser");
		
		
	     driver.get("https://www.facebook.com/");
	     System.out.println("Launchurl");
		
		
	    WebElement element = driver.findElement(By.id("email"));
	    element.sendKeys("merlin11jmj@gmail.com");
	   
	    WebElement element2 = driver.findElement(By.id("pass"));
	    element2.sendKeys("12335566");
	    System.out.println("Credentials");
		
	     WebElement click = driver.findElement(By.xpath("//button[@value='1']"));
	     click.click();
	     System.out.println("login");
		}
	
	
}
