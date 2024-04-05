package com.velocity.synchro;

public class Synchronization {

	public static void main(String[] args) {
		Printing print = new Printing();
		Thread thread = new Thread();
		A threadA = new A(print);
		B threadB = new B(print);
		threadA.start();
		threadB.start();

	}

}
