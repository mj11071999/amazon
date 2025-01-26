package com.testng;

import org.testng.annotations.Test;

public class Ignore {
    @Test(groups = "Fruits")
	public void grapes() {
    System.out.println("Grapes");
	}
    @Test(groups = "Fruits")
	public void orange() {
    System.out.println("Orange");
	}
  
    @Test(groups = "Veggies")
	public void carrot() {
    System.out.println("Carrot");
	}
    @Test(groups = "Veggies")
	public void raddish() {
    System.out.println("Raddish");
	}
    @Test(groups = "Colours")
	public void red() {
    System.out.println("Red");
	}	
    @Test(groups = "Colours")
	public void yellow() {
    System.out.println("Yellow");
	}
	
	
	
	
	
}
