package com.keywordinterface.velocity;

public class SeriesDemo {
public static void main(String[] args) {
		Problem_3 problem_3 = new Problem_3();
		
		for(int i=0; i<5; i++);
	    problem_3.val++;
		System.out.println("next value is" + problem_3.val++);
		
		System.out.println("\nresetting");
		
		problem_3.reset();
		for(int i=0; i<5; i++);
		System.out.println("next value is " +problem_3.getnext());
		
		System.out.println("\nresetting at 100");
		problem_3.setStart(100);
		for(int i=0; i<5; i++);
		System.out.println("next value is" +problem_3.getnext());
		
		
		
}

}
