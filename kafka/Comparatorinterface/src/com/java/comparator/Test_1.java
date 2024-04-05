package com.java.comparator;
/*
 * Java Comparable interface is used to order the objects of the user-defined class. 
 * This interface is found in java.lang package and contains only one method named 
 * compareTo(Object). It provides a single sorting sequence only, i.e., you can sort 
 * the elements on the basis of single data member only. For example, it may be rollno,
 *  name, age or anything else.
 *  */

public class Test_1 implements Comparable<Test_1> {

	int id;
	String name;
	long mobileno;
	int age;
	
	public Test_1(int id, String name, long mobileno, int age) {
		super();
		this.id = id;
		this.name = name;
		this.mobileno = mobileno;
		this.age = age;
	}
	/*
	 * compareTo(Object obj) method
public int compareTo(Object obj): It is used to compare the current object with
the specified object. It returns
positive integer :if the current object is greater than the specified object.
negative integer: if the current object is less than the specified object.
zero: if the current object is equal to the specified object.*/

	@Override
	public int compareTo(Test_1 test_1) {
		if(mobileno==test_1.mobileno) {
			return 0;
		}else if (mobileno>test_1.mobileno) {
			return 1;
		}else
		return -1;
		
		
	}
	
}
