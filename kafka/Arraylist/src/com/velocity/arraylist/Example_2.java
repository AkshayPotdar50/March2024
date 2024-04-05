package com.velocity.arraylist;
//initialise ArrayList using asList method

import java.util.*;

public class Example_2 {
 public static void main(String args[])
 {
     // create an ArrayList of String type
     // and Initialize an ArrayList with asList()
     ArrayList<String> scaler = new ArrayList<String>(
         Arrays.asList("I",
                       "love",
                       "Java"));

     // to print the ArrayList
     System.out.println("ArrayList is " + scaler);
 }
}

