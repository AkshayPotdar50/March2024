package com.velocity.comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	 public static void main(String[] args) {
	     List<Test_2> superHeroes = new ArrayList<>();

	     superHeroes.add(new Test_2("2", "Iron Man", 35));
	     superHeroes.add(new Test_2("1", "Captain America", 25));
	     superHeroes.add(new Test_2("3", "Hulk", 20));
	     
	     Collections.sort(superHeroes);
	/* printing result */
	     superHeroes.forEach(superHero -> 
	                         System.out.println(superHero.toString()));
	 }
	}
