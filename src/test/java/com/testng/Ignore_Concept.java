package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
    @Test(enabled = false)
	public void blue() {
     System.out.println("Blue");
	}
    @Ignore
    @Test
	public void orange() {
     System.out.println("Orange");
	}
	@Test
	public void purple() {
    System.out.println("Purple");
	}
	@Test
	public  void english() {
     System.out.println("English");
	}
	@Test
	public  void tamil() {
     System.out.println("Tamil");
	}
	
	
}
