package com.kodilla.exception.test;

public class Flight {

   private String departureAirpot;
   private String arrivalAiport;

    public Flight(String departureAirpot, String arrivalAiport) {
        this.departureAirpot = departureAirpot;
        this.arrivalAiport = arrivalAiport;
    }

    public String getDepartureAirpot() {
        return departureAirpot;
    }

    public String getArrivalAiport() {
        return arrivalAiport;
    }
}
