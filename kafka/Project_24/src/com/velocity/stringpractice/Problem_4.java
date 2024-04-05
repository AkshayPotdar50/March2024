package com.velocity.stringpractice;
/*Write a program to find the 
 * first and the last occurrence of the letter 'o' in "Hello, World".
 */

public class Problem_4 {

public static void main(String[] args) {
String str = "HellO, WOrld";
for(int i=0;i<str.length();i++)
	{
	char o = 'O';
	if (str.charAt(i)=='O')
System.out.println(str.indexOf("O"));
	System.out.println(str.lastIndexOf("O"));
}
	}

}

