package com.velocity.multithreading;
//class multithreading implements runnable
public class Example_1 implements Runnable {
public void run()
{
 try {
   // Displaying the running Thread
   System.out.println(
     "Thread " + Thread.currentThread().getId()
     + " is running");
 }
 catch (Exception e) {
   // exception is caught if occurred 
   System.out.println("Exception has occurred and is caught");
 }
}
}




