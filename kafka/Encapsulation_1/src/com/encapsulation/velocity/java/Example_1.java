package com.encapsulation.velocity.java;

public class Example_1 {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setAddress("at post kundal");
		employee.setName("akahsy potdar");
		employee.setMobileno(9921);
		
		System.out.println("Name:" +employee.getName());
		
		System.out.println("address:" +employee.getAddress());
		
		System.out.println("Mobileno:" +employee.getMobileno());
		

	}

}
