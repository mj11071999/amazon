package com.testmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Timeout_Concept {

	public WebDriver driver;
     @BeforeSuite
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Maven_Pro\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
     @BeforeClass
    public void urllaunch() {
     driver.get("https://www.facebook.com/");
     
	}
     @Parameters({"username","password"})
     @Test(dataProvider = "input")
    public void credentials(String username,String password) {
   WebElement id = driver.findElement(By.id("email"));
 
   id.sendKeys(username);
   System.out.println("Username:"+username);
   WebElement p = driver.findElement(By.id("pass"));
   p.sendKeys(password);
   System.out.println("Password:"+password);
   
	}
     @DataProvider
     public Object input() {
     return new Object[][] {
    	 {"jervice123@gmail.com","1234"},{"merlin11234","maths"},{"john56@gmailcom","ket"}
     };
    
}
}
