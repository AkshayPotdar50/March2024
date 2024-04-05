package com.string.duplicate;

import java.util.Scanner;

public class Main {

	 public static void main(String[] args)   
	  {   
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a string to remove duplicate");
	      String info = sc.next();
	      //Converting string to character array  
	      char str[] = info.toCharArray();  
	      //Calculating length of the character array  
	      int len = str.length;   
	      //Calling removeDuplicates() method to remove duplicate characters  
	      Example_1.removeDuplicate(str, len);   
	  }   
}