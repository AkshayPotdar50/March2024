package com.velocity.assign18;

public class Problem_1 {
    public static int
    //define a Function to get missing number
    MissingNumber(int[] arr)
    {
        int n=arr.length;  //define an variable
        int sum1=((n)*(n+1))/2;  //define sum variables
        int sum2 = 0;
        for(int i=0;i<n;i++)
          sum2+=arr[i];
        return sum1-sum2;
    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 4, 5, 6, 8 ,9};
        System.out.println(MissingNumber(arr));
    }
}
