package com.objectclass.velocity;


//clone method- create copy of objects
public class Testclone_1 implements Cloneable{

	int x;

	public static void main(String[] args) throws CloneNotSupportedException {

		Testclone_1 test4 = new Testclone_1();
		test4.x = 50;

		System.out.println("first object is>>" + test4.x);
		Object test5 = test4.clone();

		System.out.println("second object is>>" + test5.toString());

	}
}
