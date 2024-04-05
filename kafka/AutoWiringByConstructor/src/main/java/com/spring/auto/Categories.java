package com.spring.auto;

public class Categories {
	private String name;
	private Policy policy;
	public Categories(String name, Policy policy) {
		super();
		this.name = name;
		this.policy = policy;
	}
	@Override
	public String toString() {
		return "Categories [name=" + name + ", policy=" + policy + "]";
	}
	public void show()
	{
		System.out.println("This is show method");
		System.out.println("Categories name is : "+name);
		System.out.println("Policy Name is : "  + policy.getPlanName());
		System.out.println("Policy amount is : "+policy.getPlanAmount() );
	}

}
