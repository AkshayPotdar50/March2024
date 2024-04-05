package com.advance.stringjoiner;

import java.util.StringJoiner;

public class Example {

	public static void main(String[] args) {
		StringJoiner stringJoiner=new StringJoiner("-");//passing comma(-) as delimiter 
		//Adding values to String Joiner
		stringJoiner.add("Ram"); 
		stringJoiner.add("Shyam"); 
		stringJoiner.add("ashok"); 
		stringJoiner.add("ajay"); 
		System.out.println(stringJoiner);
		} 

	}


