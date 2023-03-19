package com.kodilla.good.patterns.food2door;

import java.util.Map;

interface Producer {
    boolean process(User user, Map<Product, Integer> productOrders);
}
