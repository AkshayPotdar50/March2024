package com.velocity.stringbuffer;

public class Example_4 {

	public static void main(String[] args) {
		StringBuffer m = new StringBuffer("Scaler,akshay");
		//Deleting the character at index 2.
		m.deleteCharAt(2);
		m.deleteCharAt(9);
		System.out.println(m);


	}

}
