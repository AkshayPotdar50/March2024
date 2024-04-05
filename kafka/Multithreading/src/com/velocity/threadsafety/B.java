package com.velocity.threadsafety;
//Class B extending thread class
public class B extends Thread {

	// Creating an object of class A
	A a = new A();
	public void run()
	{

		// Calling sum() method
		a.sum(10);
	}
}
