package com.java.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class NumberSequence {

	public static void main(String[] args) {
	int n =10;
	
	ExecutorService executerService=Executors.newFixedThreadPool(5);
	
	//generate a sequence of numbers from 1 to n
	IntStream.rangeClosed(1, n)
	.forEach(num -> executerService.submit(() ->{
		System.out.println("Thread:" +Thread.currentThread().getName()+ "number" +num);
	}));

	}

}
