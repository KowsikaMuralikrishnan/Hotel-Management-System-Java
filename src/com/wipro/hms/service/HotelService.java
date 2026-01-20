package com.wipro.hms.service;

import java.util.ArrayList;
import java.util.UUID;

import com.wipro.hms.entity.*;
import com.wipro.hms.util.*;

public class HotelService {

    private ArrayList<Guest> guests;
    private ArrayList<Room> rooms;
    private ArrayList<Booking> bookings;

    public HotelService(ArrayList<Guest> guests, ArrayList<Room> rooms, ArrayList<Booking> bookings) {
        this.guests = guests;
        this.rooms = rooms;
        this.bookings = bookings;
    }
    public boolean validateGuest(String guestId) throws InvalidGuestException {
        for (Guest g : guests) {
            if (g.getGuestId().equals(guestId)) {
                return true;
            }
        }
        throw new InvalidGuestException();
    }
    public boolean checkRoomAvailability(String roomId) throws RoomNotAvailableException {
        for (Room r : rooms) {
            if (r.getRoomId().equals(roomId) && r.isAvailable()) {
                return true;
            }
        }
        throw new RoomNotAvailableException();
    }
    
    public Booking bookRoom(String guestId, String roomId, int nights) throws Exception {
        validateGuest(guestId);
        checkRoomAvailability(roomId);
        Room selectedRoom = null;
        for (Room r : rooms) {
            if (r.getRoomId().equals(roomId)) {
                selectedRoom = r;
                break;
            }
        }
        
        double totalAmount = selectedRoom.getPricePerNight() * nights;
        String bookingId = UUID.randomUUID().toString();
        Booking booking = new Booking(bookingId, guestId, roomId, nights, totalAmount);
        bookings.add(booking);
        selectedRoom.setAvailable(false);
        return booking;
    }

    public boolean checkout(String bookingId) throws BookingException {
        for (Booking b : bookings) {
            if (b.getBookingId().equals(bookingId)) {
                for (Room r : rooms) {
                    if (r.getRoomId().equals(b.getRoomId())) {
                        r.setAvailable(true);
                        return true;
                    }
                }
            }
        }
        throw new BookingException();
    }

    public void printGuestBookings(String guestId) {
        for (Booking b : bookings) {
            if (b.getGuestId().equals(guestId)) {
                System.out.println("Booking ID : " + b.getBookingId());
                System.out.println("Room ID    : " + b.getRoomId());
                System.out.println("Nights     : " + b.getNumberOfNights());
                System.out.println("Amount     : Rs." + b.getTotalAmount());
                System.out.println("---------------------------");
            }
        }
    }
}
