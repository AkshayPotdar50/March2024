package com.multithreading.lifecycle;

public class MultiThreadingRunnableDemo implements Runnable {
	 public synchronized void message()
	    {
	        System.out.println("Message: " + Thread.currentThread().getId());
	    }

	@Override
	public void run() 
    {
        try 
        {
            this.message();
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured: " + e.getMessage());
        }
    }
}
