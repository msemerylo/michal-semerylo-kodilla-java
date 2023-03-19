package com.kodilla.good.patterns.food2door;

public class GrainProduct extends Product{
    private boolean isOrganic;

    public GrainProduct(String productName, boolean isOrganic){
        super(productName);
        this.isOrganic = isOrganic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GrainProduct that)) return false;

        return isOrganic == that.isOrganic;
    }

    @Override
    public int hashCode() {
        return (isOrganic ? 1 : 0);
    }
}
