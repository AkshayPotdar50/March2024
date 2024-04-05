package com.velocity.arraylist;
//initialise ArrayList using List.of() method

import java.util.*;

public class Example_3 {
 public static void main(String args[])
 {
     // create an ArrayList of String type
     // and Initialize an ArrayList with List.of()
     ArrayList<String> str = new ArrayList<>(Arrays.asList("Coding",
                 "is",
                 "Fun"));

     // to print the ArrayList
     System.out.println("ArrayList is " + str);
 }
}
