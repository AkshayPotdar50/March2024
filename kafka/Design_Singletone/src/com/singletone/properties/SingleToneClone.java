package com.singletone.properties;

public class SingleToneClone implements Cloneable {
	
	//create static instance
	private static  SingleToneClone  singleToneClone;
	
	//create private constructor
	private SingleToneClone() {
		
	}
	
	//create a method which will return class object
	
	public static SingleToneClone getSingleToneCloneobject() {
		synchronized(SingleToneClone .class) {
		if(singleToneClone==null) {
			singleToneClone = new SingleToneClone ();
		}else {
			return singleToneClone;
		}
		return singleToneClone;
		
	}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		String s;
		throw new CloneNotSupportedException(s="cannot create the clone of object");
	}
	

}
