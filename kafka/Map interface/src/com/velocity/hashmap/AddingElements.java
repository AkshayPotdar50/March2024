package com.velocity.hashmap;
import java.io.*;
import java.util.HashMap;

public class AddingElements {

	public static void main(String args[])
	{
		// Initializing the HashMap
               // No need to mention the Generic type twice
		HashMap<Integer, String> hMap1 = new HashMap<>();
		HashMap<Integer, String> hMap2 = new HashMap<>();

		// Adding elements using the put method
		hMap1.put(1, "Scaler");
		hMap1.put(2, "Topics");

		hMap2.put(4, "Scaler");
		hMap2.put(5, "Topics");

		// Printing HashMap 1
		System.out.println("HashMap hMap1 : "
						+ hMap1);

		// Printing HashMap 2
		System.out.println("HashMap hMap2 : "
						+ hMap2);
	}
}


