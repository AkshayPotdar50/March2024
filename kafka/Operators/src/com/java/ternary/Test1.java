package com.java.ternary;

public class Test1 {

	public static void main(String[] args) {
		String status;
		//int rank=3;
		int rank=(int) Math.random();
		status=(rank==1) ? "done" : "pending";
		System.out.println(status);

	}

}
