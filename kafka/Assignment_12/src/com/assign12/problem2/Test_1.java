package com.assign12.problem2;
import java.util.Scanner;
public class Test_1 {

	public static void main(String[] args) {
		ICICIBank iciciBank = new ICICIBank();
		
		HDFCbank hdfcBank = new HDFCbank();
		
		SBIbank sbiBank = new SBIbank();
		
		int ch;
		do
		{
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-->getICICIBankDeatils \n 2-->getHDFCBankDeatils \n 3-->getSBIBankDeatils\n 4-->exit \n Enter your choice");
		ch=scanner.nextInt();
		switch(ch)
		{
		case 1:
			iciciBank.getICICIBankDeatils();
			break;
		case 2:
			hdfcBank.getHDFCBankDeatils();
			break;
		case 3:
			sbiBank.getSBIBankDeatils();
			break;
		case 4:
			break;
		default:
			System.out.println("invalid choice");
			break;
		}
		}while(ch!=4);
			

	}

}
