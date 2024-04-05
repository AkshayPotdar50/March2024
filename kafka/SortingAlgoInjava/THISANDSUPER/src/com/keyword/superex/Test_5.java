package com.keyword.superex;
//child class extending parent class
class Child extends Test_4{
	// declaring display method in Child class
	void display(){
		System.out.println("Hi i am child method.");
	}
	void print(){
		// invoking display method from parent class
		super.display();
		// display method from child class
		display();
	}
}

