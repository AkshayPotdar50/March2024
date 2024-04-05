package com.serialwithaggre.velocity;
//Non-serializable class
public class Student implements java.io.Serializable {

String stu_Addr;
int stu_Id;
Child child;

public Student(String stu_Addr, int stu_Id) {
 this.stu_Addr = stu_Addr;
 this.stu_Id = stu_Id;
}
}
/*The above code snippet would throw a NotSerializableException 
 * when an object of class Student is serialized. 
 * Class Student is said to have a relationship with class Child. 
 * This is called Aggregation (HAS-A Relationship).*/