package com.java.methods;

public class Test extends Thread{

@Override
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("this is child thread class");
		}
	}

}
