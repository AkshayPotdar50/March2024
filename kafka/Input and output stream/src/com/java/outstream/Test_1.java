package com.java.outstream;
import java.io.*;
public class Test_1{
	public static void main(String[] args)  throws IOException {
    	try{
    	// loading a file into f variable
		FileOutputStream f = new FileOutputStream("C:\\Users\\potda\\Desktop\\Demo.txt");

		String s = "Hello I am Akshay Potdar";
		char arr[] = s.toCharArray();
		// initializing x to 0
		int x = 0;
        // while loop untill the end of the string.
		while(x < s.length()){
			// writing a byte into "output.txt" file
			f.write(arr[x++]);
		}
		// closing a file
		f.close();
    	}
    	catch(Exception e){
    		// printing exception
	    	System.out.println(e);
	    }
    }
}
