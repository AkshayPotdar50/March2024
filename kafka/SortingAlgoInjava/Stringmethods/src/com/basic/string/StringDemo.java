package com.basic.string;

import java.util.Scanner;

public class StringDemo {

	private static String getStudentName(String firstName , String lastName) {
         String name = firstName + lastName;
		return name;
	}
	public static void main(String[] args) {

		System.out.println("Enter your name>>");
		Scanner scanner= new Scanner(System.in);
		String firstName =scanner.next();
          String lastName =scanner.next();
     	String s= getStudentName(firstName ,lastName);
		System.out.println(s);
	}
}
