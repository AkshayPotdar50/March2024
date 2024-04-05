package com.revision.methodoverloading;
// Overload class to illustrate compile-time polymorphism
public class Overload {
  // Creating a statement method
  void statement(String name) {
    System.out.println("Hi myself " + name);
  }
  // overloading statement method
  void statement(String fname, String lname) {
    System.out.println("Hi myself " + fname + " " + lname);
  }
}