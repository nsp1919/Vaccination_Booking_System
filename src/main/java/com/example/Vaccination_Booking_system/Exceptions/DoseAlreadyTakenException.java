package com.example.Vaccination_Booking_system.Exceptions;

public class DoseAlreadyTakenException extends RuntimeException{

    public DoseAlreadyTakenException (String message) {
        super(message);

    }
}