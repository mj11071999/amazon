package com.Maven_Pro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;
	// web_driver methods
	public static void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void launchurl(String url) {
     driver.get(url);
	}
	public static void retrivetitle() {
     String title = driver.getTitle();
     System.out.println(title);
	}
	public static void retrivecurrenturl() {
     String currentUrl = driver.getCurrentUrl();
     System.out.println(currentUrl);
	}
	public static  void getwindowhandles() {
    Set<String> windowHandles = driver.getWindowHandles();
    for (String s : windowHandles) {
		String title = driver.switchTo().window(s).getTitle();
		System.out.println(title);
	}
	}
	public static  void navigateto(String url) {
     driver.navigate().to(url);
	}
	public static void navigateback() {
     driver.navigate().back();
	}
	public static void navigateforward() {
     driver.navigate().forward();
	}
	public static void closewindow() {
     driver.close();
	}
	public static void quitewindow() {
     driver.quit();
	}
	//web_element methods
	public static  void inputpass(WebElement element,String input) {
     element.sendKeys(input);
	}
	public static  void clickbutton(WebElement element) {
     element.click();
	}
	public static  void retrievetext(WebElement element) {
     String text = element.getText();
     System.out.println(text);
	}
	//drop_down methods
	public static  void selectbyvalue(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	
	}
	public static void selectbyindex(WebElement element,int no) {
		Select s = new Select(element);
		s.selectByIndex(no);
	}
	public static void  selectbyvisibletext(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	public static  void deselectbyvalue(WebElement element,String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	
	}
	public static void deselectbyindex(WebElement element,int no) {
		Select s = new Select(element);
		s.deselectByIndex(no);
	}
	public static void  deselectbyvisibletext(WebElement element,String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}
	public static void getoption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
	    for (WebElement all : options) {
			System.out.println(all.getText());
		}
	}
	public static void getallselectedoption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	    for (WebElement Selected : allSelectedOptions) {
			System.out.println(Selected.getText());
		}
	}
	public static void getfirstselectedoption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
	    System.out.println(firstSelectedOption.getText());
	    
	}
	public static void multipleoption(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	
	//alert
	public static void alertaccept() {
     Alert simple = driver.switchTo().alert();
     simple.accept();
	}
	public static void alertdismiss() {
	     Alert si = driver.switchTo().alert();
	    si.dismiss(); 
		}
	public static void alertprompt() {
	     Alert p = driver.switchTo().alert();
	    p.sendKeys("merlin");
		}
	
	//screenshot
	public static void screenshot(String location) throws IOException {
    TakesScreenshot ts = (TakesScreenshot) driver;
    File mj = ts.getScreenshotAs(OutputType.FILE);
    File dv = new File(location);
    FileUtils.copyFile(mj, dv);
	}
	//scroll_function
	public static  void scrollfunction(String syntax,WebElement element) {
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript(syntax, element);
	}
	//wait
	public static void waitfunction() {
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	//action methods
	public static void click(WebElement element) {
     Actions a = new Actions(driver);
     a.click(element).build().perform();
	}
	public static void rightclick(WebElement element) {
	     Actions a = new Actions(driver);
	     a.contextClick(element).build().perform();
		}
	//keyboard events
	public static void keydown() throws AWTException {
     Robot r = new Robot();
     r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void keyenter() throws AWTException {
	     Robot r = new Robot();
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
		}
	
}
