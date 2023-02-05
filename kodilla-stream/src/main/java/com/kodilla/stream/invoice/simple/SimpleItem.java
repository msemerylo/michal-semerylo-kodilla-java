package com.kodilla.stream.invoice.simple;

public final class SimpleItem {
    private final SimpleProduct product;
    private final double quanity;

    public SimpleItem(SimpleProduct product, double quanity) {
        this.product = product;
        this.quanity = quanity;
    }

    public SimpleProduct getProduct() {
        return product;
    }

    public double getQuanity() {
        return quanity;
    }
    public double getValue(){
        return product.getProductPrice()*quanity;
    }
}
