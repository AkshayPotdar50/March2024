package com.assign14.velocity;
import java.util.Scanner;
public class Multiplicationtable {

	public static void main(String[] args) {
		int a,i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the number");
		 a= scanner.nextInt();
		 for (i=1;i<=10;i++) {
			 System.out.println("Table for given number is"+a*i);
		 }

	}

}
