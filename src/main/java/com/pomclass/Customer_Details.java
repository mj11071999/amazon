package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_Details {
	public WebDriver driver;
	 @FindBy(xpath="//a[text()='CHECKOUT']")
	  private WebElement checkout;
	public Customer_Details(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCheckout() {
		return checkout;
	}
	

}
