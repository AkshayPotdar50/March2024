package com.multithreading.lifecycle;
/*Method 1: Creating a thread by Extending Thread Class
To create a thread, we first create a class that will 
extend the Thread class of java.lang package.*/
public class MutiThreadingDemo extends Thread
{
public void messege()
{
 System.out.println("Message: " + Thread.currentThread().getId());
    }
/*This created 
class must override the run() method of the Thread class to
 define the task this thread needs to perform.*/
    public void run() 
    {
        try 
        {
            this.messege();
            /*This method 
            begins the execution of our newly created thread.*/
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured: " + e.getMessage());
        }
    }
}
 


 
