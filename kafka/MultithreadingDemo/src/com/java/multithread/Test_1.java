package com.java.multithread;
/*
 * we can create thread class by extebding thread class or by implementing
 * runnable interface*/

public class Test_1 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("this is child thread class");
		}
		
	}

}
