package com.velocity.multithreading;
public class MultithreadMain {
public static void main(String[] args)
{
 int n = 6; 	// Number of threads
 for (int i = 0; i < n; i++) {
   Thread obj
     = new Thread(new Example_1());
   obj.start();
 }
}
}