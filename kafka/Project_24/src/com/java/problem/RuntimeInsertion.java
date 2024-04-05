package com.java.problem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RuntimeInsertion {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("akshay");
		list.add("rajendra");
		list.add("potdar");
		System.out.println("Actual list:"+list);
		
		List<String> input= new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the element (one per line, enter Done to finish)");
          String input1;
          while(!(input1=scanner.nextLine()).equals("Done")) {
          input.add(input1);
          }
          System.out.println("elements in arraylist:");
          input.forEach(System.out::println);
          }

}
