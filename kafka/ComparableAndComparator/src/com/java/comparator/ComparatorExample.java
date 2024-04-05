package com.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Employee> employees =new ArrayList<>();
		employees.add(new Employee("Alice", 32));
		employees.add(new Employee("Bob", 38));
		employees.add(new Employee("Marie", 31));
		employees.add(new Employee("Alex", 29));
		
		System.out.println("Before sorting:::");
		for(Employee employee : employees) {
			System.out.println(employee.getName() + "-"+employee.getAge());
			}
		Comparator<Employee> ageComparator= new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				
				return Integer.compare(emp1.getAge(), emp2.getAge());
			}
			
		};
		Collections.sort(employees, ageComparator);
		System.out.println("After sorting:::");
		for(Employee employee : employees) {
			System.out.println(employee.getName() + "-"+employee.getAge());
			}
}
}
