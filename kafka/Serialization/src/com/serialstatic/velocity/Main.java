package com.serialstatic.velocity;
import java.io.*;

public class Main implements java.io.Serializable {

  static int x = 50;

  public static void main(String[] args) {
    Main s = new Main();
    System.out.println("Value before serialization: " + x);
    try {
      // Serialization
      FileOutputStream fileOut = new FileOutputStream("storeObject.txt");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(s);
      out.close();

      // Serialization complete
      // Static member value changed
      x = 48;
      fileOut.close();
      System.out.println("Object serialized");

      // Deserialization
      FileInputStream fileIn = new FileInputStream("storeObject.txt");
      ObjectInputStream in = new ObjectInputStream(fileIn);

      s = (Main) in.readObject();
      in.close();
      fileIn.close();

      // Value of static member not revived
      System.out.println("Value after serialization: " + x);
    } catch (IOException i) {
      i.printStackTrace();
    } catch (Exception e) {
      System.out.println("Class not found");
      e.printStackTrace();
      return;
    }
  }
}
/*In the above code, class has a static member of type int, 
 * with the value 50, when an object of this class was serialized. 
 * After this object was serialized, the value of the static member is 
 * changed to 48 by the program.
 *When this object is deserialized, the value of static member is not restored 
 *to its original value of 50 which was the value when the object was serialized,
 * because the static member belong to its class and not the object.
Hence, the process of serialization and deserialization only works on the object 
of a class and it doesn't affect a static member of a class, and therefore, when 
object was deserialized, the value of static member is found to be 48 and not 50.*/


