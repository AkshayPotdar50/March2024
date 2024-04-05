package com.spring.auto;

public class Categories {
	private String name;
	private Policy policy;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	@Override
	public String toString() {
		return "Categories [name=" + name + ", policy=" + policy + "]";
	}
	public void show()
	{
		System.out.println("Categories Name is : "+ name);
		System.out.println("Policy name is : " + policy.getPlanName());
		System.out.println("Policy plan Amount: " + policy.getPlanAmount());
	}

}
