package com.java.matrix;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Example_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row =scanner.nextInt();
		
		System.out.println("enter the number of columns:");
		int col= scanner.nextInt();
		
		//create 2d array
		int data [] []= new int [row] [col];
		
		System.out.println("please enter the matrix data:");
		
		for(int i=0; i< row; i++) {
			for(int j=0; j<col ;j++) {
				
				data[i][j] = scanner.nextInt();
				
			}
		}
		 //print the array
		for(int[] r: data) {
			String arr = Arrays.toString(r);
			System.out.print(arr);
			System.out.println("***********************************");
			}

	}

}
