package com.velocity.stringbuffer;

public class Example_3 {

	public static void main(String[] args) {
		StringBuffer m = new StringBuffer();
		System.out.println("Default Capacity"+m.capacity());
		//Capacity increase by (16(default capacity)+1)*2=34
		m.append("12345678912345678");
		System.out.println("new Capacity"+m.capacity());

	}

}
