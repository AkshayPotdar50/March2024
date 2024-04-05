package com.advance.optionalclass;

import java.util.Optional;

public class MapDemo2 {
/*Here we are getting exception, to avoid this type of exception, we should go for optional class 
*/
	public static void main(String[] args) {
		String[]str=new String[10]; Optional<String>checkNull=Optional.ofNullable(str[5]);
		if(checkNull.isPresent()){//check for value is present or not 
		String lowercaseString=str[5].toLowerCase();
		System.out.print(lowercaseString);
		}else 
		System.out.println("string value is not present");
		} 


}
