package com.java.stack;
//importing stack class from util package
import java.util.Stack;
public class Method_4
{
 public static void main(String[] args) {
     //declaration of stack
     Stack<Integer> s = new Stack<>();

     //insert elements into stack
     s.push(10);
     s.push(20);
     s.push(30);//this method will return -1 as element is not present in  stack

     //searching if an element exists 
     System.out.println(s.search(20));
     System.out.println(s.search(50));
    /* This method is used to know whether an 
     * element exists in our stack or not.
     If the element exists it returns the position of 
     that element from the top of the stack.*/
 }
}

