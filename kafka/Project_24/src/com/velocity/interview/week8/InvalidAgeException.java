package com.velocity.interview.week8;

public class InvalidAgeException extends Exception {
	public InvalidAgeException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	void check(int age) throws InvalidAgeException{
		if (age < 18) {
		      //raises exception is weight is less than 50
		      throw new InvalidAgeException("invalid age");
		    }
		  }
}
