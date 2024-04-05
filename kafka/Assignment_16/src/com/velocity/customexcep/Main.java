package com.velocity.customexcep;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		try {
			product.productCheck();
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
