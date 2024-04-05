package com.inputand.outputstream;
import java.io.*;
public class Fileinput{
	public static void main(String[] args)  throws IOException {
    	try{
    		// loading a file into f variable
		FileInputStream f = new FileInputStream("C:\\Users\\potda\\Desktop\\storeObject.txt");

		// initializing x to 0
		int x = 0;
                // while loop untill the end of the file.
		while ((x = f.read())!=-1){
			// printing the character
			System.out.print((char)x);
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
