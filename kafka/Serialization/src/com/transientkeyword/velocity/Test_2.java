package com.transientkeyword.velocity;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.serializationwithinherit.velocity.Child;
public class Test_2 extends Child {

	  public String stu_Addr;
	  public int stu_Id;

	  public Test_2(String stu_Name, String stu_Addr, int stu_Id) {
	    super(stu_Name);
	    this.stu_Addr = stu_Addr;
	    this.stu_Id = stu_Id;
	  }

	  
	}