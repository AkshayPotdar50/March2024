package com.example;
import java.util.Scanner;//package import//

public class ReverseNumber {
public static int getReverseNumber(int num) {
int reverse = 0;
while (num != 0) {
reverse = reverse * 10;
reverse = reverse + num % 10;
num = num / 10;
}
return reverse;
}
public static void main(String[] args) {
System.out.println("Enter the number to reverse>>");

Scanner scanner = new Scanner(System.in);
int num = scanner.nextInt();
int reverseNumber = getReverseNumber(num);// 
//calling the method
System.out.println("Reverse number is >>" + 
reverseNumber);
}
}
