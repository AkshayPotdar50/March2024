package com.velocity.arraylist1;
import java.util.*;

public class AddMethod {

  public static void main(String[] args) {
    // Creating an ArrayList of Integer type
    ArrayList<Integer> arr = new ArrayList<>();

    // adding elements in the list
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(4);
System.out.println("Elements in ArrayList arr " + arr);

    // adding 5 at index 2 or 3rd position
    arr.add(2, 5);//arr.add(index, element);
    // adding 6 at index 3 or 4th position
    arr.add(3, 6);

    System.out.println("ArrayList arr after adding new elements " + arr);
  }
}

