package com.assign.problem4;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_4 {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>(Arrays.asList("mumbai", "pune", "Bangalore", "Hyderabad", "mumbai"));
		System.out.println("arraylist before removing"+str);
		str.remove("mumbai");
		System.out.println("arraylist after removing"+str);

	}

}
