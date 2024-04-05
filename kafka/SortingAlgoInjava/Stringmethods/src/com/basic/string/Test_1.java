package com.basic.string;
public class Test_1 {

	public static void main(String[] args) {

		String str = "velocity training center pune";

		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
//method for measuring blank spaces in string//
			char ch = str.charAt(i);
			if (ch == ' ') {
				counter++;
			}
		}
		System.out.println("total space in string are>>" + counter);
	}
}


