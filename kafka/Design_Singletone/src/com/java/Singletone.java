package com.java;

public class Singletone {
	
	//creating ref variable of class
	private static Singletone singletone;

	//making constructor private
	private Singletone() {
		
	}
	public static Singletone getSingletoneObject() {
		
		synchronized (Singletone.class) {
			if(singletone==null)//DOUBLE CHECK LOCKING
			{
				singletone = new Singletone();
			}else {
				return singletone;
			}
			
			return singletone;
		}
		
		
	}
	
}

/*1. Singleton design pattern:
     It means define the class which has single instance that provides global
point of access to it it is called as singletone design pattern.

Why?
You want to create only one object of a particular class then you can use 
singleton design pattern.


Steps to create singleton object:

Step 1 : Create class and static member of class.

      private static Singleton SingletonObjectRef ;

Step 2 : Make constructor as a private.

        private Singleton()
	   {
		
	   }

Step 3 : create a method which will return Singleton class object
         and creating synchronized block instead of  synchronized method.

public static Singleton getSingletonObject()
	{
		//Number of lines of code
		
		synchronized (Singleton.class) {
			if(singletonObjRef==null)
			{
				singletonObjRef = new Singleton();
			}else {
				return singletonObjRef;
			}
			
			return singletonObjRef;
		}
	 
	}


Step 4 : we can still able to create the copy of object by cloning it .it is using object
         cloning method.Override the object clone method to prevent cloning.


*/






