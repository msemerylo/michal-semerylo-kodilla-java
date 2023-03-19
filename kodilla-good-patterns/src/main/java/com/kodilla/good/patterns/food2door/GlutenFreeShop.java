package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GlutenFreeShop implements Producer {
    private Map<Product, Integer> products;

    public GlutenFreeShop(){
        products = createProductList();
    }

    private Map<Product, Integer> createProductList(){
        Map<Product, Integer> products = new HashMap<>();

        products.put(new GlutenFreeProduct("chocolate","gluten free, 70% cocoa, carmel, sea salt"), 15);
        products.put(new GlutenFreeProduct("bread","gluten free bread"),8);
        products.put(new GlutenFreeProduct("dumplings","gluten free dumplings"),21);

        return products;
    }
    @Override
    public boolean process(User user, Map<Product, Integer> productsOrder){
        for (Map.Entry<Product, Integer> entry : productsOrder.entrySet()){
            Optional<Integer> productQuantity = Optional.ofNullable(products.get(entry.getKey()));
            if(productQuantity.orElse(0)<entry.getValue()) {
                System.out.println("Gluten Free Shop: Product is not available. Sorry");
                return false;
            }
        }
        return true;
    }


}
