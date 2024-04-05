package com.java.outstream;
import java.io.FileWriter;

public class Test_3 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\potda\\Desktop\\Demo.txt");
			fw.write("velocity corporate training centre pune");
			fw.close();
			
		}catch(Exception e){System.out.println(e);}
		System.out.println("Success...");
	}
}

	
