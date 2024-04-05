package com.assign.problem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Problem_1 {

	public static void main(String[] args) {
		ArrayList<String> Maharashtra = new ArrayList<String>();
		Maharashtra.add("Sangli");
		Maharashtra.add("mumbai");
		Maharashtra.add("pune");
		Maharashtra.add("nagpur");
		System.out.println(Maharashtra);
		System.out.println("*******************************");
		ArrayList<String> Karnataka = new ArrayList<String>();
		Karnataka.add("Banglore");
		Karnataka.add("Mysore");
		System.out.println(Karnataka);
		System.out.println("**********************************");
		ArrayList<String> MadhyaPradesh = new ArrayList<String>();
		MadhyaPradesh.add("Bhopal");
		MadhyaPradesh.add("Indore");
		System.out.println(MadhyaPradesh);
		System.out.println("**********************************");
		 HashMap<String, ArrayList<String>> India = new  HashMap<String, ArrayList<String>>();
		 India.put("maharashtra",Maharashtra );
		 India.put("karnataka",Karnataka );
		 India.put("madhyaPradesh",MadhyaPradesh );
		 Iterator<String> it = India.keySet().iterator();
		 while(it.hasNext()) {
			 String key=(String)it.next();
			 System.out.println("INDIA");
			 System.out.println(" " +key+" " +India.get(key));
		 }
		 
		 
		 
		
		
		
		

	}

}
