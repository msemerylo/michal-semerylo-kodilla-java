package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchLogic {
    private final Map<String, Boolean> airportMap;

    public FlightSearchLogic() {
        airportMap = airport();
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());
    }

    private boolean findAirport(String airPortName) throws RouteNotFoundException {
        if (airportMap.get(airPortName)) {
            return airportMap.get(airPortName);
        } else {
            throw new RouteNotFoundException("Fly not exist");
        }
    }

    private Map<String, Boolean> airport() {
        Map<String, Boolean> airport = new HashMap<>();
        airport.put("Warsaw", true);
        airport.put("Liv", false);
        airport.put("London", true);
        airport.put("Paris", false);
        return airport;
    }
}

//    private class App{
//
//
//    public static void main(String[] args) {
//        Flight WarsawLondon = new Flight("Warsaw","London");
//        Flight LondonWarsaw = new Flight("London", "Warsaw");
//        Flight WarsawBarcelona = new Flight("Warsaw", "Liv");
//        Flight BarcelonaParis = new Flight("Barcelona", "Paris");
//
//        FlightSearchLogic flightSearchLogic = new FlightSearchLogic();
//
//        try {
//            boolean existWarsawLondon = flightSearchLogic.findFlight(WarsawLondon);
//            System.out.println("Fly War Lon"+existWarsawLondon);
//        } catch (RouteNotFoundException e) {
//            System.out.println("Fly not found");
//        }
//
//    }

