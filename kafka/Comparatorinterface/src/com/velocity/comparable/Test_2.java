package com.velocity.comparable;
//1. Implement Comparable interface
public class Test_2 implements Comparable<Test_2> {
 private final String id;
 private final String name;
 private final int age;
 
 public Test_2(String id, String name, int age) {
     this.id = id;
     this.name = name;
     this.age = age;
 }
 
 // 2. override compareTo method.
 @Override
 public int compareTo(final Test_2 superHero) {
     return this.id.compareTo(superHero.id);
 }
 
 public String getId() { return this.id; }
 
 public String getName() { return this.name; }
 
 public int getAge() { return this.age; }
 
 @Override
 public String toString() {
     return String.format("ID: %s | Name: %s | Age: %d", id, name, age);
 }
}



