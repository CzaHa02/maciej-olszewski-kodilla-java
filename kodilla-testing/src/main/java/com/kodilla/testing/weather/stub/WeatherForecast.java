package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
        private Temperatures temperatures;

        private Temperatures average;

        public WeatherForecast(Temperatures temperatures) {
            this.temperatures = temperatures;
        }

        public Map<String, Double> calculateForecast() {
            Map<String, Double> resultMap = new HashMap<>();

            for (Map.Entry<String, Double> temperature :
                    temperatures.getTemperatures().entrySet()) {


                resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
            }
            return resultMap;

        }

        public double calculateAverageTemperature() {
            double sum = 0.0;
            for (Double temperature : temperatures.getTemperatures().values()) {
                sum += temperature;
            }
            return sum / temperatures.getTemperatures().size();
        }

        public double calculateMedianTemperature() {
            List<Double> sortedTemperatures = new ArrayList<>(temperatures.getTemperatures().values());
            Collections.sort(sortedTemperatures);
            int size = sortedTemperatures.size();
            if (size % 2 == 0) {
                int half = size / 2;
                return (sortedTemperatures.get(half - 1) + sortedTemperatures.get(half)) / 2.0;
            } else {
                return sortedTemperatures.get(size / 2);
            }
        }
    }











