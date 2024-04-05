package com.java.java8;

public class FunctionalInterfaceExample implements Sayable {

	@Override
	public void say(String msg) {
		System.out.println(msg);
		}
	public static void main(String[] args) {
		FunctionalInterfaceExample filrExample= new FunctionalInterfaceExample();
		filrExample.say("hello there you are doing great!!!!");
	}

	

}
