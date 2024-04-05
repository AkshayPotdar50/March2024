package com.velocity.HashSet;
import java.util.HashSet;
import java.util.Iterator;
public class Car{
public static void main(String[] args){
HashSet<String> carData= new HashSet<String>(); // creates a new HashSet named carData in the heap 
// adding the names of car in the hash set
carData.add("Nano"); 
carData.add("Xylo");
System.out.println(carData); 
HashSet<String> carLoan= new HashSet<String>( 20,(float) 0.75);
carLoan.add("akshay");
carLoan.add("rajendra");
carLoan.add("potdar");
//it will create an object of hashset with initial capacity 20 and
//load factor 0.75
carLoan.add("potdar");//This method adds an element of type E if and only if it is not already present in the HashSet.
carLoan.clone();//This method creates and returns a clone of the HashSet instance. Clone- shallow copies of HashSet Instances are cloned and not the actual element.
Iterator iterator =carLoan.iterator();
System.out.println(iterator.equals(carData));
//carLoan.clear();//It clears the entire HashSet by removing all the elements present in it.
System.out.println(carLoan.size());
System.out.println(carLoan);
//The method returns the size or the number of 
//elements present in the HashSet.
}
}

