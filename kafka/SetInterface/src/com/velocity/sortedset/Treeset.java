package com.velocity.sortedset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<LinkedList<String>> treeset = new TreeSet<LinkedList<String>>();
		LinkedList linked = new LinkedList();
		linked.add("akshay");
		linked.add("swapnil");
		linked.add("pranali");
		linked.add("pravin");
		linked.add("pranil");
		System.out.println(linked);
		System.out.println("***********************************");
		treeset.addAll(linked);
		System.out.println(treeset);
		System.out.println("****************************************");
		HashSet<String> hashset = new HashSet();
		hashset.addAll(linked);
		System.out.println(hashset);
		System.out.println("*******************************************");
		LinkedHashSet<String> link = new LinkedHashSet();
		link.addAll(hashset);
		
		
		
		
		
		
	}

}
