package com.java;
/*1. Design the factory method in which multiple objects are stored called as factory
design pattern.
2. Factory Pattern is one of the Creational Design Pattern.
*/
public interface Booking {
	public String GetAcClass();
		
	

}
/*Sometime our application or frameworks don’t know what kind of object has to create at run 
time. It only knows when it has to create.
Another issue is that class will contain object of another classes, this can be easily achieved 
by just using the new keyword and the class constructor. The problem with this approach is 
that it is very hard coded approach to create the object as this creates dependency between 
two classes.
To overcome this above situation, we should go for factory pattern.
*/
 