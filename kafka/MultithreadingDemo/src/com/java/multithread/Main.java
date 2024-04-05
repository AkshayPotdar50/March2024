package com.java.multithread;

/*
 * the class which extends thread also extend the runnable interface*/
public class Main {

	public static void main(String[] args) {
		Test_1 test_1 = new Test_1();
		test_1.start();
		for(int i=0; i<100; i++) {
			System.out.println("this is main method thread");
		}

	}

}
