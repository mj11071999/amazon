package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parallel_Concept {

	public WebDriver driver;
@BeforeSuite
	public void Lunchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adams\\eclipse-workspace\\Maven_Pro\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
   @Test
   public void facebooklaunch() {
    driver.get("https://www.facebook.com/");
    System.out.println("FB");
}
   @Test
   public void amazonurl() {
    driver.get("https://www.amazon.com/");
    System.out.println("Amazon");
}
}
