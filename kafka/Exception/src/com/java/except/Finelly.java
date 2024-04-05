package com.java.except;
/*finally block is associated with a try, catch block.
It is executed every time irrespective of exception is thrown or not.
finally block is used to execute important statements such as closing statement,
 release the resources, and release memory also.
finally block can be used with try block with or without catch block.

 */
public class Finelly {
	  public static void main(String[] args) {
	    try {
	      int data = 100/0;
	      System.out.println(data);
	    } catch (Exception e) {
	      System.out.println("Can't divide integer by 0!");
	    } finally {
	      System.out.println("The 'try catch' is finished.");
	    }
	  }
	}
