package com.velocity.stringpractice;
             /*PROGRAM TO FIND LENGTH OF GIVEN STRING*/
import java.util.Scanner;

public class Problem_1 {
	
public static void main(String args[]) throws Exception {
	Scanner scanner = new Scanner(System.in);
	System.out.println("please enter the string");
		      String str = scanner.next();
		      int i = 0;
		     for(char c: str.toCharArray()) {
		         i++;
		      }
		      System.out.println("Length of the given string :"+i);
		   }
		}
