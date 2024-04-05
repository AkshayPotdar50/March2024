package com.multithreading.practice;
public class Test_1 implements Runnable
{
       public static void main(String[] args) {
        Thread akshayThread1 = new Thread("Potdar1");
        Thread akshayThread2 = new Thread("Potdar2");
        akshayThread1.start();
        akshayThread2.start();
        System.out.println("Thread names are following:");
        System.out.println(akshayThread1.getName());
        System.out.println(akshayThread2.getName());
    }
    @Override
    public void run() {
    }
}
