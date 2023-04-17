package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public interface Temperatures {
     public default Map<String, Double> getTemperatures() {
        Map<String, Double> Temperatures = new HashMap<>();


         Temperatures.put("Rzeszow", 25.5);
         Temperatures.put("Krakow", 26.2);
         Temperatures.put("Wroclaw", 24.8);
         Temperatures.put("Warszawa", 25.2);
         Temperatures.put("Gdansk", 26.1);

        return Temperatures;
    }
}


