package com.kodilla.good.patterns.flights;

public class Flight {
    private final String flightDeparture;
    private final String flightArrival;

    public Flight(String flightDeparture, String flightArrival, int flightNumber) {
        this.flightDeparture = flightDeparture;
        this.flightArrival = flightArrival;
    }

    public String getFlightDeparture() {
        return flightDeparture;
    }

    public String getFlightArrival() {
        return flightArrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight flight)) return false;

        if (getFlightDeparture() != null ? !getFlightDeparture().equals(flight.getFlightDeparture()) : flight.getFlightDeparture() != null)
            return false;
        return getFlightArrival() != null ? getFlightArrival().equals(flight.getFlightArrival()) : flight.getFlightArrival() == null;
    }

    @Override
    public int hashCode() {
        int result = getFlightDeparture() != null ? getFlightDeparture().hashCode() : 0;
        result = 31 * result + (getFlightArrival() != null ? getFlightArrival().hashCode() : 0);
        return result;
    }
}
