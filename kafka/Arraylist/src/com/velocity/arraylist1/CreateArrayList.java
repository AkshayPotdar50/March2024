package com.velocity.arraylist1;
import java.util.*;

public class CreateArrayList {

  public static void main(String[] args) {
    // size of the ArrayList
    int n = 5;

    // Creating an object of ArrayList class
    // ArrayList created is of size n
    // We can add int values to the list which will convert it
    // into an Integer object.

    ArrayList<Integer> arr = new ArrayList<Integer>(n);
    System.out.println("ArrayList created successfully");
  }
}

