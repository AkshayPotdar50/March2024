package com.velocity.assign18;

public class Problem_2 {

	public static void main(String[] args) {
		int [] arr = {10, 20, 30, 10, 30, 50, 60};
		for(int i=0 ; i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println("Duplicate elements are:"+arr[j]);
				}
			}
		}

	}

}
