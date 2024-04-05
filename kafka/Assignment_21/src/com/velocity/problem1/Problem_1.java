package com.velocity.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//1. Design the method which return the list that contain the element as Ram, Sohan,
//Ashok, Ajay, Prasanna now I want to sort that element based on descending order.
public class Problem_1 {

	public static void main(String[] args) {
		List<String> str = new ArrayList<>(Arrays.asList("Ram", "Sohan", "Ashok", "Ajay", "Prasanna"));
		System.out.println("the arraylist before sorting"+str);
		Collections.sort(str,Collections.reverseOrder());
		System.out.println("the arraylist in descending order"+str);
		
		
		

	}

}
