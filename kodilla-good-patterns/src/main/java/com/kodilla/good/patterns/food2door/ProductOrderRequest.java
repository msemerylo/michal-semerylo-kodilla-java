package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class ProductOrderRequest {
    private User user;
    private Producer producer;
    private Map<Product, Integer> productOrderRequest;

    public ProductOrderRequest(User user, Producer producer, Map<Product, Integer> productOrderRequest){
        this.user = user;
        this.producer = producer;
        this.productOrderRequest = productOrderRequest;
    }

    public User getUser() {
        return user;
    }

    public Producer getProducer() {
        return producer;
    }

    public Map<Product, Integer> getProductOrderRequest() {
        return productOrderRequest;
    }
}
