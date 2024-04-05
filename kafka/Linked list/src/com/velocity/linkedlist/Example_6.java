package com.velocity.linkedlist;
import java.util.*;
public class Example_6 {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		//Inserting Elements at the Front of the List 
		ll.addFirst("Learning");
		ll.addFirst("LinkedList");
		//Inserting Elements at the End of the List 
		ll.addLast("with");
		ll.addLast("Scaler");
		ll.addLast("Topics");

		//Printing the First Element and the Last Element
		System.out.println("First Element: " + ll.getFirst());
		System.out.println("Last Element: " + ll.getLast());
		//Removing the First and the Last Element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("List after removing first and last Element: " + ll);
	}
}
