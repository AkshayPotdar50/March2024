package com.keyword.thisuper;
public class Test_1 {
	// Illustration class
	
		int instanceVar = 5;

		// declaring an static variable
		static int staticVar = 10;

		void Scaler(){
			int instanceVar = 20;
			// referring to the current class instance variable
			this.instanceVar = 50;

			int staticVar = 40;
			// referring to the current class static variable
			this.staticVar = 100;

			// printing the current class instance and static variable.
			System.out.println("Value of instance variable : "+this.instanceVar);
			System.out.println("Value of static variable : "+this.staticVar);
			System.out.println("Value of variables declared inside method : "+instanceVar+" "+staticVar);
		}
	
    public static void main(String[] args) {
	    
	    	// creating an instance of Illustration class
	    	Test_1 obj = new Test_1();
	    	obj.Scaler();
	    }
	}




