package com.exception.handeling;
public class CustomExample1 {
	  void Check(int weight) throws InvalidProductException {
	    if (weight < 50) {
	      //raises exception is weight is less than 50
	      throw new InvalidProductException("Product Invalid");
	    }
	  }
	  public static void main(String args[]) {
		    CustomExample1 obj = new CustomExample1();
		    try {
		      obj.Check(35);
		    } catch (InvalidProductException ex) {
		      System.out.println("Caught the exception");
		      System.out.println(ex.getMessage());
		    }
		  }
		}

	  