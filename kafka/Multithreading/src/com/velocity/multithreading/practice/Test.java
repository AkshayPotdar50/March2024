package com.velocity.multithreading.practice;
public class Test {
    public static void main(String args[]) {
        // creating object of the sub classes.
        ChildClass1 cc1 = new ChildClass1();
        ChildClass2 cc2 = new ChildClass2();
        ChildClass3 cc3 = new ChildClass3();
        
        // starting the new thread execution.
        cc3.start();
        cc2.start();
        cc1.start();
    }
}