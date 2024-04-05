package com.vector.velocity;
import java.util.Vector;

public class Test_2 {

  public static void main(String args[]) {
    // A new vector with size = 4, increment = 2.
    Vector<Comparable> myVector = new Vector<Comparable>(4, 2);

    System.out.println("Initial size: " + myVector.size());
    System.out.println("Initial capacity: " + myVector.capacity()); // Initial capacity: 4

    myVector.addElement(new String("Java"));
    myVector.addElement(new String("C++"));
    myVector.addElement(new String("Python"));
    myVector.addElement(new String("Javascript"));

    System.out.println("Capacity after four additions: " + myVector.capacity()); // Capacity after four additions: 4
    
    // Since, the size, and capacity are now equal,
    // Addition of one more element will increase the capacity by 2.
    myVector.addElement(100);
    
    System.out.println(
      "Capacity after one more addition: " + myVector.capacity()
    ); // Capacity after one more addition : 6

    myVector.addElement(2.0);
    myVector.addElement(72);
    
    System.out.println("Capacity after two more additions: " + myVector.capacity()); // Capacity after two addition: 8

    System.out.println("Final Vector = " + myVector);
  }
}

