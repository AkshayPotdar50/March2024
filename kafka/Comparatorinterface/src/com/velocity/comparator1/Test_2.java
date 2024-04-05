package com.velocity.comparator1;

import java.util.TreeSet;
public class Test_2 {

	public static void main(String[] args) {
		TreeSet treeset = new TreeSet(new Test_1());
		treeset.add(10);
		treeset.add(0);
		treeset.add(15);
		treeset.add(5);
		treeset.add(20);
		treeset.add(20);
		System.out.println(treeset);

	}

}
