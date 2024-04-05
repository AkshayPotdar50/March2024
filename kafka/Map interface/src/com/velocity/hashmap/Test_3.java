package com.velocity.hashmap;
import java.io.*;
import java.util.HashMap;

public class Test_3 {

	public static void main(String args[])
	{
		// Initializing the HashMap
		HashMap<Integer, String> hMap1 = new HashMap<>(10, 0.75f);
		HashMap<Integer, String> hMap2 = new HashMap<>(5, 0.5f);

		// Adding elements
		hMap1.put(1, "Java");
		hMap1.put(2, "C");
		hMap1.put(3, "Python");

		hMap2.put(4, "Javascript");
		hMap2.put(5, "Kotlin");
		hMap2.put(6, "Go");

		// Printing HashMap 1 elements
		System.out.println("HashMap hMap1 : "
						+ hMap1);

		// Printing HashMap 2 elements
		System.out.println("HashMap hMap2 : "
						+ hMap2);
		/*In the above example we have created 
		two HashMaps with different initial 
		capacity and load factors. hMap1 with
		a capacity of 10 and load factor of 0.75,
		whereas hMap2 with a capacity of 5 and a 
		load factor of 0.5. The default load factor
		is 0.75 but here we are giving values as 
		required. So the threshold value for both 
		maps would be:*/
	}
}
