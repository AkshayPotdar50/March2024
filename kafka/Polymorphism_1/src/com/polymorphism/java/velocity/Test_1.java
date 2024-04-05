package com.polymorphism.java.velocity;

public class Test_1 {
	// Same name of all method is add
		 // All method are present in same class Test
		
		public void add(int a ,int b)
		{
			System.out.println("Method with two argument");
		}
		
		public void add(int a ,int b,int c)
		{
			System.out.println("Method with three argument");
		}
		
		// Access specifier can anything 
		void add(int no,String name)
		{
			System.out.println("No value is :" +no);
			System.out.println("Name value is : " +name);
		}
		
		// Return type can anything
		public String add(String firstName, String lastName)
		{
			String fullName = firstName + " " + lastName;
			System.out.println("Employee full name is :" +fullName);
			return fullName ;
		}
		
	}



