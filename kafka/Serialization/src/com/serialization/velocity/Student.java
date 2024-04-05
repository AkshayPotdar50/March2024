package com.serialization.velocity;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Student implements java.io.Serializable {
private static final long serialVersionUID = 3860753155186489082L;
public String stu_Name;
  public String stu_Addr;
  public int stu_Id;

  public static void main(String[] args) {
    Student std = new Student();
    std.stu_Name = "George";
    std.stu_Addr = "ABC,XYZ";
    std.stu_Id = 1;
    try {
      FileOutputStream fileOut = new FileOutputStream("C:\\Users\\potda\\Desktop\\storeObject.txt");
      //Serializing object
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(std);
        
      // Close the output stream.
      out.close();
        
      // Close the file.
      fileOut.close();
      System.out.printf("Object serialized");
    } catch (IOException i) {
      i.printStackTrace();
      /*The printStackTrace() method in Java is a tool used to handle exceptions 
      and errors. It is a method of Java's throwable class which prints the 
      throwable along with other details like the line number and class name
      where the exception occurred. printStackTrace() is very useful in diagnosing
      exceptions.*/
    }
  }
}
/*Explanation:

The code snippet shows serialization of an Object of type Student. A text file called storeObject is created with the help of the FileOutputStream class.
FileOutputStream is an output stream which is used for writing data into a file. Next the ObjectOutputStream class is used to write the object to an OutputStream.
writeObject(Object ob) is used to serialize objects into byte-streams.
So the object is converted to a byte-stream. Hence, serialization is complete.*/

