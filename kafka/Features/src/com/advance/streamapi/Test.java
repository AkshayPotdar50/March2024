package com.advance.streamapi;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		//Creating one list
		List<Integer> list = Arrays.asList(2,4,7,9,3,5,61,23,50);
		
		//count the even number 
		long no = list.stream().filter(n -> n%2!=0).count();
		
		System.out.println("Even no's are : " +no);
	}

}

