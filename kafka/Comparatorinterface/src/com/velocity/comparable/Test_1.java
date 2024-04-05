package com.velocity.comparable;
public class Test_1 {
    private final String id;
    private final String name;
    private final int age;
    
    /* class constructor */
    public Test_1(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public String getId() { return this.id; } // getId function
    
    public String getName() { return this.name; } // getName function
    
    public int getAge() { return this.age; } // getAge function
    
    @Override
    public String toString() {
        return String.format("ID: %s | name: %s | Age: %d", id, name, age);
    }
}
