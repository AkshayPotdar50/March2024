package com.array.velocity;
public class Test {
	  public static void main (String[] args) {
	    // declaring an array of Object
	    Student obj[] = new Student[3];
	    
	    obj[0] = new Student(1,"Bharat");
	    obj[1] = new Student(5,"Vivaan");
	    obj[2] = new Student(6,"Smith");
	    
	  }
	}
/*As you can see in the above code, we have first declared the array of 
objects with a length of three, which create three object reference variable
obj[0], obj[1], and obj[2]. And then initialized each object reference by using 
a new keyword.*/
