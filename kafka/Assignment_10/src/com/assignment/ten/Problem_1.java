package com.assignment.ten;
import java.util.Scanner;

public class Problem_1
{
   public static void main(String[] args)
   {
      int num1, i, count=0;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      num1 = s.nextInt();
      
      
      for(i=2; i<num1; i++)
    	  
      {
         if(num1%i == 0)
        	 
         {
            count++;
            break;
         }
      }
      
      if(count==0)
         System.out.println("\nIt is a Prime Number.");
      else
         System.out.println("\nIt is not a Prime Number.");
   }
}