package com.velocity.methods;
import java.util.HashSet;
public class StuMain{
public static void main(String args[]){
Student s1= new Student(10, "Nik");
Student s2= new Student(10, "Tanya");
// making a new HashSet sdata to store students value
HashSet<Student> sdata= new HashSet<Student>();
// adding the values of object in the HashSet
sdata.add(s1);
sdata.add(s2);   // data s2 will not be added because of duplicate rno - 10
// iterating using for loop
for(Student s: sdata){
System.out.println(s.rno+" "+s.name);
}
}
}
/*In the above example, it can be observed that the value 
 * of rollno "10" is being repeated for another object which 
 * is "Tanya". Since the value is being duplicated, it will not 
 * print the s2 object.
 */