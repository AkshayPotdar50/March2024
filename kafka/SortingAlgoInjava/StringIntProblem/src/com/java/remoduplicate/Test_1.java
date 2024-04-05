package com.java.remoduplicate;



public class Test_1 {

	public static void main(String[] args) {
		String s="programming";
	//approach 1
		StringBuilder sb= new StringBuilder();
		s.chars().distinct().forEach(c  -> sb.append((char) c) );
		System.out.println(sb);
	
	//approach 2
	char []  arr = s.toCharArray();
	StringBuilder sb2= new StringBuilder();
	for(int i=0; i< arr.length;i++) {
		boolean repeated =false;
		for(int j = i+1; j<arr.length; j++) {
			if(arr[i]==arr[j]) {
				repeated=true;
				break;
			}
		}if(!repeated) {
			sb2.append(arr[i]);
		}
	}
	System.out.println(sb2);
	
	}
}
