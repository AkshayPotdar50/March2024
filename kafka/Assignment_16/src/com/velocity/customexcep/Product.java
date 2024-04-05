package com.velocity.customexcep;

import java.util.Scanner;
public class Product extends Exception {
	public void productCheck() throws ProductException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter product weight");
		int weight = scanner.nextInt();
		if(weight>100) {
			System.out.println("the product weight is ok");
		}else {
			throw new ProductException("the product weight is not ok");
		
	}

	
	}

}


