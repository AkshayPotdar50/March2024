package com.multithred.velocity;
public class RunnableTest implements Runnable {
	   private Thread t;
	   private String threadName;
	   //constructor for assigning value//
	   RunnableTest( String name) {
	      threadName = name;
	      System.out.println("Created " +  threadName );
	   }
	   
	   public void run() {
	      System.out.println("Currently Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread is: " + threadName + ", " + i);
	            // Let the thread sleep for a while.
	            Thread.sleep(5000);
	         }
	      } catch (InterruptedException e) {
	         System.out.println("Thread is " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread is " +  threadName + " exiting!!!");
	   }
	   
	   public void start () {
	      System.out.println("Starting now " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}

	
