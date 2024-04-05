package com.java.list;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_1 {

	public static void main(String[] args) {
	ArrayList<String> arrayList=new ArrayList<>();
	arrayList.add("akshay");
	arrayList.add("loves");
	arrayList.add("himself");
	arrayList.add("so");
	arrayList.add("i dont");
	arrayList.add("need");
	arrayList.add("anybody");
	//arrayList.add(null);
	System.out.println(arrayList);
	Collections.sort(arrayList);
	for(String me:arrayList) {
		System.out.println(me);
	}

	}

}
