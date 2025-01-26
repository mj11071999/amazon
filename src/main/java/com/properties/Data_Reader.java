package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Data_Reader {
	public static Properties p;

	  public Data_Reader() throws IOException {

		  File f = new File("C:\\Users\\adams\\eclipse-workspace\\Maven_Pro\\src\\main\\java\\com\\properties\\Saucer.properities");
		  FileInputStream fis = new FileInputStream(f);
		  
		   p = new Properties();
		  p.load(fis);
	}
  public String geturl() throws IOException {

	  String url = p.getProperty("url");
	  return url;  
}
  
  public String getusername() throws IOException {
	  
	  String user = p.getProperty("user");
	  return user;
}
  public String getpass() throws IOException {
	  
	  String pass = p.getProperty("pass");
	  return pass;
}
 public String getfirstname() throws IOException {
	  
	  String first = p.getProperty("firstname");
	  return first;
}
 public String getsecondname() throws IOException {
	  
	  String second = p.getProperty("lastname");
	  return second;
 }
 public String getpincode() throws IOException {
	  
	  String pin = p.getProperty("pincode");
	  return pin;
}
}
