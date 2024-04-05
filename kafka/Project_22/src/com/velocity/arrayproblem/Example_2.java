package com.velocity.arrayproblem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example_2 {
	//The reverse method of Collections class 
	//can be used to reverse any collection. 
	//It is a static method. 

	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("akshay");
		arr.add("potdar");
		arr.add("kundal");
		System.out.println("printing the original"+arr.toString());
		
		Collections.reverse(arr);
		System.out.println("printing the reverse"+arr);

	}

}
