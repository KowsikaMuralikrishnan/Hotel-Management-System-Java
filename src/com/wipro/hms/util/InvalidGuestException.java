package com.wipro.hms.util;

public class InvalidGuestException extends Exception {
	public String toString()
	{
		return "Guest Id is invalid. Guest not registered.";
	}

}
