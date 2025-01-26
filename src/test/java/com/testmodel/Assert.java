package com.testmodel;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {
	@Test(retryAnalyzer = Rerun.class)
     public void demo() {
    String exp = "abc";
    String act = "fyguh";
    SoftAssert s = new SoftAssert();
    s.assertEquals(exp, act);
    System.out.println("verification");
    s.assertAll();
	}
     
	@Test
    public void demo1() {
   String exp = "abc";
   String act = "abc";
   SoftAssert s = new SoftAssert();
   s.assertEquals(exp, act);
   System.out.println("verification");
   s.assertAll();
	}
}
