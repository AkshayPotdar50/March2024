package com.java.lamda;

public class Test4 implements Inter2 {

	public static void main(String[] args) {
		/*Lambda expression provides implementation of functional interface. 
		 * An interface which has only one abstract method is called functional interface.
		 *  Java provides an anotation @FunctionalInterface, which is used to declare an
		 *   interface as functional interface.*/
		
		int length=25;
		
		Inter2 d1=() ->{
			System.out.println("area"+length );
		};
		d1.Draw();

	}

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		
	}

	
		
	}


