package com.velocity.arraylist1;
import java.io.*;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizeUsingCopyOnWriteArrayList {

  public static void main(String[] args) {
    // creating a thread-safe ArrayList using
    // CopyOnWriteArrayist.
    CopyOnWriteArrayList<String> arr = new CopyOnWriteArrayList<String>();

    // Adding elements to synchronized ArrayList
    arr.add("Hello");
    arr.add("World");
    arr.add("in");
    arr.add("Java");

    System.out.println("Elements of synchronized ArrayList :");

    // Iterating on the synchronized ArrayList using an iterator.
    Iterator<String> it = arr.iterator();

    while (it.hasNext()) System.out.println(it.next());
  }
}
