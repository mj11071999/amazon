package com.Maven_Pro;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.pomclass.Login_Dropdown;
import com.pomclass.Login_Page;
//import com.pomclass.Pom_Windows;
import com.properties.Data_Reader;

public class Runner extends Baseclass {
   public static void main(String[] args) throws IOException, AWTException {
	   Data_Reader dr = new Data_Reader();
	   launchbrowser();
	// facebook page
	   launchurl(dr.geturl());
	   Login_Page lp = new Login_Page(driver);
	   
	//	WebElement user = driver.findElement(By.id("email"));
		
		inputpass(lp.getUser(), dr.getusername());
	//	WebElement password = driver.findElement(By.id("pass"));
		
		inputpass(lp.getPassword(), dr.getpass());
	//	WebElement button = driver.findElement(By.xpath("//button[@value='1']"));
		
		clickbutton(lp.getButton());
		
		
		//dropdown methods
		//launchurl("https://demoqa.com/select-menu");
		//Login_Dropdown ld = new Login_Dropdown(driver);
		//WebElement multi = driver.findElement(By.id("cars"));
		//selectbyvalue(ld.getMulti(), "saab");
		//selectbyindex(ld.getMulti(), 2);
		//getoption(ld.getMulti());
		//System.out.println(     "     all selected option");
		//getallselectedoption(ld.getMulti());
		
		//System.out.println("      first selected option");
		//getfirstselectedoption(ld.getMulti());
	
		
		//windows handling 
		
		//launchurl("https://www.amazon.in/");
	//	Pom_Windows p = new Pom_Windows(driver);
		//WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		//rightclick(p.getMob());
		//keydown();
		//keyenter();
		//WebElement element = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		//rightclick(p.getEle());
		//keydown();
		//keyenter();
		
		
		
		
		
		
		
	}
}
