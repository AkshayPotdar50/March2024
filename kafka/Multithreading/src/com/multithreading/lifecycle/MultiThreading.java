package com.multithreading.lifecycle;
public class MultiThreading
//After this, we can now make an object of the Thread class 
//and call its start() method for its execution. The start() 
//method invokes the run() method of the Thread class.
{
    public static void main(String[] args) 
    {
        for(int threadCounter = 0;threadCounter < 10; threadCounter++)
        {
        	MutiThreadingDemo task = new MutiThreadingDemo();
            task.start();
        }
    }
}
