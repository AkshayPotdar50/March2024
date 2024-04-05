package com.java.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Test_1>arrayList= new ArrayList<Test_1>();
		arrayList.add(new Test_1(1, "akshay", 15896396, 23));
		arrayList.add(new Test_1(2, "akash", 85698745, 25));
		arrayList.add(new Test_1(2, "akhilesh", 856258436, 28));
		arrayList.add(new Test_1(2, "akila", 85658932, 22));
		Collections.sort(arrayList);
		for(Test_1 test_1:arrayList) {
			System.out.println(test_1.id+" "+test_1.name+" "+test_1.mobileno+" "+test_1.age+" "+" ");
		}
		
	}

}
