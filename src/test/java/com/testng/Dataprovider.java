package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider = "inputs")
	  public void login(String username,String password) {
		  System.out.println("Name:"+username);
	      System.out.println("Number:"+password);
	}
	@DataProvider
	public Object[][] inputs() {
     return new Object[][] {
    	 {"blue","pink"},{"123","3455"},{"ijii","guhui"}
     };
	}
}
