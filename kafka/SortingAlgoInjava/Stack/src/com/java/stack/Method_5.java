package com.java.stack;
//importing stack class from util package
import java.util.Stack;
public class Method_5
{
 public static void main(String[] args) {
     //declaration of stack
     Stack<Integer> s = new Stack<>();

     //checks if stack is empty
     System.out.println(s.empty());

     //insert elements into stack
     s.push(10);
     s.push(20);
     s.push(30);

     //checks if stack is empty
     System.out.println(s.empty());
    /* This method returns a boolean value.

     If the stack is empty it returns true otherwise it returns false.*/
 }
}

