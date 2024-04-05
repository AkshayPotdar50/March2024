package com.serializationwithinherit.velocity;
import java.io.*;

public class Child implements java.io.Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
protected  String stu_Name;

   protected Child(String stu_Name) {
    this.stu_Name = stu_Name;
  }
}



