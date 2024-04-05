package com.exception.handeling;
public class Main {
	  public static void main(String[ ] args) {
	    try {
	      int[] myNumbers = {10, 1, 2, 3, 5, 11};
	      System.out.println(myNumbers[10]);
	    } catch (Exception e) {
	      System.out.println("Something went wrong.");
	    }
	  }
	}
