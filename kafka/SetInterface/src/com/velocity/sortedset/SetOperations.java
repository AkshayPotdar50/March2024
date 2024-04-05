package com.velocity.sortedset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
 * It wont allow duplicate elements
 * it accepts group of objects as single entity
 * insertion order is not preserved*/

public class SetOperations   
{    
    public static void main(String args[])    
    {    
        Integer[] A = {10,89,56,94,32,58,41,36,85,};  
        Integer[] B = {36, 25, 36, 25, 47, 85, 41, 10};  
        Set<Integer> set1 = new HashSet<Integer>();    
        set1.addAll(Arrays.asList(A));    
        Set<Integer> set2 = new HashSet<Integer>();    
        set2.addAll(Arrays.asList(B));    
    
        // Finding Union of set1 and set2   
        Set<Integer> union_data = new HashSet<Integer>(set1);    
        union_data.addAll(set2);    
        System.out.print("Union of set1 and set2 is:");    
        System.out.println(union_data);    
        System.out.println("**************************************");
    
        // Finding Intersection of set1 and set2    
        Set<Integer> intersection_data = new HashSet<Integer>(set1);    
        intersection_data.retainAll(set2);    
        System.out.print("Intersection of set1 and set2 is:");    
        System.out.println(intersection_data);    
        System.out.println("***************************************");
    
        // Finding Difference of set1 and set2    
        Set<Integer> difference_data = new HashSet<Integer>(set1);    
        difference_data.removeAll(set2);    
        System.out.print("Difference of set1 and set2 is:");    
        System.out.println(difference_data);    
    }    
}   
