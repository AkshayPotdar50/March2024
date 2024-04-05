package com.multithred.velocity;
public class TestThread {

	   public static void main(String args[]) {
	      RunnableTest obj1 = new RunnableTest( "Thread1");
	      obj1.start();
	      
	      RunnableTest obj2 = new RunnableTest( "Thread2");
	      obj2.start();
	   }   
	}
