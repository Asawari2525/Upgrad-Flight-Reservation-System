package com.company;

public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private Flight f;
    private String departureDateTime;
    private String arrivalDateTime;
    private Passenger p;
    private String seatNO;
    private float price;
    private boolean Cancelled;

    public Ticket(String pnr, String from, String to, Flight f, String departureDateTime,
                  String arrivalDateTime, Passenger p, String seatNO, float price, boolean Cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.f = f;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.p = p;
        this.seatNO = seatNO;
        this.price = price;
        this.Cancelled = Cancelled;
    }

    public String checkStatus() {
        if (Cancelled) {
            return "Cancelled";
        }
        return "Confirmed";
    }

    public int getFlightDuration() {
        return (Integer.parseInt(departureDateTime) - Integer.parseInt(arrivalDateTime));
    }

    public void cancel() {
        Cancelled = true;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Flight getFlights() {
        return f;
    }

    public void setFlights(Flight flights) {
        this.f = flights;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Passenger getPassengers() {
        return p;
    }

    public void setPassengers(Passenger passengers) {
        this.p = passengers;
    }

    public String getSeatNO() {
        return seatNO;
    }

    public void setSeatNO(String seatNO) {
        this.seatNO = seatNO;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return Cancelled;
    }

    public void setCancelled(boolean cancelled) {
        Cancelled = cancelled;
    }
}
