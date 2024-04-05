package com.java;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		try {
			String Booking;
			System.out.println("enter the ac class type>>");
			Scanner scanner = new Scanner(System.in);
			Booking=scanner.next();
			Booking b = BookingFactory.createBooking("Booking");
			System.out.println(b.GetAcClass());
			scanner.close();
		}catch (Exception e) {
		e.printStackTrace();
		}

	}

}
