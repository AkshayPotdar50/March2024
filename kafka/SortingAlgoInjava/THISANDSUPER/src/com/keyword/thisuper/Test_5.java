package com.keyword.thisuper;
//A class
class Test_5{
	// instance variable
	B tmp;
	// parameterized constructor
	Test_5(B tmp){
		//The “this” keyword is used to pass as an argument in the constructor call. 
		//By passing this as an argument in the constructor call we can exhange data from one class to another. 
		//This makes exchange of data between multiple classes a lot easier.
		this.tmp = tmp;
	}
	// print method
	void print(){
		System.out.println("The number is : "+tmp.val);
	}
}
//B class
class B{
	// instance variable
	int val = 50;
	// constructor
	B(){
		// creating instance of A
		// passing “this” as an argument in constructor call
		Test_5 obj = new Test_5(this);
		obj.print();
	}

 public static void main(String[] args) {
 	B b = new B();
 }
}

