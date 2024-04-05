package com.velocity.pune;

public class Case_1 {
	static int no =5;

	public static void main(String[] args) {
		//ways to access static variable//
		//creating object in class name//
		Case_1 case_1 = new Case_1();
		//access static variable using object name//
		System.out.println("first way of accessing static variable :" +Case_1.no);
		//access ststic variable using class name//
		System.out.println("second way of accessing static variable:" +Case_1.no);
		//accessing static variable directly//
		System.out.println("third way of accessing staic variable:" +no);
	

	}

}
