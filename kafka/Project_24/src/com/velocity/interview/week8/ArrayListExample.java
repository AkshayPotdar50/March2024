package com.velocity.interview.week8;
//Java program to convert ArrayList
//to HashMap

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayListExample {
	public static void main(String[] args)
	{
		
		// ArrayList of string
		ArrayList<String> languageList
		= new ArrayList<>(Arrays.asList("Java", "C++", "Python",
										"PHP", "NodeJS"));
		
		languageList.add(2, "Akshay");
		System.out.println(
			"-------------ArrayList---------------");
	
		
		// printing the ArrayList
		for (String language : languageList)
		{
		System.out.println(language);
		}

		System.out.println(
			"--------------HashMap----------------");
		
		// convertArrayListToHashMap() method directly
		// converts ArrayList to Hashmap
		HashMap<String, Integer> languageMap = convertArrayListToHashMap(languageList);
	//here we are typecasting the hashmap to arraylist
		// printing the HashMap
		for (Map.Entry<String, Integer> entry : languageMap.entrySet()) {

			System.out.println(entry.getKey() + " : "
							+ entry.getValue());
		}
	}

	private static HashMap<String, Integer>
	convertArrayListToHashMap(ArrayList<String> arrayList)
	{

		HashMap<String, Integer> hashMap = new HashMap<>();

		for (String str : arrayList) {

			hashMap.put(str, str.length());
		}

		return hashMap;
	}
}

