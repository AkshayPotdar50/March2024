package com.exception.handeling;
public class Test_1 {
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
