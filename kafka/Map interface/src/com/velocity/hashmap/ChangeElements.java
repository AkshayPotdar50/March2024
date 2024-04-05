package com.velocity.hashmap;
import java.io.*;
import java.util.HashMap;
public class ChangeElements {
	public static void main(String args[])
	{

		// Initialization of a HashMap
		HashMap<Integer, String> hMap
			= new HashMap<Integer, String>();

		// Changing the Value using put method
		hMap.put(1, "Scaler");
		hMap.put(2, "Scaler");
		hMap.put(3, "Article");

		System.out.println("Initial Map " + hMap);

		hMap.put(2, "Topics");

		System.out.println("Updated Map " + hMap);
	}
}


