package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightChecker {
private  Map<String, Boolean>fltMap;
        public  FlightChecker (){
            fltMap = new HashMap<>();
            fltMap.put("Central airport", true);
            fltMap.put("Indiana Airport", false);
            fltMap.put("Kentucky Airport", true);
            fltMap.put("Chopin Airport", false);


        }
    public void findFlight(Flight flight) throws RouteNotFoundException {
        String arrivalAirport = flight.getArrivalAiport();
        if (!fltMap.containsKey(arrivalAirport) || !fltMap.get(arrivalAirport)) {
            throw new RouteNotFoundException("Route not found to : " + arrivalAirport);
        }
        System.out.println("Flight found: " +"From " + flight.getDepartureAirpot() + " to " + arrivalAirport);
    }

    }


