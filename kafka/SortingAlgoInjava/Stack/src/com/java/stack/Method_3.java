package com.java.stack;
//importing stack class from util package
import java.util.Stack;
public class Method_3
{
 public static void main(String[] args) {
     //declaration of stack
     Stack<Integer> s = new Stack<>();

     //insert elements into stack
     s.push(10);
     s.push(20);
     s.push(30);

     //returning top element 
     System.out.println(s.peek());
     /*This method returns us the top element of the stack. 
     It throws an error when we use it with an empty stack 
     and tells us underflow.*/

     while(!s.empty())s.pop();
     System.out.println(s.peek());
 }
}

