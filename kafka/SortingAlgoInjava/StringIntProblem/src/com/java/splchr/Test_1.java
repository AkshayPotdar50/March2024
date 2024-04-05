package com.java.splchr;

public class Test_1 {

	public static void main(String[] args) {
		//replacing special character in string by replace all method
		String s = "!a@k$s#h%a&y#";
		String p=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(p);

	}

}
