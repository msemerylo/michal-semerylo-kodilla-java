package com.kodilla.good.patterns.food2door;

import java.util.Objects;

public class GlutenFreeProduct extends Product{
    private String productDescription;

    public GlutenFreeProduct(String productName, String productDescription){
        super(productName);
        this.productDescription = productDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GlutenFreeProduct that)) return false;

        return Objects.equals(productDescription, that.productDescription);
    }

    @Override
    public int hashCode() {
        return productDescription != null ? productDescription.hashCode() : 0;
    }
}
