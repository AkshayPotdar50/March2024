package com.java.lamda;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList =new ArrayList<>();
		arrayList.add(25);
		arrayList.add(36);
		arrayList.add(89);
		arrayList.add(58);
		arrayList.forEach((n) -> {System.out.println(n);});

	}

}
