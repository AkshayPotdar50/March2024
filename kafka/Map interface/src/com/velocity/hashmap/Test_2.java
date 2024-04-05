package com.velocity.hashmap;
import java.io.*;
import java.util.HashMap;

public class Test_2 {

	public static void main(String args[])
	{
		// Initializing the HashMap
		HashMap<Integer, String> hMap1 = new HashMap<>(10);//initial capacity
		HashMap<Integer, String> hMap2 = new HashMap<>(5);

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
		/*In the above example, we have created two HashMaps 
		with different intial capacities. hMap1 with 10 and 
		hMap2 with 5 capacity. If the threshold value is exceeded 
		then the capacity of hMap1 and hMap2 will increase to 20 
		and 10, respectively (approx. twice).*/
	}
}

