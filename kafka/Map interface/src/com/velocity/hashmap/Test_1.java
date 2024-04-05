package com.velocity.hashmap;
import java.io.*;
import java.util.HashMap;

public class Test_1 {

	public static void main(String args[])
	{
		// Initializing the HashMap
               // No need to mention the Generic type twice
		HashMap<Integer, String> hMap1 = new HashMap<>();
		HashMap<Integer, String> hMap2 = new HashMap<>();

		// Adding elements using put method
		hMap1.put(1, "Java");
		hMap1.put(2, "C");
		hMap1.put(3, "Python");
		
		

		hMap2.put(4, "Javascript");
		hMap2.put(5, "Kotlin");
		hMap2.put(6, "Go");

		// Printing HashMap 1
		System.out.println("HashMap hMap1 : "
						+ hMap1);

		// Printing HashMap 2
		System.out.println("HashMap hMap2 : "
						+ hMap2);
		/*In the above example, we have created two HashMaps hMap1 
		and hMap2, using the default HashMap() constructor and 
		adding 3 values in each HashMap using put() method. Then 
		we have printed both the HashMaps.*/
	}
}

