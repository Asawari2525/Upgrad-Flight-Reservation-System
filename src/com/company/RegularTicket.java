package com.company;

public class RegularTicket extends Ticket {
    private String specialServices = "Food, Water,Snacks";

    public RegularTicket(String pnr, String from, String to, Flight f, String departureDateTime,
                         String arrivalDateTime, Passenger p, String seatNO, float price, boolean cancelled) {
        super(pnr, from, to, f, departureDateTime, arrivalDateTime, p, seatNO, price, cancelled);
        this.specialServices = specialServices;
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void updateSpecialsServices(String str) {
        toString().concat(specialServices + str);
    }


}
