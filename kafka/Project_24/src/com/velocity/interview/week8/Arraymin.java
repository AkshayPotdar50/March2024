package com.velocity.interview.week8;

public class Arraymin {
	static int GetMin(int arr[], int n) {
	int res = arr[0];
	for(int i=1;i<n;i++)
		res = Math.min(arr[i], res);
	return res;
	}
	static int GetMax(int arr[], int n) {
		int res = arr[0];
		for(int i=1;i<n;i++)
			res = Math.max(arr[i], res);
		return res;
	}

	public static void main(String[] args) {
	int arr[] = {70,85,25,36,89};
	int n = arr.length;
	System.out.println("Minimum element in array "+GetMin(arr, n));
	System.out.println("maximum element in an array is"+GetMax(arr, n));
	
}

}
