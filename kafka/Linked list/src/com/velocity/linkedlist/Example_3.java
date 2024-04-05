package com.velocity.linkedlist;
import java.util.*;
public class Example_3 {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Learning");
		ll.add("LinkedList");
		ll.add("with");
		ll.add("Scaler");
		ll.add("Topics");
		
		//Iterating over LinkedList using get() method and for loop
		for(int i=0;i<ll.size();i++){
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		//Iterating over LinkedList for-each loop
		for(String s:ll){
			System.out.print(s+" ");
		}	
	}
}

