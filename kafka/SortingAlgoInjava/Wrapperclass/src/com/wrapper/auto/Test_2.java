package com.wrapper.auto;
//Unboxing example of Integer to int and Character to char 
public class Test_2{ 

public static void main(String args[]){       

Character ch = 's';

//Unboxing - Character object to primitive conversion
char s = ch;

Integer a=new Integer(5);
Character Chara= new Character(s);

//Converting Integer to int explicitly  
int first=a.intValue();
char third = Chara.charValue();

//Unboxing, now compiler will write a.intValue() internally
int second=a;   
  
System.out.println(a);
System.out.println(first);
System.out.println(second);
System.out.println(third);
}}    
