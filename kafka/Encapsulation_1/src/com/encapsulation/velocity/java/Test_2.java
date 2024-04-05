package com.encapsulation.velocity.java;

public class Test_2 {

	public static void main(String[] args) {
		Test_1 employee = new Test_1();
		employee.setAddress("at post kundal");
		employee.setName("akahsy potdar");
		employee.getMobileno();
		
		System.out.println("Name:" +employee.getName());
		
		System.out.println("address:" +employee.getAddress());
		
		System.out.println("Mobileno:" +employee.getMobileno());
		
	}

}
