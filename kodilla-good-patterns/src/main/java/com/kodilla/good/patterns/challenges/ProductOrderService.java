package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

interface ProductOrderService {
    public boolean order(final User user, final LocalDateTime orderDate, final Product product, final int quantity);
}
