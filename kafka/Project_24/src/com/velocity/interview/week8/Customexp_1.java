package com.velocity.interview.week8;

public class Customexp_1 extends Exception {
	void check(int age) throws InvalidAgeException{
		if (age < 18) {
		      //raises exception is weight is less than 50
		      throw new InvalidAgeException("Age Invalid");
		    }
		  }
	
	public static void main(String[] args) {
		Customexp_1 custom = new Customexp_1();
		try {
		custom.check(30);
		}catch (InvalidAgeException ex) {
			System.out.println("caught the exception");
			System.out.println(ex.getMessage());
		}

	}

}
