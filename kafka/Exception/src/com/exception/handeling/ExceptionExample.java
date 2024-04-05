package com.exception.handeling;
public class ExceptionExample extends Throwable {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
	    try {
	      // Code that can raise exception
	      int div = 509 / 0;
	    } catch (ArithmeticException e) { //here we have defined the exception 
	      System.out.println(e);
	    }
	    System.out.println("End of code");
	  }
	}
