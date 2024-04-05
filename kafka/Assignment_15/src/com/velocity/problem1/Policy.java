package com.velocity.problem1;

import java.util.Scanner;

public class Policy {
	private int policyid;
	private String PolicyName;
	private String PolicyType;
	private long PremiumAmount;
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	public String getPolicyName() {
		return PolicyName;
	}
	public void setPolicyName(String policyName) {
		PolicyName = policyName;
	}
	public String getPolicyType() {
		return PolicyType;
	}
	public void setPolicyType(String policyType) {
		PolicyType = policyType;
	}
	public long getPremiumAmount() {
		return PremiumAmount;
	}
	public void setPremiumAmount(long premiumAmount) {
		PremiumAmount = premiumAmount;
	}
	
	@Override
	public String toString() {
		return "Policy [policyid=" + policyid + ", PolicyName=" + PolicyName + ", PolicyType=" + PolicyType
				+ ", PremiumAmount=" + PremiumAmount + "]";
	}
	public Policy GetPolicyDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the policy id>>");
		policyid=scanner.nextInt();
		System.out.println("Please enter your policy name>>");
		PolicyName=scanner.next();
		System.out.println("Enter the type of the policy>>");
		PolicyType=scanner.next();
		System.out.println("Please enter the premium amount>>");
		PremiumAmount=scanner.nextLong();
		Policy policy = new Policy();
		policy.setPolicyid(policyid);
		policy.setPolicyName(PolicyName);
		policy.setPolicyType(PolicyType);
		policy.setPremiumAmount(PremiumAmount);
		return policy;
		
		
	}
	

}
