package com.assign.problem_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("akash", 101, "pune"));
		emplist.add(new Employee("pravin", 106, "satara"));
		emplist.add(new Employee("sager", 103, "kolhapur"));
		emplist.add(new Employee("Sarika", 105, "sangli"));
		emplist.add(new Employee("komal", 102, "mumbai"));

		Collections.sort(emplist);
		emplist.forEach(empolyee -> 
		System.out.println(empolyee.getName() + "   " + empolyee.getId()));
	}
}
