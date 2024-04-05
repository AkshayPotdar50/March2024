package com.deserialization.velocity;
import java.io.*;
//for a class to be serialized it must implement serializable interface
public class Student implements java.io.Serializable {
private static final long serialVersionUID = -7034896651453955771L;
public String stu_Name;
 transient String stu_Addr; //if we use transient keyword it will avoid seruializing an object
  public int stu_Id;

  public static void main(String[] args) {
    // Create a Student object.
    Student std = new Student();
    std.stu_Name = "George";
    std.stu_Addr = "ABC,XYZ";
    std.stu_Id = 1;

    // To hold the deserialized byte-stream
    Student deserializedStudent;
    try {
      // Serializing the student object - std
      FileOutputStream fileOut = new FileOutputStream("C:\\Users\\potda\\Desktop\\storeObject.txt");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(std);
      out.close();
      fileOut.close();
      // Serialization complete
      System.out.printf("Object serialized");

      // Deserialization process
      FileInputStream fileIn = new FileInputStream("C:\\Users\\potda\\Desktop\\storeObject.txt");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      
      //Deserialization
      deserializedStudent = (Student) in.readObject();
      in.close();
      fileIn.close();

      // Printing the deserialized object.
      System.out.println("Deserialized Student...");
      System.out.println("Name: " + deserializedStudent.stu_Name);
      System.out.println("Address: " + deserializedStudent.stu_Addr);
    } catch (IOException i) {
      i.printStackTrace();
    } catch (Exception e) {
      System.out.println("Class not found");
      e.printStackTrace();
      return;
    }
  }
}

