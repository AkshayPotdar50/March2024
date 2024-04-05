package com.velocity.practice;
import java.util.Scanner;
public class YouAreProhibitedException extends Exception {

	public YouAreProhibitedException(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws YouAreProhibitedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter persons age");
		int a = scanner.nextInt();
		if(a<30) {
			System.out.println("you are allowed to enter");
		}else {
			throw new YouAreProhibitedException("Your age is more not allowed");
		}
	}

}
