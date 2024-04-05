package com.keywordinterface.velocity;

public class Problem_1 {
	//Assume you are the head baker of a reputed baking chain, 
	//and you want to give instructions to the other bakers under you 
	//on the steps they need to follow to bake a cake. You 
	//leave them a checklist of things to be done to bake a cake. 
	//This is essentially an interface- a checklist! It is a set of 
	//methods you want a class to implement to accomplish a certain task.
	interface CakeBakingService{
		 public void mixIngredients();
		 public void bakeCake();
		 public void frostCake();
		}
	//An interface can be used when we want to achieve 100% abstraction. 
	//On the other hand, abstract classes can be used to achieve anything between 0–100% abstraction.
	//An interface cannot have constructors because we cannot create objects of an interface.
	//If you want a class to achieve multiple inheritances, there is only one way: interfaces.
	//If an interface is made private, or if the methods in it are made private or protected, 
	//then a compilation error will be thrown.

}
