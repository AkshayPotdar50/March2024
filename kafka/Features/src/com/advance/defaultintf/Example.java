package com.advance.defaultintf;

/*Default method 
Java provides a facility to create default methods inside the interface. 
Methods which are defined inside the interface and tagged with default 
are known as default methods. The methods are non-abstract methods.
*/
public interface Example {

	default void m1() {
		System.out.println("this is default method");
	}
}
