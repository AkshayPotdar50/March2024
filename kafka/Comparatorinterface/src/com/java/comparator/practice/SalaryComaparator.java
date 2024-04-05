package com.java.comparator.practice;

import java.util.Comparator;

public class SalaryComaparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		Student s1 =(Student)o1;
		Student s2 = (Student)o2;
		if(s1.salary==s2.salary) {
			return 0;
		}else if (s1.salary>s2.salary) {
			return 1;
		}else
		return -1;
	}

}
