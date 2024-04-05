package com.advance.lambada;

public class Main {

	public static void main(String[] args) {
	Addition addition=	(p,q) ->(p+q);    //lambda expression
	
	Addition addition1=(p,q) -> {  
		System.out.println("the first variable is:"+p);
		System.out.println("the second variable is:"+q);
		System.out.println("addition of two numbers is:"+(p+q));
		return (p+q);
	};

	}


}
