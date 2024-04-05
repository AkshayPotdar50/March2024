package com.vector.velocity;
import java.util.Vector;

public class Test_6 {

  public static void main(String[] arg) {
    Vector ourVector = new Vector();
    ourVector.add("Scaler");
    ourVector.add(2);
    ourVector.add(3);
    ourVector.add("InterviewBit");
    ourVector.add(10);
    System.out.println(" Original Vector : " + ourVector);

    // removing the first occurrence of b
    ourVector.remove("Scaler");

    System.out.println("Vector after removing Scaler: " + ourVector);

    // removing the element at index 0
    ourVector.remove(0);
    System.out.println(
      "Vector after removing element at index 0: " + ourVector
    );

    // removing the Integer element with value = 10
    ourVector.remove(new Integer(10));
    System.out.println(
      "Vector after removing Integer valued 10: " + ourVector
    );
  }
}
