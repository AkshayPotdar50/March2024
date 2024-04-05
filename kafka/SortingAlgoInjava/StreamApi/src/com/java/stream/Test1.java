package com.java.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Integer>arrayList=new ArrayList<Integer>();
		arrayList.add(2);
		arrayList.add(9);
		arrayList.add(16);
		arrayList.add(17);
		/*arrayList.stream().forEach(x -> System.out.println(x));*/
		ArrayList<Integer> arrayList2=new ArrayList<>();
		arrayList2.stream().filter(x -> x<=15).collect(Collectors.toList());
		arrayList2.stream().forEach(x -> System.out.println(x));

	}

}
