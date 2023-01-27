package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;
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
        double sum = 0.0;
        Map<String, Double> resoultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet())
            sum = sum + resoultMap.get(temperature.getValue());
        return sum / resoultMap.size();
    }



  //  public double medianTemperature() {
  //      Map <String, Double> resoultMap = new HashMap<>();


  //  }
}
