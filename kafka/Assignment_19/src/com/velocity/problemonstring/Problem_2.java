package com.velocity.problemonstring;
import java.util.Scanner;
public class Problem_2 {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("please enter a string to reverse");
	String str = scanner.next();
	char ch;
	 String nstr="";
	  for(int i=0;i<str.length();i++){  
		 ch=str.charAt(i);
		 nstr = ch+nstr;
		    }
		    System.out.println("Reversed word:"+nstr);
		    
	}  
			 

	}


