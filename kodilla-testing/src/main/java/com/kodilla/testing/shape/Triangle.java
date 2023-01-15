package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String name = "Triangle";
    private double aSideLength;
    private double bSideLength;
    private double cSideLength;

    public Triangle(double aSideLength, double bSideLength, double cSideLength) {
        this.aSideLength = aSideLength;
        this.bSideLength = bSideLength;
        this.cSideLength = cSideLength;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle triangle)) return false;

        if (Double.compare(triangle.aSideLength, aSideLength) != 0) return false;
        if (Double.compare(triangle.bSideLength, bSideLength) != 0) return false;
        if (Double.compare(triangle.cSideLength, cSideLength) != 0) return false;
        return name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(aSideLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(bSideLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cSideLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName() {
        return name;
    }
    @Override
    public double getField() {
        if (checkExistenceTriangle()) {
            double halfOfCircuit = getHalfCircuit();
            return heronsPattern(halfOfCircuit);
        } else {
            return 0;
        }
    }
    private double getHalfCircuit() {
        return (aSideLength + bSideLength + cSideLength)/2;
    }
    private double heronsPattern(double halfOfCircuit) {
        return Math.sqrt(halfOfCircuit*(halfOfCircuit-aSideLength)*(halfOfCircuit-bSideLength)*(halfOfCircuit-cSideLength));
    }
    private boolean checkExistenceTriangle() {
        return (aSideLength+bSideLength>cSideLength) && (aSideLength+cSideLength>bSideLength) && (bSideLength+cSideLength>aSideLength);
    }

}
