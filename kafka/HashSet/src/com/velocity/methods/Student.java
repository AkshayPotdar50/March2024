package com.velocity.methods;
public class Student{
//initializing student propertities
int rno;
String name;
Student(int rno, String name){
this.rno=rno;
this.name=name;
}

// This function is to check if objects are of equal value or not
public boolean equals(Object o){
Student s= (Student)o;
return(rno==s.rno);
}
public int hashCode(){
return rno;
}
}

