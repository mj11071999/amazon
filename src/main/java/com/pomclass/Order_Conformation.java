package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Conformation {
	public WebDriver driver;
	 @FindBy(id="first-name")
	  private WebElement firstname;
	 @FindBy(id="last-name")
	  private WebElement lastname;
	 @FindBy(id="postal-code")
	  private WebElement code;
	 @FindBy(xpath="//input[@type='submit']")
	  private WebElement button;

	public Order_Conformation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getCode() {
		return code;
	}
	public WebElement getButton() {
		return button;
	}
	 
}
