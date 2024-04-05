package com.objectclass.velocity;

public class Stringtos {
   int no ;

	public static void main(String[] args) {
        Stringtos stringtos = new Stringtos();
        stringtos.no=10;
        
        
        System.out.println(stringtos.toString());
        //com.object.methods.Demo@2316416
        
        Stringtos stringtos1 = new Stringtos();
        stringtos1.no=20;
        System.out.println(stringtos1.no);
        //com.object.method.Demo@898898888
        
        Stringtos stringtos3 = new Stringtos();
        stringtos1.no=30;
        System.out.println(stringtos1.no);
        
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}