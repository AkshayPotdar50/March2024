package com.java.stack;

import java.util.Stack;

public class Method_1 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		 
        //insert elements into stack
        s.push(10);
        s.push(20);
        s.push(30);
        s.retainAll(s);/*Retains only the elements in this Vector 
        that are contained in thespecified Collection. 
        In other words, removes from this Vector allof its elements 
        that are not contained in the specified Collection.*/
        System.out.println("elements in stack"+s);
 
        
        }


	}


