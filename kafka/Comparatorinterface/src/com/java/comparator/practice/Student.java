package com.java.comparator.practice;
/*the comparator interface is used for custom sorting
 * This interface is found in java.util package and contains 2 methods
 *  compare(Object obj1,Object obj2) and equals(Object element).
It provides multiple sorting sequences, i.e., you can sort the elements 
on the basis of any data member, for example, rollno, name, age or anything else.*/

public class Student {
	int id;
	String name;
	long miblileNo;
	int age;
	long salary;
	public Student(int id, String name, long miblileNo, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.miblileNo = miblileNo;
		this.age = age;
		this.salary = salary;
	}
	
	

}
