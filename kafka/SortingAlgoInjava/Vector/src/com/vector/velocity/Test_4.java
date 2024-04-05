package com.vector.velocity;
import java.util.Vector;

public class Test_4 {
	//iterating over our vector their are two methods

  public static void main(String args[]) {
    Vector<String> ourVector = new Vector<>();
    ourVector.add("a");
    ourVector.add("b");
    // basic for loop
    for (int index = 0; index < ourVector.size(); index++) {
      System.out.print(ourVector.get(index) + " ");
    }
    // Using the for each loop
    for (String str : ourVector) {
      System.out.print(str + " ");
    }
  }
}
