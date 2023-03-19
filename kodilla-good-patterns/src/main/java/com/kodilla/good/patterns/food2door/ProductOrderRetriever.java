package com.kodilla.good.patterns.food2door;

import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductOrderRetriever {

    public List<ProductOrderRequest> retrievie() {
        List<ProductOrderRequest> productOrderRequestsList = new ArrayList<>();

        User user = new User("John");
        Producer producer = new ExtraFoodShop();
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new MeatProduct("chicken wings", "chicken"), 2);
        productsList.put(new MeatProduct("beef steak", "beef"), 2);
        productsList.put(new GrainProduct("bread", true), 1);

        productOrderRequestsList.add(new ProductOrderRequest(user, producer, productsList));

        User user1 = new User("Rebeca");
        Producer producer1 = new GlutenFreeShop();
        Map<Product, Integer> productsList1 = new HashMap<>();

        productsList1.put(new GlutenFreeProduct("chocolate","gluten free, 70% cocoa, carmel, sea salt"), 1);
        productsList1.put(new GlutenFreeProduct("bread","gluten free bread"),2);
        productsList1.put(new GlutenFreeProduct("dumplings","gluten free dumplings"),5);

        productOrderRequestsList.add(new ProductOrderRequest(user1, producer1, productsList1));

        User user2 = new User("Carl");
        Producer producer2 = new HealthyShop();
        Map<Product, Integer> productsList2 = new HashMap<>();

        productsList2.put(new GlutenFreeProduct("buckwheat flakes","gluten free buckwheat flakes"),1);
        productsList2.put(new GlutenFreeProduct("mayo","gluten free mayo"),5);
        productsList2.put(new GrainProduct("black rice",true),2);

        productOrderRequestsList.add(new ProductOrderRequest(user2, producer2, productsList2));

        return productOrderRequestsList;
    }

}
