package com.testng;

import org.testng.annotations.Test;

public class Exp_Exception {
	@Test(expectedExceptions = ArithmeticException.class)
	public void demo() {
     int a = 10;
     System.out.println(a/0);
	}
	
	
}
