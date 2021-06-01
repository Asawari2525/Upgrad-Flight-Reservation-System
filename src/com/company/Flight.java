package com.company;

public class Flight {
    private String FlightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;
    private int booking_Counter;

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats, int booking_Counter) {
        FlightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
        this.booking_Counter = booking_Counter;
    }

    public Flight() {
        this("Airbus737", "SpiceJet", 200, 126, 121);
    }

    public String getFlightDetails() {
        return "Flight Number: " + FlightNumber + " airline " + airline + " flight capacity " + capacity + " Booked tickets:" + bookedSeats;
    }

    public boolean checkAvailability() {
        if (bookedSeats < capacity) {
            return true;
            //int counter = incrementBookingCounter();
        } else {
            return false;
        }
    }

    public void incrementBookingCounter() {
        booking_Counter++;
    }

    public String getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        FlightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public int getBooking_Counter() {
        return booking_Counter;
    }

    public void setBooking_Counter(int booking_Counter) {
        this.booking_Counter = booking_Counter;
    }
}
