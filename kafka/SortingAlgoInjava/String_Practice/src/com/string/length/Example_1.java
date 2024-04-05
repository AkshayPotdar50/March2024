package com.string.length;

import java.util.Scanner;

public class Example_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string to reverse");
		String str = scanner.next();
		int i=0;
		for(char c: str.toCharArray()) {
			i++;
			
		}
		System.out.println("length of given string is:"+i);
		
	}

}
