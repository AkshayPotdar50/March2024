package com.velocity.collection;
import java.io.*;
import java.util.*;

public class Example_6 {
    public static void main(String args[]) {
      // ArrayList object creation
      ArrayList<String> list = new ArrayList();
      
      // Adding elements to the ArrayList object 
      list.add("Boston");
      list.add("Dallas");
      list.add("New York");
      
      try {
         FileOutputStream fileOS = new FileOutputStream("C:\\Users\\\\potda\\\\Desktop\\\\storeObject.txt");
         ObjectOutputStream objOS = new ObjectOutputStream(fileOS);
         objOS.writeObject(list);
         objOS.close();
         fileOS.close();
         System.out.println("object serialized");
      } 
      catch(IOException ex) {
         ex.printStackTrace();          
      }
    }
}
