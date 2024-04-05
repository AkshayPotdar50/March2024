package com.velocity.collection;
//Write a program to traverse(or iterate) HashSet?//
import java.util.*;

public class Example_3 {
   public static void main(String args[]) {
       
   // Declaring a HashSet
   HashSet<String> hashset = new HashSet<String>();
   // Add elements to HashSet
   hashset.add("Pear");
   hashset.add("Apple");
   hashset.add("Orange");
   hashset.add("Papaya");
   hashset.add("Banana");    
   // Get iterator
   Iterator<String> it = hashset.iterator(); //typecasting
   // Show HashSet elements
   System.out.println("HashSet contains: ");
   while(it.hasNext()) {
     System.out.println(it.next());
   }
 }
} 
