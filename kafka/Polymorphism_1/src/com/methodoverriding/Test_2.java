package com.methodoverriding;

public class Test_2 extends Test_1{

	@Override  /*this is method overriding*/
	void test() {
		System.out.println("this is method in test2");
		super.test();
	}
	void test2()
	{
		System.out.println(" B class test method");
	}

	void test3() {
		this.test2();/*this is method overloding*/
	}

}
