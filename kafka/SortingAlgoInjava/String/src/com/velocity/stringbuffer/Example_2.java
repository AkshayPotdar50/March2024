package com.velocity.stringbuffer;

public class Example_2 {

	public static void main(String[] args) {
		StringBuffer m = new StringBuffer("Hello");
		//Appending the character "a" (97) to the sequence.
		m.appendCodePoint(97);
		System.out.println(m);


	}

}
