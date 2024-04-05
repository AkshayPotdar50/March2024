package com.constructor.chaining;

public class Test_1 {
	
	Test_1(){
		
		this("akshay", 10.00);
		System.out.println("Default constructor is running");
	}
	
	Test_1(int no){
		System.out.println("int argument constructor is running");

		
		}
	Test_1(String name, double no){
		System.out.println("string and double type constructor is running");
		System.out.println("print the value of string" + this.hashCode());
		System.out.println("print the value of double" + this.getClass());
		
	}

	public static void main(String[] args) {
		
		Test_1 obj= new Test_1();
		System.out.println("constructor chaining is completed");
		

	}

}
