package com.inheritance.association;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
  //Create three Sportsperson objects
  SportPerson macculum = new SportPerson("Mccullum");
  SportPerson dhoni = new SportPerson("Dhoni");
  SportPerson kohli = new SportPerson("Kohli");
  //Create a country
  Country india = new Country("India");
  //Create a arraylist and add the sportspersons
  List<SportPerson> listOfSportPersons = new ArrayList<SportPerson>();
  listOfSportPersons.add(macculum);
  listOfSportPersons.add(dhoni);
  listOfSportPersons.add(kohli);
 
  //now add this list to Country Class
  india.setSportPersons(listOfSportPersons);
  //Outputting the Has-a association between Country and Sportsperson
  System.out.println("The sports people from country " + india.getName() + " are " + india.getSportPersons());
  
}
}
