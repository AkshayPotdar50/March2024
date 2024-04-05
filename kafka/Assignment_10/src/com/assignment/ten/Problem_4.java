/*Get the number to check for palindrome
Hold the number in temporary variable
Reverse the number
Compare the temporary number with reversed number
If both numbers are same, print "palindrome number"
Else print "not palindrome number"*/

package com.assignment.ten;
import java.util.Scanner;
public class Problem_4{  
	 public static void main(String args[]){
		 int r,sum=0,temp, n; 
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter value of num:");
			n = scanner.nextInt();
	   temp=n;    
	  while(n>0){    
	   r=n%10;  //getting remainder  
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(temp==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");    
	}  
	}  
