package com.abstraction.one;
public class AbstractMethodExample 
{
    public static void main(String arg[])
    {
        Calculator add = new Add();
        add.display();
        
        Calculator sub = new Sub();
        sub.display();
        
        /*Calculator cal = new Calculator(System.in);//we cannot create object of 
        //abstract class*/
    }
}