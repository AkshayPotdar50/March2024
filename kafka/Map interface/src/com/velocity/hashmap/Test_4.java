package com.velocity.hashmap;
import java.io.*;
import java.util.HashMap;

public class Test_4 {

	public static void main(String args[])
	{
		// Initializing the HashMap
		HashMap<Integer, String> hMap1 = new HashMap<>();

		// Adding elements
		hMap1.put(1, "Java");
		hMap1.put(2, "C");
		hMap1.put(3, "Python");
        
        //Initializing hMap2 with hMap1 values
        HashMap<Integer, String> hMap2 = new HashMap<>(hMap1);

		// Printing HashMap 1 elements
		System.out.println("HashMap hMap1 : "
						+ hMap1);

		// Printing HashMap 2 elements
		System.out.println("HashMap hMap2 : "
						+ hMap2);
		/*In the above example, we have created a 
		HashMap hMap1 and then hMap2 by initializing 
		the values of hMap1 to hMap2. So the hMap1 and
		hMap2 will have the same values, capacity and 
		load factor.*/
	}
}

