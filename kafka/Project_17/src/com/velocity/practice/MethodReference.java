package com.velocity.practice;

public class MethodReference {
	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		Thread t2= new Thread(MethodReference::ThreadStatus);
		t2.start();
		

	}

}
