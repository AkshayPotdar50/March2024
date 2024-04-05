package com.constructor.chaining;
public class Parent {
	
	String name ;
	
	Parent ()
	{
		this("Velocity ");
		System.out.println("Parent class constructor");
	}
	
	 Parent(String name)
	{
		this.name = name;
		System.out.println("Parent class Argument type constructor");
	}

}
