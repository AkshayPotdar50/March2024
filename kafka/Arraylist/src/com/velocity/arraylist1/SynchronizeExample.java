package com.velocity.arraylist1;
import java.util.*;

public class SynchronizeExample {

  public static void main(String[] args) {
    List<String> arr = new ArrayList<String>();
    // adding elements to the list
    arr.add("Hello");
    arr.add("World");
    arr.add("in");
    arr.add("Java");

    // Synchronizing the ArrayList externally using
    // synchronizedList() method
    arr = Collections.synchronizedList(arr);

    synchronized (arr) {
      // It should be in synchronized block
      Iterator it = arr.iterator();

      // Iterating through the elements
      while (it.hasNext()) System.out.println(it.next());
    }
  }
}
