package com.velocity.arraylist1;
import java.util.*;

public class ListIteratorExample {

  public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList<>();
    num.add(1);
    num.add(2);
    num.add(3);
    System.out.println("num : " + num);

    // Creating an object of ListIterator<Integer>
    ListIterator<Integer> iterator = num.listIterator();
//wrapper class 
    System.out.println("Iterating over an ArrayList:");
    // returns true if there is next element in the ArrayList
    while (iterator.hasNext()) {
      // Printing the iterated value
      System.out.print(iterator.next() + " ");
    }
  }
}
