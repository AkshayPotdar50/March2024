package com.velocity.synchro;

public class A extends Thread {
	Printing p;
	A(Printing p){
		this.p=p;
	}
	public void run() {
		p.print('*');
	}

}
