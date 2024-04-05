package com.java.reverse;

public class Test_1 {

	public static void main(String[] args) {
		String s = "akshay";
		char[] charArray =s.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}

	}

}
