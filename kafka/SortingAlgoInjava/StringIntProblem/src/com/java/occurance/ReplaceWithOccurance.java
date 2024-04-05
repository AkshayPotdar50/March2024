package com.java.occurance;
import java.util.Arrays;
public class ReplaceWithOccurance {

	public static void main(String[] args) {
		String s="akshay";
		char charToReplace ='a';
		if(s.indexOf(charToReplace) == -1) {
			System.out.println("given character is not present in the string");
			System.exit(0);
		}
		char [] arr =s.toCharArray();
		int count=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==charToReplace) {
				arr[i] = String.valueOf(count).charAt(0);
				count++;
				
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
