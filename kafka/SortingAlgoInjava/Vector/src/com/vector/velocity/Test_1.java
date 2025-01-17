package com.vector.velocity;
import java.util.Vector;

public class Test_1 {

  public static void main(String[] args) {
    // creating default vector(with capacity equals to 10)
    Vector<Integer> defaultVector = new Vector<Integer>();

    // creating a vector with the Capacity equals to 100
    Vector<Integer> fixedSizeVector = new Vector<Integer>(100);
    fixedSizeVector.add(100);
    fixedSizeVector.add(100);
    fixedSizeVector.add(100);

    // creating a vector of given Capacity = 30 and Increment=20
    // Here vector capacity will increase by 20 when needed
    Vector<Integer> incrementalVector = new Vector<Integer>(30, 20);

    // creating a vector with the given collection
    Vector<Integer> copyConstructorVector = new Vector<Integer>(fixedSizeVector );

    System.out.println(
      "Vector defaultVector has capacity : " +
      defaultVector.capacity() +
      " elements"
    );
    System.out.println(
      "Vector fixedSizeVector of capacity : " +
      fixedSizeVector.capacity() +
      " elements"
    );
    System.out.println(
      "Vector incrementalVector of capacity : " +
      incrementalVector.capacity() +
      " elements"
    );
    System.out.println(
      "Vector copyConstructorVector of capacity : " +
      copyConstructorVector.capacity() +
      " elements"
    );
  }
}

