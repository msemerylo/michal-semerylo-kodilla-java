package com.kodilla.good.patterns.food2door;

public class Food2DoorApplication {
    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.processOrders(new ProductOrderRetriever().retrievie());
    }

}
