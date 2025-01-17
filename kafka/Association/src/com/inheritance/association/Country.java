package com.inheritance.association;
import java.util.*;
//Country class
public class Country{
private String name;
List<SportPerson> sportPersons;
public Country(String name)  //to assign Country name
{
  this.name = name;
}
public void setSportPersons(List<SportPerson> sportPersons)  //To assign sportspeople
{
  this.sportPersons = sportPersons;
}
public List<String> getSportPersons()
{
List<SportPerson> listOfSportPersons = this.sportPersons;
List<String> names = new ArrayList<String>();
for(SportPerson sportPerson : listOfSportPersons)
{
    names.add(sportPerson.getName());
}
return names;
}

public String getName()
{
return this.name;
}
}