package com.revision.methodoverloading;
public class Main {
	  public static void main(String[] args) {
	    // creating instance of parent
	    Parent obj1;
	    obj1 = new Parent();
	    obj1.print();
	    obj1 = new Child();
	    obj1.print();

	    // creating instance of overload
	    Overload obj2 = new Overload();
	    obj2.statement("Akshay.");
	    obj2.statement("Akshay", "Potdar.");
	  }
	}
