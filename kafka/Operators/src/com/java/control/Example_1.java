package com.java.control;

import java.util.Scanner;

public class Example_1 {
	int i;
	public void getdata() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the number");
		i=scanner.nextInt();
	}
	
	public void SumOfDigits() {
		int sum =0;
		while(i>0) {
			sum=sum+(i%10);
			i=i/10;
		}
		System.out.println("sum of the numbers is:"+sum);
		
	}

	public static void main(String[] args) {
		Example_1 example_1 = new Example_1();
		int ch;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1-->sumOfDigits /n enter your choice ");
			ch=scanner.nextInt();
			switch(ch) {
			case 1:
				 example_1.getdata();
				 example_1.SumOfDigits();
				 break;
			}
		}while(ch!=13);
		

	}

}
