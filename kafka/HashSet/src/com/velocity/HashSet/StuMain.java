package com.velocity.HashSet;
import java.util.HashSet;
public class StuMain{
public static void main(String args[]){
// making student object
Student s1= new Student(10, "Ram");
Student s2= new Student(20, "Shyam");
// making new HashSet sdata to store students value
HashSet<Student> sdata= new HashSet<Student>();
// adding the data in the HashSet
sdata.add(s1);
sdata.add(s2);
// iterating using for loop and printing students data
for(Student s: sdata){
System.out.println(s.rno+ ""+s.name);
}
}
}
