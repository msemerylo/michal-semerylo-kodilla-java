package com.kodilla.exception.test;

public class FlightSearchApp {
    public static void main(String[] args) {
        Flight WarsawLondon = new Flight("Warsaw","London");
        Flight LondonWarsaw = new Flight("London", "Warsaw");
        Flight WarsawLiv = new Flight("Warsaw", "Liv");
        Flight LivParis = new Flight("Liv", "Paris");
        Flight ParisLondon = new Flight("Paris", "London");

        FlightSearchLogic flightSearchLogic = new FlightSearchLogic();

        try {
            boolean existWarsawLondon = flightSearchLogic.findFlight(WarsawLondon);
            System.out.println("Fly Warsaw - London: "+existWarsawLondon);
        } catch (RouteNotFoundException e) {
            System.out.println("Fly Warsaw - London not found");
        }
        finally {
            System.out.println("Search completed");
        }

        try {
            boolean existLondonWarsaw = flightSearchLogic.findFlight(LondonWarsaw);
            System.out.println("Fly London - Warsaw: "+existLondonWarsaw);
        } catch (RouteNotFoundException e) {
            System.out.println("Fly London - Warsaw not found");
        }
        finally {
            System.out.println("Search completed");
        }

        try {
            boolean existWarsawLiv = flightSearchLogic.findFlight(WarsawLiv);
            System.out.println("Fly Warsaw - Liv: "+existWarsawLiv);
        } catch (RouteNotFoundException e) {
            System.out.println("Fly Warsaw - Liv not found");
        }
        finally {
            System.out.println("Search completed");
        }

        try {
            boolean existLivParis = flightSearchLogic.findFlight(LivParis);
            System.out.println("Fly Liv - Paris: "+existLivParis);
        } catch (RouteNotFoundException e) {
            System.out.println("Fly Liv - Paris not found");
        }
        finally {
            System.out.println("Search completed");
        }

        try {
            boolean existParisLondon = flightSearchLogic.findFlight(ParisLondon);
            System.out.println("Fly Paris - London: "+existParisLondon);
        } catch (RouteNotFoundException e) {
            System.out.println("Fly Paris - London not found");
        }
        finally {
            System.out.println("Search completed");
        }

    }
}
