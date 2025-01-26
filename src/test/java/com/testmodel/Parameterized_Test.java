package com.testmodel;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	@Parameters({"name","accountno"})
     @Test
	public void bankaccount(String name,int accountno) {
    System.out.println("Name:"+name);
    System.out.println("Accountno:"+accountno);
}
   
	
	
}
