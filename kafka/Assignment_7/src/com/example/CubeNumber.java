package com.example;
import java.util.Scanner;

public class CubeNumber{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//second scanner is capital for creating object
		System.out.println("please enter the number");
		int number = scan.nextInt();
		getCube(number);
	}
	
	public static void getCube(int no)
	{
		int number = no*no*no;
		System.out.println("cube of" +no+ "is"+number);
	}
		
		
		
		
	}


