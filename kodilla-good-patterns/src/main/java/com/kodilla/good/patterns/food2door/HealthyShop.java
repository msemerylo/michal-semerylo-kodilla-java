package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HealthyShop implements Producer{
    private Map<Product, Integer> products;

    public HealthyShop(){
        products = createProductsList();
    }
    private Map<Product, Integer> createProductsList(){
        Map<Product, Integer> products = new HashMap<>();

        products.put(new GlutenFreeProduct("buckwheat flakes","gluten free buckwheat flakes"),5);
        products.put(new GlutenFreeProduct("mayo","gluten free mayo"),15);
        products.put(new GrainProduct("black rice",true),10);
        products.put(new GrainProduct("rolls", true),26);

        return products;
    }
    @Override
    public boolean process(User user, Map<Product, Integer> productsOrder) {
        for (Map.Entry<Product, Integer> entry : productsOrder.entrySet()) {
            Optional<Integer> productQuantity = Optional.ofNullable(products.get(entry.getKey()));
            if (productQuantity.orElse(0) < entry.getValue()) {
                System.out.println("Healthy Shop: Product is not available. Sorry");
                return false;
            }
        }
        return true;
    }
}
