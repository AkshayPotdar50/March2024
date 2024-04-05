package com.java.stack;
//importing stack class from util package
import java.util.Stack;
public class Method_2
{
 public static void main(String[] args) {
     //declaration of stack
     Stack<Integer> s = new Stack<>();

     //insert elements into stack
     s.push(10);
     s.push(20);
     s.push(30);

     //pop function returns and deletes thhe top element
     System.out.println(s.pop());
     /*This method removes the top 
     element from the stack and returns it 
     until the stack becomes completely empty*/
 }
}

