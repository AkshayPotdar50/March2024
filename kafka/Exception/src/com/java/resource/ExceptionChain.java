package com.java.resource;
/*
 * Chained exception helps to relate one exception to other. 
 * Often we need to throw a custom exception and want to keep
 *  the details of an original exception that in such scenarios we can
 *   use the chained exception mechanism. Consider the following
 *    example, where we are throwing a custom exception while keeping 
 *    the message of the original exception.*/
public class ExceptionChain {
	   public static void main(String[] args) {
	      try {
	         test();
	      }catch(ApplicationException e) {          
	         System.out.println(e.getMessage());
	      }
	   }  

	   public static void test() throws ApplicationException {
	      try {
	         int a = 0;
	         int b = 1;
	         System.out.println(b/a);
	      }catch(Exception e) {
	         throw new ApplicationException(e);
	      }
	   }
	}
