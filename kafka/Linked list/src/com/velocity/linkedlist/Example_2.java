package com.velocity.linkedlist;
import java.util.*;
public class Example_2 {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Learning");
		ll.add("LinkedList");
		ll.add("with");
		ll.add("with");
		ll.add("Scaler");
		ll.add("Topics");
		
		//Removing the element "with" from the LinkedList
		ll.remove("with");

		System.out.println(ll);	
	}
}
