package com.velocity.practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number ");
		int N=scanner.nextInt();
		int num1=0;
		int num2=1;
		System.out.println("fibonacci series sequence N=" +N);
		System.out.println(num1+" "+num2);
		int i=2;
		while(i<=N) {
			i++;
			int temp=num1+num2;
			num1=num2;
			num2=temp;
			System.out.print(" "+num2);
			
		}
		

	}

}
