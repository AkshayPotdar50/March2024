package com.velocitry.Sortedset;

import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;

public abstract class Example_1 implements SortedSet {

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.addFirst("akshay");
		linkedlist.add("xavier");
		linkedlist.addLast("potdar");
		
		//System.out.println(linkedlist);
		SortedSet sortedset = new TreeSet();
		sortedset.addAll(linkedlist);
		System.out.println(sortedset);

	}

}
