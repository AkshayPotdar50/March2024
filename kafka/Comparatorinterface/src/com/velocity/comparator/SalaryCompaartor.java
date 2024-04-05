package com.velocity.comparator;

import java.util.Comparator;

public class SalaryCompaartor implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		if(o1.salary == o2.salary)
		return 0;
		else if(o1.salary >o2.salary)
        return -1;
        else
        	return 1;		
	}

}