package com.java.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> arr= new ArrayList<Student>();
		arr.add(new Student(109, "akshay", 12000));
		arr.add(new Student(110, "ashish", 17523));
		arr.add(new Student(111, "keshav", 18530));
		arr.add(new Student(114, "swapnil", 18426));
		arr.add(new Student(115, "pravin", 14789));
		
		Student str = new Student();
		str.setId(108);
		str.setName("akhilesh");
		str.setSalary(18736);
		arr.add(str);
		Collections.sort(arr, new salaryComparator());
		
		for(Student str1 :arr) {
			System.out.println("id" +str1.getId()+" "+"name"
		+str1.getName()+" "+"salary"+str1.getSalary());
		}
		System.out.println("**************************************");
		Iterator<Student> itr=arr.iterator();
		
		while(itr.hasNext())
		{
			Student str1 =itr.next();
			System.out.println("Student Name is : " +str1.getName()
			 + " " + str1.getSalary() +" " +str1.getId());	
		}
		
		
		
	}

}
