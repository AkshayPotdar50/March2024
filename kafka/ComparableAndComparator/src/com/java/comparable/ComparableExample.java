package com.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		List<Student> students= new ArrayList<>();
students.add(new Student("Alice", 20));
students.add(new Student("Bob", 21));
students.add(new Student("Charlie", 19));

System.out.println("Before sorting::");
for(Student student: students) {
	System.out.println(student.getName() +" -"+ student.getAge());
}

Collections.sort(students);
System.out.println("after sorting::");
for(Student student: students) {
	System.out.println(student.getName() +" -"+ student.getAge());
}
	}

}
