package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearch {
    private FlightLogic flightLogic;
    public FlightSearch(FlightLogic flightLogic){
        this.flightLogic = flightLogic;
    }
    public Set<Flight> flightsConnectionFrom(String flightDeparture){
        return flightLogic.getFlightConnections()
                .stream()
                .filter(flight -> flight.getFlightDeparture().equals(flightDeparture))
                .collect(Collectors.toSet());
    }
    public Set<Flight> flightsConnectionTo(String flightArrival){
        return flightLogic.getFlightConnections()
                .stream()
                .filter(flight -> flight.getFlightArrival().equals(flightArrival))
                .collect(Collectors.toSet());
    }
    public Set<List<Flight>> flightsConnection(String flightDeparture, String flightArrival) {
        Set<List<Flight>> connectionSet = new HashSet<>();

        flightLogic.getFlightConnections()
                .stream()
                .filter(flight -> flight.getFlightDeparture().equals(flightDeparture))
                .forEach(flight -> {
                    List<Flight> connections = flightLogic.getFlightConnections()
                            .stream()
                            .filter(flight1 -> (flight.getFlightArrival().equals(flight1.getFlightArrival())&&flight1.getFlightArrival().equals(flightArrival)))
                            .collect(Collectors.toList());

                    if (connections.size()>0){
                        List<Flight> flightsRoutes = new ArrayList<>();
                        flightsRoutes.add(flight);
                        flightsRoutes.addAll(connections);
                        connectionSet.add(flightsRoutes);
                    }
                });
        return connectionSet;
    }
}
