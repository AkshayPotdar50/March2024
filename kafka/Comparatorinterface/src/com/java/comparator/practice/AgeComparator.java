package com.java.comparator.practice;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		Student s1 =(Student)o1;
		Student s2 =(Student)o2;
		
		/* AGE COMPARATOR*/
		if(s1.age==s2.age) {
			return 0;
		}else if (s1.age>s2.age) {
			return 1;
		}else
		return -1;
	}

}
