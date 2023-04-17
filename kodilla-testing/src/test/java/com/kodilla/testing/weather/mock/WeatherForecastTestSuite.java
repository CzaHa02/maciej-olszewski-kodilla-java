package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithMock() {

        Temperatures temperaturesMock = mock(Temperatures.class);

        Map<String, Double> temperaturesMap = new HashMap<>();

        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);


        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);


        int quantityOfSensors = weatherForecast.calculateForecast().size();


        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageTemperature() {

        Temperatures temperatures = new Temperatures() {
        };
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        double averageTemperature = weatherForecast.calculateAverageTemperature();

        Assertions.assertEquals(25.56, averageTemperature);
        System.out.println( "average: " + averageTemperature + " = 25.56" );
    }


    @Test
    void testCalculateMedianTemperature() {

        Temperatures temperatures = new Temperatures() {
        };
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        double medianTemperature = weatherForecast.calculateMedianTemperature();

        Assertions.assertEquals(25.50, medianTemperature);
        System.out.println( "median: " + medianTemperature + " = 25.5" );

    }
}


