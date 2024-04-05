package com.java.bubble;

/*It is the simplest sort method which performs sorting by repeatedly 
 * moving the largest element to the highest index of the array.
 *  It comprises of comparing each element to its adjacent element 
 *  and replace them accordingly.
 */

public class BubbleSort {
	//we are making a function to print array 
	public static void PrintArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,6,8,3,7,9};
		
		
		//bubble sort
		for(int i=0 ; i<arr.length-1; i++) {
			for(int j=0 ; j<arr.length-i-1 ; j++) {
				if(arr[j] > arr[j+1]) {
					//swapping two adjucent elements
					int temp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
           PrintArray(arr); //calling the function
	}

}
