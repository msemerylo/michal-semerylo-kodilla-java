package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderDto {

    private User user;
    private LocalDateTime orderDate;
    private Product product;
    private int quantity;
    private boolean orderSuccessful;

    public ProductOrderDto(User user, LocalDateTime orderDate, Product product, int quantity, boolean orderSuccessful) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
        this.orderSuccessful = orderSuccessful;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isOrderSuccessful() {
        return orderSuccessful;
    }
}
