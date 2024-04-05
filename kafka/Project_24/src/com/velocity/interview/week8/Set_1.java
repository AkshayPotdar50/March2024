package com.velocity.interview.week8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_1 {

	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("akshay");
		treeset.add("potdar");
		treeset.add("main");
		treeset.add("akshay");
		System.out.println(treeset);
		System.out.println("**************************");
		HashSet hashset = new HashSet();
		hashset.add(treeset);
		System.out.println(hashset);
		System.out.println("**************************");
		LinkedHashSet linkedhashset = new LinkedHashSet();
		linkedhashset.add(hashset);
		System.out.println(linkedhashset);
		
	}

}
