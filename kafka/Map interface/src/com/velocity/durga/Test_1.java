package com.velocity.durga;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Test_1 {

	public static void main(String[] args) {
		HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
		hashmap.put("akshay", 1000);
		hashmap.put("swapnil", 700);
		hashmap.put("sager", 870);
		hashmap.put("rahul", 712);
		hashmap.put("sarika", 425);
		System.out.println(hashmap.put("akshay", 922));
		System.out.println(hashmap.put("potdar", 922));
		System.out.println(hashmap);
		Set s = hashmap.keySet();
		System.out.println(s);
		Collection c = hashmap.values();
		System.out.println(c);
		Set s1 = hashmap.entrySet();
		System.out.println(s1);
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey() + "--" +m1.getValue());
			if(m1.getKey().equals("akshay")) {
				m1.setValue(569);
			}
			System.out.println(m1);
		}
		
		
	}

}
