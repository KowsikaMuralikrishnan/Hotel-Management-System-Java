🏨 Hotel Management System (Console Based – Java)

**📌 Project Overview**

The Hotel Management System is a console-based Java application developed using Object-Oriented Programming (OOP) concepts.
This project helps manage guests, room availability, room booking, billing, and checkout operations in a simple hotel setup.
It is mainly designed for academic purposes to demonstrate Java OOP, exception handling, and collection usage.

**🎯 Objectives**

Register and manage hotel guests

Maintain room details and availability

Allow booking only if rooms are available

Calculate total bill based on room type and stay duration

Handle invalid operations using custom exceptions

**🛠️ Technologies Used**

Language: Java

Concepts:

Object-Oriented Programming (OOP)

Encapsulation

Exception Handling

Collections (ArrayList)

IDE: Eclipse / IntelliJ / VS Code (any Java IDE)

**📂 Project Structure**

com.wipro.hms
│
├── entity
│   ├── Guest.java
│   ├── Room.java
│   └── Booking.java
│
├── service
│   └── HotelService.java
│
├── util
│   ├── InvalidGuestException.java
│   ├── RoomNotAvailableException.java
│   └── BookingException.java
│
└── main
    └── Main.java

**🧩 Package Description**

🔹 com.wipro.hms.entity

Contains entity classes:

Guest – Stores guest details

Room – Stores room information and availability

Booking – Stores booking and billing details

🔹 com.wipro.hms.service

HotelService

Handles all business logic like:

Guest validation


Room availability check

Room booking

Bill calculation

Checkout process

🔹 com.wipro.hms.util

Contains custom exception classes:

InvalidGuestException – When guest ID is invalid

RoomNotAvailableException – When room is already booked

BookingException – When booking or checkout fails

🔹 com.wipro.hms.main

Main.java

Entry point of the application.

Initializes sample data and demonstrates booking, billing, and checkout.

**⚙️ Features**

Console-based interaction

Secure room booking (no double booking)

Automatic bill calculation

Guest-wise booking summary

Exception handling for invalid operations

**🧪 Sample Operations Performed**

Guest registration

Room booking

Bill generation

Booking summary display

Guest checkout

**📘 Learning Outcomes**

Strong understanding of Java OOP concepts

Practical use of custom exceptions

Real-time application logic using collections

Clean project structure with packages

**Output:**

<img width="839" height="390" alt="image" src="https://github.com/user-attachments/assets/517fffdd-0a88-44a6-93f8-875910f57b9a" />
