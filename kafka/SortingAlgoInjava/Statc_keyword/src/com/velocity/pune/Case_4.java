package com.velocity.pune;
//calling static members from non static members//

public class Case_4 {
	void x2() {
		System.out.println("This is non static method");
		x1();
		
	}
	static void x1() {
		System.out.println("This is  static method");
	}

	public static void main(String[] args) {
		Case_4 case_4 = new Case_4();
		case_4.x2();
		

	}

}
