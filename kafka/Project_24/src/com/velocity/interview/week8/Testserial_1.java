package com.velocity.interview.week8;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Testserial_1 implements java.io.Serializable {
private static final long serialVersionUID = 1L;
String s1; 
String s2;
String s3;

public static void main(String[] args) {
	Testserial_1 test = new Testserial_1();
	test.s1="akshay";
	test.s2="potdar";
	test.s3="kundal";
	try {
		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\potda\\Desktop\\storeObject.txt");
	      //Serializing object
	      ObjectOutputStream out = new ObjectOutputStream(fileOut);
	      out.writeObject(test);
	   // Close the output stream.
	      out.close();
	        
	      // Close the file.
	      fileOut.close();
	      System.out.printf("Object serialized");
	}catch (IOException i) {
	      i.printStackTrace();
	
	}

}
}
