package com.java.empty;

import java.util.Scanner;
import java.util.stream.Stream;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the count");
		int count=scanner.nextInt();
		
		System.out.println("fibonacci series using java 8");
		
		Stream.iterate(new int[]{0, 1}, FibonacciSeries  ->  new int[]{FibonacciSeries[1], FibonacciSeries[0] + FibonacciSeries[1]})
		.limit(count)
		.forEach(FibonacciSeries -> System.out.println(FibonacciSeries[0]  + " "));

	}

}
