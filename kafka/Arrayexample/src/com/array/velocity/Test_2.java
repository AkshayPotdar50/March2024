package com.array.velocity;
public class Test_2 {
	  public static void main (String[] args) {
	    // declaring and initializing an array
	    String strArray[] = {"Python", "Java", "C++", "C", "PHP"};
	    
	    // using a for-each loop for printing the array
	    for(String i : strArray) {
	      System.out.print(i + " ");
	    }
	    
	    // find the length of an array
	    System.out.println("\nLength of array: "+strArray.length);
	    
	  }
	}

