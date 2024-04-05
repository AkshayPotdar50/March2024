package com.velocity.hashmap;
import java.io.*;
import java.util.HashMap;
public class RemoveElements {
	public static void main(String args[])
	{

		// Initialization of a HashMap
		HashMap<Integer, String> hMap
			= new HashMap<Integer, String>();

		// Changing the Value using put method
		hMap.put(1, "Scaler");
		hMap.put(2, "Topics");
		hMap.put(3, "Article");
		hMap.containsKey(2);
		hMap.containsValue("scaler");
		hMap.entrySet();
		
		
		
		
System.out.println("Initial Map :" + hMap);
        
                //Removing element with remove() method
                //by passing the key
		hMap.remove(3);

		System.out.println("Updated Map :" + hMap);
	}
}


