package com.velocity.assign;
import java.util.ArrayList;
import java.util.Scanner;
public class Problem_2 {
//. Design the generics arraylist for string and add five 
	//cities into it and iterate that using for each loop
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("enter the first city");
		arr.add(scanner.next());
		System.out.println("enter the second city");
		arr.add(scanner.next());
		System.out.println("enter the third city");
		arr.add(scanner.next());
		System.out.println("enter the forth city");
		arr.add(scanner.next());
		System.out.println("enter the fifth city");
		arr.add(scanner.next());
		System.out.println("arraylist brfore using loop"+arr);
		for(String L:arr){
			System.out.println(L);
			
		}

	}

}
