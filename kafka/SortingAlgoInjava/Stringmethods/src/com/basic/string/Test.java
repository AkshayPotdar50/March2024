package com.basic.string;

public class Test {

	public static void main(String[] args) {
       String name="Wel come to Java";
      String name1 [] = name.split(" ");
      String rev1 = " ";
      
      for(int i=name1.length-1;i>=0;i--)
      {   	  
    	  rev1  = rev1 + " " + name1[i]; 	  
      }
      
      System.out.println(rev1);
	}

}

