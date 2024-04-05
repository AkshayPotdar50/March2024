package com.java.selection;
/* Selection sort finds the smallest element in the array and place it on the first 
 * place on the list, then it finds the second smallest element in the array and place
 *  it on the second place. This process continues until all the elements are moved 
 *  to their correct ordering. It carries running time O(n2) which is worst than insertion sort.*/
public class Selection {
	public static void PrintArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {7,4,5,6,9,8,2,1};
		//selection sort
		for(int i=0 ; i<arr.length-1 ; i++) {
			int smallest = i;
			for(int j=i+1; j<arr.length ; j++) {
				if(arr[smallest] > arr[j]) {
					smallest=j;
				}
			}
			int temp=arr[smallest];   //swapping
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
              PrintArray(arr);
	}

}
