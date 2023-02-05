package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {

        return peopleQuantity;
    }
    //    public BigDecimal getPeopleQuantityOnCountry() {
//        BigDecimal peopleQuantity = new BigDecimal();
//        return peopleQuantity;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country country)) return false;

        return Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode() {
        return countryName != null ? countryName.hashCode() : 0;
    }

}
