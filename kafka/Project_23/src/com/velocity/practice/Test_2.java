package com.velocity.practice;

public class Test_2 {

	public static void main(String[] args) {
		int Array[] = {1,2,3,4,5};
		int Max = Integer.MIN_VALUE;
		for(int i=0;i<Array.length;i++) {
			if(Array[i]>Max) { 
				Max=Array[i];
			}
			
		}
			System.out.println("THE BIGGEST ELEMENT IN GIVEN ARRAY IS:"+Max);
		
		
		
		}

}
