package com.velocity.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem_2 {
	/*2.Suppose I have one container that contain  different colors
	of ballons such as Red, Blue, Green, Red,Blue,Red, Blue, Green
	in this order, now sort that baloon in such manner so Red baloon 
	will be added first then Blue baloon and last is Green balloons.
	Use the proper collection.*/
public static void main(String[] args) {
	List<String> str1 = new ArrayList<>(Arrays.asList("red", "red"));
	List<String> str2 = new ArrayList<>(Arrays.asList("blue", "blue"));
	List<String> str3 = new ArrayList<>(Arrays.asList("Green", "Green"));
	LinkedList linkedlist = new LinkedList();
	linkedlist.addFirst(str1);
	linkedlist.add(str2);
	linkedlist.addLast(str3);
	System.out.println(linkedlist);
	
	
	

	}

}
