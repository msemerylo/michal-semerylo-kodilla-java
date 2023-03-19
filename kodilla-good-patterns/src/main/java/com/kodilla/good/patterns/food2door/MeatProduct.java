package com.kodilla.good.patterns.food2door;

import java.util.Objects;

public class MeatProduct extends Product{
    private String typeOfMeat;

    public MeatProduct(String productName, String typeOfMeat){
        super(productName);
        this.typeOfMeat = typeOfMeat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MeatProduct that)) return false;

        return Objects.equals(typeOfMeat, that.typeOfMeat);
    }

    @Override
    public int hashCode() {
        return typeOfMeat != null ? typeOfMeat.hashCode() : 0;
    }
}
