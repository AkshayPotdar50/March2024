package com.velocity.problem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDeatils {

	public static void main(String[] args) throws Exception 
    {
     List<Employee> list = new ArrayList<Employee>();
 
     list.add(new Employee(1, "Ravi", 25));
     list.add(new Employee(2, "Raj",27));
     list.add(new Employee(3, "Rekha",24));
     list.add(new Employee(4, "Ram",52));
     System.out.println("elements of list are"+list);
     for(Employee e:list) {
     System.out.print("ID, Name and age of the employee are : ");
     System.out.println(e.getId()+" "+e.getEmployeename()+" " +e.getEmpage());
     
     }

	}

}
