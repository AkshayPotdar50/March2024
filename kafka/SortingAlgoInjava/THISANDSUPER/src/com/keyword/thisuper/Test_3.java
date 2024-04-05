package com.keyword.thisuper;
//Illustration class
class Test_3{
	// simple constructor
	Test_3(){
		// invoking parameterized constructor 
		//The “this” keyword is used to invoke the constructor of the current class.
		this(10);
	}

	// parameterized constructor
	Test_3(int x){
		System.out.println("Current class parameterized constructor invoked.");
		System.out.println("Number is : "+x);
	}


 public static void main(String[] args) {
 	// creating an instance of Illustration class
 	Test_3 obj = new Test_3();
 }
}
