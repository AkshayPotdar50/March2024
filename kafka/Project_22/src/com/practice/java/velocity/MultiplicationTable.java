package com.practice.java.velocity;
import java.util.Scanner;
public class MultiplicationTable
{
public static void main(String atgs[]) {
int a,i;
Scanner scanner = new Scanner(System.in);
System.out.println("please enter the number");
a=scanner.nextInt();
for(i=1;i<=10;i++)
{System.out.println("The table of number is>>" +a*i);

}
}

}