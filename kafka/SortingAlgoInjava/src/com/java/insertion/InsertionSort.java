package com.java.insertion;
/*As the name suggests, insertion sort inserts each element 
 * of the array to its proper place. It is a very simple sort method
 *  which is used to arrange the deck of cards while playing bridge.*/
public class InsertionSort {
	public static void PrintArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	public static void main(String[] args) {
		int arr [] = {5,6,3,4,8,7,2,6,9};
		//insertion sort
		for(int i=0 ; i<arr.length ;i++) {
			int current =arr[i];
			int j=i-1;
			while(j>0 &&arr[j]>current) {
				//swapping
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] =current;
		}
          PrintArray(arr);
	}

}
