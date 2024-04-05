package com.singletone.properties;
/*Step-4 We can still able to create the copy of object by cloning it using object clone method. 
 * Override the object clone method to prevent cloning as below.
(If singleton class will implements 
clonable interface ->class Singleton implements Clonable and override object clone method into singleton class)
*/
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException  {
		SingleToneClone obj1 = SingleToneClone.getSingleToneCloneobject();
		SingleToneClone obj2 = (SingleToneClone) obj1.clone();
		
		System.out.println("hashcode of first object:" +obj1.hashCode());
		System.out.println("hashcode of second object:"+obj2.hashCode());
		

	}

}
