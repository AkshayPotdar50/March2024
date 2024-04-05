package com.vector.velocity;
import java.util.Vector;

public class Test_5 {

  public static void main(String args[]) {
    Vector<String> ourVector = new Vector<>();
    ourVector.add("happy");
    ourVector.add("crying");
    System.out.println("Vector before update: " + ourVector);

    // Using set() method to replace “crying” with “laughing”
    ourVector.set(1, "laughing");
    System.out.println("Vector after update: " + ourVector);
  }
}

