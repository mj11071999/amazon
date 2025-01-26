package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized1 {
	@Parameters({"username","password"})
	@Test
  public void login(String username,String password) {
	  System.out.println("Name:"+username);
      System.out.println("Number:"+password);
}
}
