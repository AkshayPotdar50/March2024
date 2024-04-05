package com.objectclass.velocity;
public class Getclass_1 {  
    public static void main(String[] args)   
    {   
        Object obj = new String("JavaTpoint");   
        Class<? extends Object> a = obj.getClass();   
        System.out.println("Class of Object obj is : " + a.getName());
        System.out.println(obj.getClass().getName());
        System.out.println(obj.getClass().getSimpleName());
        
        
    }   
}  