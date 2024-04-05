package com.multithreading.lifecycle;
public class Test_1
{
    public static void main(String[] args) 
    {
        try
        {
            for(int threadCounter = 0;threadCounter < 10; threadCounter++)
            {
            	Thread task = new Thread(new MultiThreadingRunnableDemo());
                task.start();
                // Next thread doesn't start execution until the current thread has finished execution
                task.join();
            }
            
        } 
        catch(Exception e)
        {
            System.out.println("Error occured " + e.getMessage());
        }
    }
}
