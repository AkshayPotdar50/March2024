package com.velocity.linkedhashset;

import java.util.LinkedHashSet;

public class Test_1 {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>();
		linkedhashset.add("akshay");
		linkedhashset.add("potdar");
		linkedhashset.size();
		boolean a = linkedhashset.contains("akshay");
		linkedhashset.add("21");
		linkedhashset.add("20.00");
		int s=linkedhashset.size();
		System.out.println("the elements in hashset"+linkedhashset);
		boolean b= linkedhashset.remove("31");
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		
		
		

	}

}
