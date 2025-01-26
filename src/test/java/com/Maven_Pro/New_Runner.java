package com.Maven_Pro;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pomclass.Checkout_Page;
import com.pomclass.Customer_Details;
import com.pomclass.Final_conformation;
import com.pomclass.Login_Page;
import com.pomclass.Order_Conformation;
import com.pomclass.Product_Page;
import com.properties.Data_Reader;

public class New_Runner extends Baseclass  {
    public static void main(String[] args) throws IOException {
    	Data_Reader dr = new Data_Reader();
		launchbrowser();
		launchurl(dr.geturl());
		Login_Page lp = new Login_Page(driver);
		Product_Page pp = new Product_Page(driver);
		Checkout_Page cp = new Checkout_Page(driver);
		Customer_Details cd = new Customer_Details(driver);
		Order_Conformation oc = new Order_Conformation(driver);
		Final_conformation fc = new Final_conformation(driver);
	  // WebElement name = driver.findElement(By.name("user-name"));
	 inputpass(lp.getUser(), dr.getusername());
	  // WebElement pass = driver.findElement(By.id("password"));
	  inputpass(lp.getPassword(), dr.getpass());
	  // WebElement click = driver.findElement(By.id("login-button"));
	   clickbutton(lp.getButton());
	   
	  // WebElement but = driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[3]"));
	   clickbutton(pp.getBut());
	   
	 // WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']"));
	   clickbutton(cp.getCart());
	     
	   clickbutton(cd.getCheckout());
	    
	   inputpass(oc.getFirstname(), dr.getfirstname());
	  inputpass(oc.getLastname(), dr.getsecondname());
	   inputpass(oc.getCode(), dr.getpincode());
	   clickbutton(oc.getButton());
	   
	   clickbutton(fc.getFinish());
	   
	   
	}
}
