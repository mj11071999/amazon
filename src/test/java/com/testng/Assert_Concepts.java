package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concepts {
	@Test(retryAnalyzer = Rerun.class)
public void user() {
   String exp ="apple";
   String act = "orange";
   SoftAssert s = new SoftAssert();
   s.assertEquals(act, exp);
   System.out.println("verification");
   s.assertAll();
}
	@Test
	public void user1() {
	String exp ="apple";
	   String act = "apple";
	   SoftAssert s = new SoftAssert();
	   s.assertEquals(act, exp);
	   System.out.println("verification");
	   s.assertAll();
}
}