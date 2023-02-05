package com.kodilla.stream.world;


import java.util.ArrayList;
import java.util.List;


public final  class Continent {
    private final List<Country> countries = new ArrayList<>();
    private String continentName;

    public boolean addCountry(Country country){

        return countries.add(country);
    }

    public Continent(String continentName) {

        this.continentName = continentName;
    }

    public List<Country> getListOfCountries() {
        return new ArrayList<>(countries);
    }

    public String getContinentName() {

        return continentName;
    }
}
