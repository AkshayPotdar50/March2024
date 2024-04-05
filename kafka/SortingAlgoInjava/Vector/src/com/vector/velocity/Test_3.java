package com.vector.velocity;
import java.util.Vector;

public class Test_3 {

  public static void main(String[] arg) {
    Vector<Integer> ourVector = new Vector<Integer>(100);
    // Let’s add two elements
    // Inserting elements at the end of the vector.
    ourVector.add(2);

    // Inserting element at index = 1, i.e. end of the vector
    // We cannot insert element at any index > size of the vector
    ourVector.add(1, 3);
    System.out.println("Vector is: " + ourVector);
  }
}

