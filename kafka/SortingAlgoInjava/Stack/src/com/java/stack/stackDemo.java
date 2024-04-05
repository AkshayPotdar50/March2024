package com.java.stack;
//importing stack class from util package
import java.util.Stack;
public class stackDemo
{
     public static void main(String[] args) {
         //declaration of stack
         Stack<Integer> sample = new Stack<Integer>();

         //insert elements into stack
         sample.push(10);
         sample.push(20);
         sample.push(30);
         sample.push(40);
         sample.push(50);

         //printing and deleting top element of stack
         while(!sample.empty()) {
             System.out.println(sample.peek());
             sample.pop();
         }
     }
}
