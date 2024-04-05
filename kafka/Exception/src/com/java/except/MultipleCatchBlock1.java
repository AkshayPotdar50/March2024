package com.java.except;
public class MultipleCatchBlock1 {
	/*
	 In this example, the try block has doubtful statements that are trying to 
	 divide an integer by 0 and 3 catch blocks which have mentioned the exceptions
	  that can handle. After execution of the try block, the Arithmetic Exception is raised 
	  and JVM starts to search for the catch block to handle the same.
     JVM will find the first catch block that can handle the raised exception, 
     and control will be passed to that catch block. After the exception is handled
     the flow of the program comes out from try-catch block and it will execute the 
      rest of the code.

	 */

	  public static void main(String[] args) {

	    try {
	      int arr[]= new int[] {5,6,7};
	      arr[5]=25/0;
	    } catch (ArithmeticException e) {
	      System.out.println("Arithmetic Exception occurs");
	    } catch (ArrayIndexOutOfBoundsException e) {
	      System.out.println("ArrayIndexOutOfBounds Exception occurs");
	    } catch (Exception e) {
	      System.out.println("Parent Exception occurs");
	    }
	    System.out.println("End of the code");
	  }
}

