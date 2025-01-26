package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
   public WebDriver driver;
   
   @FindBy(name="user-name")
  private WebElement name;
   @FindBy(id="password")
   private WebElement pass;
   @FindBy(id = "login-button")
   private WebElement click;

public Login_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
}
public WebElement getUser() {
	return name;
}
public WebElement getPassword() {
	return pass;
}
public WebElement getButton() {
	return click;
}
   
   
   
   
   
}
