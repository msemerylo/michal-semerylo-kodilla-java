package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements Producer{
    private Map<Product, Integer> products;

    public ExtraFoodShop(){
        products = createProductsList();
    }
    private Map<Product, Integer> createProductsList(){
        Map<Product, Integer> products = new HashMap<>();

        products.put(new MeatProduct("chicken wings", "chicken"),7);
        products.put(new MeatProduct("beef steak", "beef"),10);
        products.put(new GrainProduct("bread", true),5);

        return products;
    }
    @Override
    public boolean process(User user, Map<Product, Integer> productsOrder){
        for(Map.Entry<Product, Integer> entry : productsOrder.entrySet()){
            Optional<Integer> productQuantity = Optional.ofNullable(products.get(entry.getKey()));
            if(productQuantity.orElse(0)<entry.getValue()){
                System.out.println("Extra Food Shop: Product is not available. Sorry");
                return false;
            }
        }
        return true;
    }
}
