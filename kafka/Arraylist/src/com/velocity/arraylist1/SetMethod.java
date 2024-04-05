package com.velocity.arraylist1;
import java.util.*;

public class SetMethod {

  public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList<Integer>();
    num.add(15);
    num.add(9);
    num.add(20);
    num.add(35);
    System.out.println("ArrayList num : " + num);

    //Replacing element present at 0th index with 40
    num.set(0, 40);
    System.out.println("ArrayList num after updating : " + num);
  }
}

