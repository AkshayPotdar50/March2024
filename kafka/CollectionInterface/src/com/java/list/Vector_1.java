package com.java.list;

import java.util.Vector;

public class Vector_1{

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		System.out.println(vector.capacity());
		/*
		 * If the increment is specified, Vector will expand according to it in 
		 * each allocation cycle. Still, if the increment is not specified, then the 
		 * vector’s capacity gets doubled in each allocation cycle. Vector 
		 * defines three protected data members:

        int capacityIncreament: Contains the increment value.
        int elementCount: Number of elements currently in vector stored in it.
        Object elementData[]: Array that holds the vector is stored in it.*/
		vector.add("akshay");
		vector.add("rajendra");
		vector.add("potdar");
		vector.add("kundal");
		vector.add("sangli");
		vector.add("maharashtra");
		vector.add("akshay");
		vector.add("rajendra");
		vector.add("potdar");
		vector.add("akshay");
		vector.add("rajendra");
		vector.add("potdar");
		System.out.println(vector.capacity());
		System.out.println(vector);
		System.out.println(vector.iterator());
		System.out.println(vector.listIterator());
		System.out.println(vector.spliterator());

	}

}
