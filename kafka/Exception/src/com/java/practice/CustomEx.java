package com.java.practice;

import java.util.Scanner;

public class CustomEx {
	void Check(int weight) throws InvalidProductException{
		if(weight>120) {
			
			throw new InvalidProductException("product is overweight");
		}else {
			System.out.println("product is good");
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CustomEx customEx =new CustomEx();
		try {
			System.out.println("please enter the weight of product");
		int weight=scanner.nextInt();
		customEx.Check(weight);
		
		}catch(InvalidProductException ex) {
			System.out.println("caught the exception");
			System.out.println(ex.getMessage());
		}
		

	}

}
