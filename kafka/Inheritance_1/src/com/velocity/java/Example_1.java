package com.velocity.java;

public class Example_1 {

	public static void main(String[] args) {
		//Scenario-1 ("child and parent class is a relationship)
		/*X x = new X();
		System.out.println(x.a);
		System.out.println(x.b);
		//System.out.println(x.c);
		x.m1();
		x.m2();
		//x.m3(); */  
		 
		//Scenario-2 
		/* Y y = new Y();
		 System.out.println(y.a);  //10
		 System.out.println(y.b);  //30
		 System.out.println(y.c);  // 40
		 y.m1(); // X class
		 y.m2(); // Y class
		 y.m3();  // Y class*/ 
   
   //	System.out.println("*********************");	
		 //Scenario -3
		 /*X x1 = new Y(); // Object
		  System.out.println(x1.a);
		  System.out.println(x1.b);
		  //System.out.println(x.c);
		  x1.m1();
		  x1.m2(); // Y class method
		  //x.m3();*/   
		
		// Scenario- 4 
		  
		  Y y = new Y();
		    ;
		   System.out.println(y.a);
		   System.out.println(y.b);
		   System.out.println(y.c);// Parent class variable
		  // System.out.println(x.c);
		   y.m1();
		   y.m2(); // if methods are same then child class method accessible
		   //x.m3();
		   
		   
		  // Scenario- 5 (similar to 2)
		/*     X x = new X();
		     Y y = new Y();
		     y = (Y) x;
		     System.out.println(y.a);
		     System.out.println(y.b);
		     System.out.println(y.c);
		     y.m1();
		     y.m2();
		     y.m3();  */
		     
		 // Scenario -6
		//  Y y = new X();   // Compile time error
		//  X x1 = new Y();  // Dynamic dispatch
	}

}