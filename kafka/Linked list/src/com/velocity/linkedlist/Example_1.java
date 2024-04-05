package com.velocity.linkedlist;
//Importing required Classes
import java.util.*;
public class Example_1 {
	public static void main(String args[]) {
		//Creating object of class LinkedList
		LinkedList<String> abc = new LinkedList<String>();
		//Adding element at the end of LinkedList
		abc.add("akshay");
		abc.add("rajendra");
		abc.add("potdar");

		//Adding element at the specified index
		abc.add(1,"ashish");
		//Printing the Linked List
		System.out.println(abc);	
	}
}
