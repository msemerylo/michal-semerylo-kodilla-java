package com.kodilla.testing.weather.stub;

import java.util.*;

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

    public double medianTemperature(Map<String, Double> tempList ) {
        List<Double> resoultMap = new LinkedList<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resoultMap.add( temperature.getValue());
        }
        Collections.sort(resoultMap);
        if (resoultMap.size()%2==0){
            return (resoultMap.get(resoultMap.size()/2)+resoultMap.get(resoultMap.size()/2-1))/2;
        }else{
            return resoultMap.get(resoultMap.size()/2);
        }
    }
}

