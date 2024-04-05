package com.velocity.customexce;

public class Example_2{
	public static void main(String[] args) {
	    try{
	        throw new SimpleCustomException("User-defined exception demonstration");
	    }
	    catch(SimpleCustomException ex){
	        //calls overrided toString() method
	        System.out.println(ex);
	        //prints message passed to the super constructor
	        System.out.println(ex.getMessage());
	    }
	}
}
