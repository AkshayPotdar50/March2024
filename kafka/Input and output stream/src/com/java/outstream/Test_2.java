package com.java.outstream;
import java.io.*;
import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) 
	{
		try {
			//make object of the fileinput stream//
			FileInputStream fis=new FileInputStream("C:\\Users\\potda\\Desktop\\Demo.txt");
		Scanner sc=new Scanner(fis); //file to be scanned  
		//returns true if there is another line to read  
		while(sc.hasNextLine())
		{
		System.out.println(sc.nextLine()); //returns the line that was skipped  
		}
		sc.close(); //closes the scanner  
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
	}
}
