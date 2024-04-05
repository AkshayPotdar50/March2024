package com.java.test;

public class Test2 {

	public static void main(String[] args) {
		String str1="Java";
		String str2="Java";
		String Str3= new String("Java");
		String Str4= new String("Java");
		
		if(str1==str2) {
			System.out.println("string are equal");
		}else if(str1!=str2){
			System.out.println("string are not equals");
		}
		
		System.out.println(1+2+3+"welcome"+5);

	}
//in the above scenerio three objects will be created
	//IN tHE first case both objects are holding same value 
	//and string will be created in string constant pool
	
	//And last two will be created in heap memory bec we are using new kayword
}
