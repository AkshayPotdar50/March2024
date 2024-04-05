package com.velocity.threadsafety;
public class A {
	synchronized void sum(int n)
	
	{

		// Creating a thread instance
		Thread t = Thread.currentThread();
		for (int i = 1; i <= 5; i++) {
			System.out.println(
				t.getName() + " : " + (n + i));
		}
	}
}



