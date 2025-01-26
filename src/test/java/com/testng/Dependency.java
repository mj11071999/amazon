package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency {
	@Ignore
	@Test
	public void login() {
System.out.println("Login");
	}
	@Test(dependsOnMethods ="login" )
public void homepage() {
System.out.println("Homepage");
}
}
