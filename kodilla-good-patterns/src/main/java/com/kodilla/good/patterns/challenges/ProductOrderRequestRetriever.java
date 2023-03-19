package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {
        User user = new User("User1");
        LocalDateTime orderDate = LocalDateTime.of(2023,3,17,12,00);
        Product product = new Product("Cup",1200.99);
        int quantity = 1;

        System.out.println("Retrieve product request: ");
        System.out.println("User: "+user.getName()+" Date: "+orderDate+" Product: "+product+" Quantity= "+quantity);
        return new ProductOrderRequest(user, orderDate, product ,quantity);
    }
}
