package com.java.map;


import java.util.Hashtable;
import java.util.Map;

public class Test_1 {

	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(1, "maharashtra");
		hashtable.put(2, "karnataka");
		hashtable.put(3, "goa");
		hashtable.put(4, "gujarat");
		
		System.out.println(hashtable);
		for(Map.Entry m:hashtable.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue()+" ");
		}
		
	}

}
