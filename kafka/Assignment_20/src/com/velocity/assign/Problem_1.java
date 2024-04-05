package com.velocity.assign;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//1. Write program to add the five students mobile number into arraylist 
//and iterate that elements using iterator. 

public class Problem_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> arr= new ArrayList<String>();
		System.out.println("enter mobile no of student 1");
		arr.add(scanner.next());
		System.out.println("enter mobile no of student 2");
		arr.add(scanner.next());
		System.out.println("enter mobile no of student 3");
		arr.add(scanner.next());
		System.out.println("enter mobile no of student 4");
		arr.add(scanner.next());
		System.out.println("enter mobile no of student 5");
		arr.add(scanner.next());
		System.out.println("arraylist is"+arr);
		
		Iterator iterator = arr.iterator();  
	    
        System.out.println("student numbers after using iterator : ");  
    
        while (iterator.hasNext())  
            System.out.print(iterator.next() + " ");  
    
        System.out.println();  
    }  
		

	}


