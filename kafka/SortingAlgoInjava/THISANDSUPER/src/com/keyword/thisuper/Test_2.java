package com.keyword.thisuper;

public class Test_2 {
	// Illustration class
	
		// current class method
		void scaler(){
		    System.out.print("your pan card number is : ");
		}
		void name(){
	        // invoking current class scaler method.
			int i;
	            this.scaler();
		    System.out.println("i=264784.");
		}
	
	
	    public static void main(String[] args) {
	    	// creating an instance of Illustration class
	    	Test_2 obj = new Test_2();
	    	obj.name();
	    }
	


	

	}


