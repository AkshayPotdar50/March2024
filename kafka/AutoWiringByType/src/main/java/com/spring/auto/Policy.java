package com.spring.auto;

public class Policy {
	private String planName;
	private String planAmount;
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanAmount() {
		return planAmount;
	}
	public void setPlanAmount(String planAmount) {
		this.planAmount = planAmount;
	}
	@Override
	public String toString() {
		return "Policy [planName=" + planName + ", planAmount=" + planAmount + "]";
	}
	

}
