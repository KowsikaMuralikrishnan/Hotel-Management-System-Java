package com.wipro.hms.util;

public class BookingException extends Exception{
	public String toString()
	{
		return "Booking Id is invalid or checkout error.";
	}

}
