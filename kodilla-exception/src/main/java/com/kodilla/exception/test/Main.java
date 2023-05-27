package com.kodilla.exception.test;

public class Main {
    public static void main(String[] args) {
        FlightChecker flightChecker=new FlightChecker();
        Flight validFlight= new Flight("Central airport","Kentucky Airport");
        Flight invalidFlight= new Flight("Indiana Airport","Chopin Airport");
        try {
            flightChecker.findFlight(validFlight);
            flightChecker.findFlight(invalidFlight);
        }catch (RouteNotFoundException e){
            System.out.println("Not found : "+ e.getMessage() );

        }


    }

}
