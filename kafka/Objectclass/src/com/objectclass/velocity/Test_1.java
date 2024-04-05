package com.objectclass.velocity;

public class Test_1 {
	public static class Test {
		
		public static void main(String[] args) {
			Test test = new Test();
			System.out.println(test.getClass());// class com.velocity.object.methods.Test
			System.out.println(test.getClass().getName()); //com.velocity.object.methods.Test
			System.out.println(test.getClass().getSimpleName()); //Test
			
		}

	}
}

