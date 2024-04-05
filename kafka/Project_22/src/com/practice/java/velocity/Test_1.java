package com.practice.java.velocity;
import java.util.Scanner;

public class Test_1 {
	int i;
	public void getdata() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		i =scanner.nextInt();
	}
	void sumofdigits() {
		int sum =0;
		while(i>0) {
			sum = sum +(i%10);
			i= i/10;
			
		}
		System.out.println("sum of the numbers is "+sum);
		}
		void proofdigits() {
			int pro =1;
			while(i>0) {
		pro = pro*(i%10);
		i= i/10;
			}
				System.out.println("product of the numbers is "+pro);
			
		}
		void reverse()
		{
			int rev=0;
			while(i>0) {
				rev=rev*10+(i%10);
				i=i/10;
			}
			System.out.println("reverse of the number is" +rev);
		}
		void palin()
		{
			int x, rev=0;
			x=i;
			while(x>0) {
				rev=rev*10+(x%10);
				x=x/10;
				}
			if(rev==i)
				System.out.println("number is palidrome");
			else
				System.out.println("number is not palidrome");
		}
		void factorial() {
			int fac=1;
			while(i>0) {
				fac =fac*i;
				i--;
			}
			System.out.println("factorial"+ fac);
		}
		void fibonacci()
		{
			int x=0, y=1, z=0;
			while(z<=i) {
				System.out.println(z);
				x=y;
				y=z;
				z=x+y;
			}
		}
		void prime()
		{int x, count=0;
			for(x=2; x<i; x++)
		    	  /*based on given condition is true or false*/
		      {
		         if(i%x == 0)
		         count++;
		      }
			if(count==2)
			{
				System.out.println("number is prime number");
			}
			else
				System.out.println("number is not prime");
		           
		         
		}
		void Armstrong()
		{
			int x,y,count=0,sum=0;
			x=i;
			y=i;
			while(x>0) {
				count++;
				x=x/10;
			}
			while(i>0) {
				int pro=1;
				int digit=i%10;
				for(int j=1;j<=count;j++)
					pro=pro*digit;
				sum=sum+pro;
				i=i/10;
			}
			if(sum==y)
				System.out.println("armstrong number");
			else
				System.out.println("not armstrong");
			
		}
		void powerfun()
		{
			int x, y, pro=1;
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter base:");
			x=scanner.nextInt();
			System.out.println("enter the exponent:");
			y=scanner.nextInt();
			while(y>0) {
				pro=pro*x;
				y--;
			}
			System.out.println("value="+pro);
					
		}
		void table()
		{
			for(int j=1;j<=10;j++)
				System.out.println(i*j);
		}
		void Log()
		{double x;
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter double:");
			x=scanner.nextDouble();
			System.out.println(Math.log(x));
		}
	

	public static void main(String[] args) {
		Test_1 test_1 = new Test_1();
		int ch;
		do
		{
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-->sum of the digits \n 2-->product of the digits \n 3-->reverse \n 4-->palindrome \n 5-->factorial \n 6-->fibonacci \n 7-->prime \n 8-->Armstrong \n 9-->x to power y \n 10-->table of the number \n 11-->Log \n 12-->exit \n Enter your choice");
		ch=scanner.nextInt();
		switch(ch)
		{
		case 1:
			test_1.getdata();
		test_1.sumofdigits();
		break;
		case 2:
			test_1.getdata();
			test_1.proofdigits();
			break;
		case 3:
			test_1.getdata();
			test_1.reverse();
			break;
		case 4:
			test_1.getdata();
			test_1.palin();
			break;
		case 5:
			test_1.getdata();
			test_1.factorial();
			break;
		case 6:
			test_1.getdata();
			test_1.fibonacci();
			break;
		case 7:
			test_1.getdata();
			test_1.prime();
			break;
		case 8:
			test_1.getdata();
			test_1.Armstrong();
			break;
		case 9:
			test_1.powerfun();
			break;
		case 10:
			test_1.getdata();
			test_1.table();
			break;
		case 11:
			test_1.Log();
			break;
		case 12:
			break;
			default:
				System.out.println("invalid choice");
				break;
		
		
		}
		}while(ch!=13);
		
		
	
		
		
		}

}
