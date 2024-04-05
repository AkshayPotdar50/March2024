package com.assign12.inheritance;

import com.assign12.LifeInsurance.LifeInsurance;
import com.assign12.TermPolicy.TermPolicy;

public class Test_1 {

	public static void main(String[] args) {
		LifeInsurance lifeinsurance = new LifeInsurance();
		lifeinsurance.getInsuranceDetails();
		lifeinsurance.getLifeInsuranceDetails();
		TermPolicy termPolicy = new TermPolicy();
		termPolicy.getTermPolicyDetails();

	}

}
