package com.velocity.fileop;
import java.io.FileInputStream;
import java.io.IOException;
public class Test_1{
	public static void main(String[] args)  throws IOException {
    	try{
    		// loading a file into f variable
		FileInputStream f = new FileInputStream("C:\\Users\\potda\\Desktop\\storeObject.txt");

		// initializing x to 0
		int x;
                // while loop untill the end of the file.
		while ((x = f.read())!=-1){
			// printing the character
			String line;
			line = Character.toString((char) x);
		    int vowels = 0, digits = 0; 
            line = line.toLowerCase();
			for(int i = 0; i < line.length(); ++i)
			{
			x = line.charAt(i);
			if(x == 'a' || x == 'e' || x == 'i'
			|| x == 'o' || x == 'u') {
			++vowels;
			}
			else if( x >= '0' && x <= '9')
			{
			++digits;
			}
			System.out.println("Vowels:"  + vowels);
			System.out.println("Digits: " + digits);
			}
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
