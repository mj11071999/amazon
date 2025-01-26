package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Page {
	 public WebDriver driver;
	 @FindBy(xpath="//a[@class='shopping_cart_link fa-layers fa-fw']")
	 private WebElement cart;
	public Checkout_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCart() {
		return cart;
	}
	
	 
}
