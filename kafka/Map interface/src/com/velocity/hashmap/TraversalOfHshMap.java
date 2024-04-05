package com.velocity.hashmap;
import java.util.HashMap;
import java.util.Map;

public class TraversalOfHshMap {
	public static void main(String[] args)
	{
		// Initialization of a HashMap
		HashMap<String, Integer> map = new HashMap<>();

		// Add elements
		map.put("Apple", 100);
		map.put("Orange", 70);
		map.put("Banana", 50);

		// Iterating the map using for-each loop
		for (HashMap.Entry<String, Integer> m : map.entrySet())
			System.out.println("Key: " + m.getKey()
							+ " Value: " + m.getValue());
		/*In the above example, we have used HashMap.Entry(). 
		Entry is an inner class in whatever Map implementation
		we are using (here, in this case it's HashMap). HashMap.
				Entry is a key and its value combined into one 
				class. This allows us to iterate over HashMap.
				entrySet() instead of having to iterate over 
				HashMap.keySet(), then getting the value for 
				each key. So, the HashMap.entrySet() method 
				returns a collection-view (elements) of the HashMap.*/
	}
}


