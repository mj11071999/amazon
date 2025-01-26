package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
	@Parameters({"username","password"})
	@Test
     public void credentials(String username,String password) {
      System.out.println("Username:"+username);
      System.out.println("Password:"+password);
	}
}
