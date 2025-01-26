package com.testng;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	@BeforeSuite
	public void browserLaunch() {
    System.out.println("Browser launch");
	}
	@BeforeTest
	public void urlLaunch() {
     System.out.println("Url launch");
	}
	
	@BeforeClass
	public void credentials() {
      System.out.println("Credentials");
	}
	
     @BeforeMethod 
	public void login() {
     System.out.println("Login");
	}
	 
	@Test(priority = -1)
	public void tshirt() {
      System.out.println("Tshirt");
	}
	
	@Test(priority = 0,invocationCount = 2)
	public void jean() {
     System.out.println("Jean");
	}
	@Test(invocationCount = 3)
	public void saree() {
    System.out.println("Saree");
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
