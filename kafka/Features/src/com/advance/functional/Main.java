package com.advance.functional;

public class Main implements Test {

	public static void main (String[] args) {
		Main main = new Main();
		main.getStudentName("ram");

	}

	@Override
	public void getStudentName(String name) {
		System.out.println("student name is:"+name);
		
	}

}
