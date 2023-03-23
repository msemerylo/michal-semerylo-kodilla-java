package com.kodilla.good.patterns.flights;


import java.util.Set;

public class FlightLogic {
    private Set<Flight> flightConnections;
    public FlightLogic(Set<Flight> flightConnections){
        this.flightConnections = flightConnections;
    }

    public Set<Flight> getFlightConnections() {
        return flightConnections;
    }
}
