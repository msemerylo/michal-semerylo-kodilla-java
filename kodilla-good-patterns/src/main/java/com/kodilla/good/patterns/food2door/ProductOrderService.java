package com.kodilla.good.patterns.food2door;

import java.util.List;

public class ProductOrderService {
    public void processOrders(List<ProductOrderRequest> productOrderRequests){
        productOrderRequests.stream()
                .map(n->{
                    System.out.println("Processing order: "+n.getUser().getName());
                    return n.getProducer().process(n.getUser(), n.getProductOrderRequest());
                })
                .forEach(t-> System.out.println("Order finished success: "+t+"\n"));
    }
}
