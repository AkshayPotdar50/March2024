package com.advance.foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
/*The Java forEach() method is a utility function to iterate over a collection 
 * such as(list, set or map) and stream. It is used to perform a given action 
 * on each the element of the collection. */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		map.put("one", "akshay");
		map.put("two", "rushikanti");
		map.put("three", "kishor");
		//Old approach
		Set<String> s=map.keySet();
				for(String str : s) {
					System.out.println("key>>" +str + "  "+" Value " + map.get(str));		}
System.out.println("******************************************************");
				//New Approach
				map.forEach((k,v)->System.out.println("Key="+k+"   "+"Value="+v)); 
				} 


	}


