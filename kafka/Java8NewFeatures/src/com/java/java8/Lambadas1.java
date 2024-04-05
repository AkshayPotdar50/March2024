package com.java.java8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Lambadas1 {

	public static void main(String[] args) {
		List<Integer> number= Arrays.asList(1, 2, 3, 4, 5);
number.stream()
.filter(n -> n%2 ==0)
.map(n -> n*n)
.forEach(System.out::println);
System.out.println("************************************");

/*Runnable and callable interface*/
Runnable task = () ->{
	//code to be execited
	System.out.println("executing task....");
	
};
Thread thread=new Thread(task);
thread.start();

/*Event Handeling*/
  /*button.addActionListener(event -> {
    // Code to handle the button click event
    System.out.println("Button clicked");
});*/
 
System.out.println("****************************");
List<String> name= Arrays.asList("john" , "alice" , "Bob" , "Mary");
Collections.sort(name, (name1, name2) -> name1.compareTo(name2));

name.removeIf(name3 ->name3.startsWith("A"));

name.replaceAll(name4 -> name4.toUpperCase());
	}

}
