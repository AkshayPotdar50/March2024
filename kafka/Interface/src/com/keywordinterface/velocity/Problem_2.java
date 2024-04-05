package com.keywordinterface.velocity;

public class Problem_2 {
	//Implementing multiple interfaces in Java
	
class Rocket implements Flyable, Separable{
		 void fly()
		 {
		    System.out.println("I am zooming out into space!");
		 }
		 
		 void separate()
		 {
		    System.out.println("Carrying out stage separation..");
		 }
		}


}
