package com.encapsulation.velocity.java;
public class Problem_2 {

	private int marks ;
	

	 public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	{
		if(marks>0)
		{
			this.marks = marks;
		}else {
			marks=0;
		}
		
	}	
	
}
