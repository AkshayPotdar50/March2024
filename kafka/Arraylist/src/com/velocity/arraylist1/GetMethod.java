package com.velocity.arraylist1;
import java.util.*;

public class GetMethod {

  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("Raj");
    names.add("Priya");
    names.add("Shashank");
    names.add("Ansh");

    System.out.println("Elements in ArrayList names : " + names);

    // Accessing the element present at given index
    System.out.println("Element at index 2 : " + names.get(2));
  }
}
