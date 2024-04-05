package com.constructor.chaining;
class Test_3{
    private String name;
    private int empID;

    // 1st constructor
    public Test_3(){ 
        this("NULL"); // calling the 2nd constructor
    }

    // 2nd constructor
    public Test_3(String name){
        this(name, 0);  // calling the 3rd constructor
    }

    // 3rd constructor
    public Test_3(String name, int empID){ // fully parameterized constructor
        this.name = name;
        this.empID = empID;
    }

    public String getName(){
        return name;
    }

    public int getEmpID(){
        return empID;
    }
}