package com.velocity.hashtable;

import java.util.Hashtable;

public class Test_1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();
		hashtable.put(1,"akshay");
		hashtable.clear();
		hashtable.put(2, "potdar");
		hashtable.clone();
		System.out.println(hashtable);

	}

}
