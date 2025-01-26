package com.Maven_Pro;

public class Pojo_C {
  public static void main(String[] args) {
	Pojo_A a = new Pojo_A();
	int age = a.getAge();
	System.out.println(age);
	a.setAge(age);
	int age2 = a.getAge();
	System.out.println(age2);
}
}
