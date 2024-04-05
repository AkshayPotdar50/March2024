package com.java.except;

public class NullPointer {

	public static void main(String[] args) {
		String s=null;
		System.out.println(s.length());
	}
/*
 * Exception in thread "main" java.lang.NullPointerException: 
 * Cannot invoke "String.length()" because "s" is null
	at com.java.except.NullPointer.main(NullPointer.java:7)
	NullPointerException occurs when a user tries to access 
	variable that stores null values. For example, if a variable 
	stores null value and the user tries to perform any operation 
	on that variable throws NullPointerException.
*/
}
