package com.java.methods;

public class Main extends Thread {
	public void shoe() {
		for(int i=0;i<=10;i++) {
			System.out.println("this is main class thread");
		}
	}

	public static void main(String[] args) {
		Test test=new Test();
		test.start();
		Main main = new Main();
		main.shoe();
		
		
		
		
		

	}

}
