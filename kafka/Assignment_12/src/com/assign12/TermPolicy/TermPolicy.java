package com.assign12.TermPolicy;

import java.util.Scanner;

import com.assign12.LifeInsurance.LifeInsurance;

public class TermPolicy extends LifeInsurance {
	int duration;
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void getTermPolicyDetails()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the term insurance details>>");
		System.out.println("enter the duration of insurance>>");
		duration=scanner.nextInt();
		TermPolicy termPolicy = new TermPolicy();
		termPolicy.setDuration(duration);
		
		
		}
	private void getTermPolicyInformation(TermPolicy termPolicy)
	{
		System.out.println("duration for policy"+termPolicy.getDuration());
	}
	}