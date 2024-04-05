package com.keywordinterface.velocity;

 class Problem_3 implements Series {
	 int start;
	 int val;
	 
	 Problem_3(){
		 start = 0;
		 val = 0;
	 }

	@Override
	public int getnext() {
		val+= 2;
		return val;
	}

	@Override
	public void reset() {
		val = start;
	
		}

	@Override
	public void setStart(int x) {
		start = x;
		val = x;
		
		
	}
	

}
