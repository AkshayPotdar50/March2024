package com.objectclass.velocity;

public class Demo {
     int number ; //0
     String name ;  //null
	
	public static void main(String []args)
	{
		Demo demo1 = new Demo();
		demo1.number=10;
		demo1.name= "Ram";
		
		Demo demo2 = new Demo();
		demo2.number=20;
		demo2.name= "Sham";
		
		System.out.println(demo2.equals(demo1)); // False
		System.out.println(demo1.equals(demo1));  // True
		
		Demo demo3  = new Demo();  // Address --> 28287291
		 demo3.number=1;
		 demo3.name= "Sushmita";
		 
		Demo demo4 = new Demo(); // Address -->822282720
		 demo4.number=2;
		 demo4.name="Ashok";
		
		demo3 = demo4;  //28287291 =822282720 --> 822282720
		
		System.out.println(demo3.equals(demo4)); //822282720 equals(822282720) --> True
		
		}
	}
