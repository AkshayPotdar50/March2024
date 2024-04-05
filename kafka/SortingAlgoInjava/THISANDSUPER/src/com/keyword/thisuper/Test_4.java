package com.keyword.thisuper;
//Illustration class
class Test_4{
	// print method
	void print(Test_4 ob){
		System.out.println("Method is invoked.");
	}
	//The “this” keyword is used to pass an argument in the method. 
	//At industry level it is used in event handlers or 
	//at places where we have to provide reference of one class to another class.
	void invoke(){
		// print method is invoked by passing this as an argument
		print(this);
	}


 public static void main(String[] args) {
 	// creating an instance of Illustration class
 	Test_4 obj = new Test_4();
 	obj.invoke();
 }
}

