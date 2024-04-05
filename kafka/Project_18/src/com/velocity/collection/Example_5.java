package com.velocity.collection;
// How to synchronize an ArrayList in java?//
import java.util.*;

public class Example_5 {
   public static void main(String args[]) {
      
      // Converting ArrayList to Synchronized ArrayList
      List<String> synchronizedarraylist = 
      Collections.synchronizedList(new ArrayList<String>());

      //Adding elements to synchronized ArrayList
      synchronizedarraylist.add("Basketball");
      synchronizedarraylist.add("Baseball");
      synchronizedarraylist.add("Basebasketball");

      System.out.println("Synchronized ArrayList Iteration:");
      synchronized(synchronizedarraylist) {
      Iterator<String> iterator = synchronizedarraylist.iterator(); 
      while (iterator.hasNext())
         System.out.println(iterator.next());
      }
 }
} 