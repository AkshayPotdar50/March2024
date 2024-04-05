package com.constructor.chaining;

public class Child extends Parent{

	Child(String name)
	{
		super(name); // Calling parent class constructor
		System.out.println("Executing child class argument type constructor");
	}
	
	
	public static void main(String[] args) {
		// Creating object of child class
		Child child = new Child("Sushmita"); //calling base class constructor
	}

}

