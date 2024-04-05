package com.velocity.arrayproblem;

public class Example_1  {

	public static void main(String[] args) {
		int [] arr1= new int[] {1,2,3,4,5,6};//Declaring an array
		String [] arr = new String [] {"Akshay","potdar"};
		System.out.println("Original array");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]+"");
		}
		 System.out.println();  
	        System.out.println("Array in reverse order: ");  
	        //Loop through the array in reverse order  
	        for (int i = arr1.length-1; i >= 0; i--) {  
	            System.out.print(arr1[i] + " ");  
	        } 
	        System.out.println("Array in reverse order: ");  
	        //Loop through the array in reverse order  
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " "); 
	    }  
	}
}