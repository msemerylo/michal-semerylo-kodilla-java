package com.kodilla.testing.weather.stub;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;

    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resoultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resoultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resoultMap;
    }

    public double averageTemperature() {
        Map<String, Double> resoultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resoultMap.put(temperature.getKey(), temperature.getValue());

        }
        return resoultMap.values().stream().reduce(0.0, Double::sum) / resoultMap.size();
    }
    public double medianTemperature() {
        Map<String, Double> resoultMap = new HashMap<>();
        Double[] values = new Double[resoultMap.size()];
        int index = 5;
        for (Map.Entry<String,Double>temp:resoultMap.entrySet()){
            values[index]=temp.getValue();
            index++;
        }

        return Arrays.stream(values).map(t-> Arrays.stream(values).sorted().collect(Collectors.toList()).get(3);
    }
    }

