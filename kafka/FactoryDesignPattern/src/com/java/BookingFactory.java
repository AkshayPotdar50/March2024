package com.java;

public class BookingFactory {
	// design the factory method here
	// input should be first,second,third
	public static Booking createBooking(String input) {
		if(input==null) {
			return null;
		}
	if (input.equalsIgnoreCase("first")) {
	return new FirstTier();
	} else if (input.equalsIgnoreCase("second")) {
	return new SecondTier();
	} else if (input.equalsIgnoreCase("third")) {
	return new ThirdTier();
	}
	else return null;
	
	}
	
	}
