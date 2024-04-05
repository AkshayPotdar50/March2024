package com.transientkeyword.velocity;
import java.io.*;

public class Student implements java.io.Serializable {

  public String stu_Name;
  transient String stu_Addr;
  public int stu_Id;

  public static void main(String[] args) {
    Student s = new Student();
    s.stu_Name = "George";
    s.stu_Addr = "ABC,XYZ";
    s.stu_Id = 1;
    try {
      FileOutputStream fileOut = new FileOutputStream("C:\\Users\\potda\\Desktop\\storeObject.txt");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(s);
      out.close();
      fileOut.close();

      // Serialization complete
      System.out.println("Object serialized");

      FileInputStream fileIn = new FileInputStream("C:\\Users\\potda\\Desktop\\storeObject.txt");
      ObjectInputStream in = new ObjectInputStream(fileIn);

      // Deserialization in process.
      s = (Student) in.readObject();

      // Close input stream and the file.
      in.close();
      fileIn.close();
    } catch (IOException i) {
      i.printStackTrace();
      return;
    } catch (Exception e) {
      System.out.println("Class not found");
      e.printStackTrace();
      return;
    }
    // Print the values of deserialized object.
    System.out.println("Deserialized Student...");
    System.out.println("Name: " + s.stu_Name);
    System.out.println("Address: " + s.stu_Addr);
  }
}
