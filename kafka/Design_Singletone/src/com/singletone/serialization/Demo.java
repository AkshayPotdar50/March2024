package com.singletone.serialization;

import java.io.Serializable;
/*Singleton pattern with serialization-
Some times in distributed system, we need to implement serializable interface in singleton
 class so that we can store it state in file system and retrieve it later point. */
public class Demo implements Serializable , Cloneable{
	
	private static Demo demo;
	
	private Demo() {
		
	}
	public static Demo getDemoObject() {
		
		if(demo==null) {
			demo = new Demo();
		}else {
			return demo;
		}
		return demo;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	protected Object readResolve() {
		
		return demo;
		
	}
	}

