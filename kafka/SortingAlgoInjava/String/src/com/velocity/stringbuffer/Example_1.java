package com.velocity.stringbuffer;

public class Example_1 {

	public static void main(String[] args) {
		StringBuffer first = new StringBuffer("String");
		//This line is appending the String in the sequence
		first.append("hello");
		System.out.println(first);
		//This line is appending the integer to the sequence
		first.append("1");
		System.out.println(first);

	}

}
