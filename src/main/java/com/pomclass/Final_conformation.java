package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final_conformation {
	public WebDriver driver;
	 @FindBy(xpath="//a[text()='FINISH']")
	  private WebElement finish;
	
	public Final_conformation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFinish() {
		return finish;
	}
	 
}
