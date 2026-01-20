package com.wipro.hms.util;

public class RoomNotAvailableException extends Exception{
	public String toString()
	{
		return "Room is not available for booking.";
	}
}
