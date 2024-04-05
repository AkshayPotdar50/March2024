package com.advance.optionalclass;
/*Optional class 
Java introduced a new class Optional in jdk8.
 It is a public final class and used to deal with NullPointerException in Java application.
You must import java.util package to use this class. 
It provides methods which are used to check the presence of value for particular variable.
*/
public class MapDemo {

	public static void main(String[] args) {
		String[]str=new String[10]; 
		String lowercaseString=str[5].toLowerCase();
		System.out.print(lowercaseString);
		} 
/*Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because "str[5]" is null
	at Features/com.advance.optionalclass.MapDemo.main(MapDemo.java:12)
because we are pointing to null object*/

}
