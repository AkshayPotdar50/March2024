package com.velocity.assign;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Problem_1 {
	/*Suppose I have Map<String,Integer> contain key as 
	 * Ram, Sohan, Ashok, Ajay, Prasanna and value is 3,2,1,6,5
	 *  now I want to sort the value from map and print it.
	 */
	// function to sort hashmap by values
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

	public static void main(String[] args) {
		HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
		hashmap.put("Ram", 3);
		hashmap.put("Sohan", 2);
		hashmap.put("Ashok", 1);
		hashmap.put("Ajay", 6);
		hashmap.put("Prasanna", 5);
		// print the sorted hashmap
        for (Map.Entry<String, Integer> en : hashmap.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                          ", Value = " + en.getValue());
        }
		
		}

}
