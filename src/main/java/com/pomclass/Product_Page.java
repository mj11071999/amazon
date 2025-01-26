package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {
	 public WebDriver driver;
    @FindBy(xpath="(//button[text()='ADD TO CART'])[3]")
    private WebElement but;
    
    
    

	public Product_Page(WebDriver driver3) {
		this.driver= driver3;
		PageFactory.initElements(driver, this);
	}




	public WebElement getBut() {
		return but;
	}

	
    
}
