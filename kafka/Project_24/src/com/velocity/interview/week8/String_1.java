package com.velocity.interview.week8;
import java.io.Serializable;
public class String_1 implements Serializable {

	public static void main(String[] args) {
		String s= "akshay";
		System.out.println(s +" " +s.intern());

	}

}
