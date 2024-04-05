package com.velocity.arrayproblem;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/*To remove dupliates from ArrayList, we can convert it into Set. 
Since Set doesn't contain duplicate elements, it will have only 
unique elements.*/

public class Example_4 {   
    public static void main(String[] args) {  
        List<String> l = new ArrayList<String>();  
        l.add("Mango");  
        l.add("Banana");  
        l.add("Mango");  
        l.add("Apple");  
        System.out.println(l.toString());  
        Set<String> s = new LinkedHashSet<String>(l);  
        System.out.println(s);  
    }  
}  