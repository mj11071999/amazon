package com.Maven_Pro;

public class Pojo_B {
     public static void main(String[] args) {
		Pojo_A a = new Pojo_A();
		int age = a.getAge();
		System.out.println(age);
		a.setAge(88);
		int age2 = a.getAge();
		System.out.println(age2);
		
	}
}
