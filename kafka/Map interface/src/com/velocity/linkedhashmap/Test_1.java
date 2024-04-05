package com.velocity.linkedhashmap;

import java.util.LinkedHashMap;

public class Test_1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> linkedhashmap = new LinkedHashMap<Integer,String>();
		LinkedHashMap<Integer,String> linkedhashmap1 = new LinkedHashMap<Integer,String>();
		linkedhashmap.put(1, "akshay");
		linkedhashmap.put(2, "potdar");
		linkedhashmap.put(3, "Develpoer");
		linkedhashmap.put(null, "java");
		linkedhashmap.put(4, "pune");
		linkedhashmap.put(4, "velocity");
		linkedhashmap.containsKey(3);
		linkedhashmap.containsValue("pune");
		linkedhashmap.entrySet();
		linkedhashmap.values();
		
		System.out.println("linkedhashmap"+linkedhashmap);
	}

}
