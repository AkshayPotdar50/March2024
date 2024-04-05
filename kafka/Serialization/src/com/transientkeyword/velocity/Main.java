package com.transientkeyword.velocity;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
	    Test_2 s = new Test_2("George", "ABC, XYZ", 1);
	    try {
	      FileOutputStream fileOut = new FileOutputStream("storeObject.txt");
	      ObjectOutputStream out = new ObjectOutputStream(fileOut);
	      out.writeObject(s);
	      out.close();
	      fileOut.close();
	      System.out.printf("Object serialized");
	    } catch (IOException i) {
	      i.printStackTrace();
	    }
	  }
}
