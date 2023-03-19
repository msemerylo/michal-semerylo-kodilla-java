package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

interface ProductOrderRepository {
    boolean createProductOrder(User user, LocalDateTime orderDate, Product product, int quantity);
}
