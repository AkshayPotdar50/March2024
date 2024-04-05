package com.java.list;

import java.util.ArrayList;
import java.util.List;

public class List_1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(5);
		list.addAll(list);
		list.addAll(4, list);
		//list.clear();
		/*How to Sort List
There are various ways to sort the List, here we are going to use
Collections.sort() method to sort the list element. The java.util package
 provides a utility class Collections which has the static method sort(). 
 Using the Collections.sort() method, we can easily sort any List.*/
		System.out.println(list);
		System.out.println(list.equals(list));
		System.out.println(list.get(3));
	}

}
