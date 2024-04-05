package com.velocity.interview.week8;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class Map_1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
		hashmap.put(10, "akshay");
		hashmap.put(11, "ashish");
		hashmap.put(12, "swapnil");
		hashmap.put(13, "potdar");
		hashmap.put(14, "potdar");
		hashmap.put(15, "akshay");
		hashmap.put(16, "21479");
		hashmap.put(null, null);
		hashmap.put(null, "spring");
	    System.out.println("the output of hashmap is"+hashmap);
		System.out.println("*************************");
		LinkedHashMap<Integer,String> linkedhashmap = new LinkedHashMap<Integer,String>(hashmap);
		System.out.println("the output of linlkedhashmap is"+linkedhashmap);
		System.out.println("*****************************");
		TreeMap<Integer,String> treemap = new TreeMap<Integer,String>(linkedhashmap);
		System.out.println("the output of treemap is"+treemap);
		System.out.println("*******************************");
		Hashtable hashtable = new Hashtable(treemap);
		System.out.println("the output of hashtable is "+hashtable);
	}

}
