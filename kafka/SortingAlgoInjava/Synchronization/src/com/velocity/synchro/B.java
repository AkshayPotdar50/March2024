package com.velocity.synchro;

public class B extends Thread {
	Printing p;
	B(Printing p){
		this.p=p;
	}
	public void run() {
		p.print('#');
	}

}


