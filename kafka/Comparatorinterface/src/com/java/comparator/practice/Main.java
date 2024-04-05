package com.java.comparator.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> aList = new ArrayList<>();
		aList.add(new Student(1, "akshay", 886699553, 22, 36000));
		aList.add(new Student(1, "akshita", 886236576, 20, 36369));
		aList.add(new Student(1, "akillin", 882358744, 26, 36589));
		aList.add(new Student(1, "akshata", 886369852, 29, 38254));
          
		System.out.println("sorting by age");
		Collections.sort(aList,new AgeComparator());
		Iterator itr = aList.iterator();
		while(itr.hasNext()) {
			Student student=(Student)itr.next();
			System.out.println(student.id+" "+student.name+" "+student.miblileNo+" "+student.salary+" "+student.age+" "+" ");
			}
		System.out.println("****************************************************");
		System.out.println("sorting by name");
		Collections.sort(aList,new NameComparator());
		Iterator itr1 = aList.iterator();
		while (itr1.hasNext()) {
			Student student = (Student) itr1.next();
			System.out.println(student.id+" "+student.name+" "+student.miblileNo+" "+student.salary+" "+student.age+" "+" ");
			}
		System.out.println("******************************************************");
		System.out.println("sorting by salary");
		Collections.sort(aList,new SalaryComaparator());
		Iterator itr2 =aList.iterator();
		while(itr2.hasNext()) {
			Student student = (Student)itr2.next();
			System.out.println(student.id+" "+student.name+" "+student.miblileNo+" "+student.salary+" "+student.age+" "+" ");
			
		}
	}

}
