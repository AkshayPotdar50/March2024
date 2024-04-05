package com.velocity.interview.week8;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Vector_1 {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("akshay");
		vector.add("10232");
		vector.add("Akshay");
		/*vector.add("akshay");
		vector.add(null);*/
		System.out.println(vector);
		System.out.println("************************************");
		ArrayList<Vector<String>> arraylist = new ArrayList<Vector<String>>();
		arraylist.add(vector);
		System.out.println(arraylist);
		System.out.println("************************************");
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(arraylist);
		System.out.println(linkedlist);
		System.out.println("************************************");
		
		
		
	
		
		

	}

}
