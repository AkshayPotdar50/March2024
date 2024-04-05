package com.velocity.linkedlist;
import java.util.*;
public class Example_5 {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		//Inserting Elements at the end of the List 
		ll.add("Learning");
		ll.add("LinkedList");
		ll.add("with");
		ll.add("Scaler");
		ll.add("Topics");
		//Printing the First Element - FIFO
		System.out.println("First Element: " + ll.peek());
		//Removing the First Element
		String removed = ll.poll();
		//This method is used to fetches and removes the first 
		//element of the list.
        System.out.println("Removed Element: " + removed);
		//Printing the LinkedList
		System.out.println("List after poll(): " + ll);
	}
}
