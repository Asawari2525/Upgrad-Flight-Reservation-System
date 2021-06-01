package com.company;

public class Main {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("Maharashtra", "Pune", "sadashiv peth", "Shashikant", "123456789", "sh@gmail.com");
        Flight flight = new Flight();
        RegularTicket regularTicket = new RegularTicket("PNR2584", "Hyderabad", "pune", flight, "SpiceJet", "1:50", passenger, "3:00", 4630.70f, false);
        TouristTicket touristTicket = new TouristTicket("PNR4285", "Hyderabad", "pune", flight, "SpiceJet", "1:50", passenger, "3:00", 4630.70f, false);
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }
}
