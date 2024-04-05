package com.singletone.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main implements Serializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Demo demo = Demo.getDemoObject();
		
FileOutputStream fos = new  FileOutputStream("C:\\Users\\potda\\Desktop\\out.txt");
ObjectOutputStream out = new ObjectOutputStream(fos);
out.writeObject(demo); 
System.out.println("writing objects into filre");

ObjectInputStream ois = new ObjectInputStream( new FileInputStream("C:\\Users\\potda\\Desktop\\out.txt"));
Demo demo1=(Demo) ois.readObject();
System.out.println("reading objects from file");
System.out.println("hashcode for obj1:"+demo.hashCode());
System.out.println("hashcode for obj2:"+demo1.hashCode());

	}

}
