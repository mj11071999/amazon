package com.Maven_Pro;

import java.io.IOException;

import com.pomclass.Login_Page;
import com.properties.Data_Reader;

public class Runner_Method extends Baseclass {
  public static void main(String[] args) throws IOException {
	  Data_Reader dr = new Data_Reader();
	 launchbrowser();
	 launchurl(dr.geturl());
	 
	   Login_Page lp = new Login_Page(driver);
	   
		
		inputpass(lp.getUser(), dr.getusername());
		
		inputpass(lp.getPassword(),dr.getpass());
		
		clickbutton(lp.getButton());
		 
		
		
	 
}
}
