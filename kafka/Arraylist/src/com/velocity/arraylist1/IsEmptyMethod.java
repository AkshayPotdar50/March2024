package com.velocity.arraylist1;
import java.util.*;

public class IsEmptyMethod {

  public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList<>();
    num.add(1);
    num.add(2);

    // Printing elements
    System.out.println("ArrayList num : " + num);

    // Checking out if ArrayList is empty or not
    System.out.println("ArrayList is empty : " + num.isEmpty());

    // Removing all the elements from the ArrayList
    num.clear();

    // Checking out if ArrayList is empty or not after removing
    // all the elements
    System.out.println("ArrayList is empty : " + num.isEmpty());
  }
}
