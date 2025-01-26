package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Grouping {
	 @Test(groups = "Colours")
		public void blue() {
	     System.out.println("Blue");
		}
	    
	    @Test(groups = "Colours")
		public void orange() {
	     System.out.println("Orange");
		}
		@Test(groups = "Colours")
		public void purple() {
	    System.out.println("Purple");
		}
		@Test(groups = "Subject")
		public  void english() {
	     System.out.println("English");
		}
		@Test(groups = "Subject")
		
		public  void tamil() {
	     System.out.println("Tamil");
		}
		@Test(groups = "Vehicles")
		public void bike() {
        System.out.println("Bike");
		}
		@Test(groups = "Vehicles")
		public void car() {
         System.out.println("Car");
		}
}
