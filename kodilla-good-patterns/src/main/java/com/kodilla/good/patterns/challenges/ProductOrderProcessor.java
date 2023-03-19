package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(InformationService informationService,
                                 ProductOrderService productOrderService,
                                 ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public ProductOrderDto process(ProductOrderRequest productOrderRequest){
        boolean orderSuccessful = productOrderService.order(productOrderRequest.getUser(),
                productOrderRequest.getOrderDate(),
                productOrderRequest.getProduct(),
                productOrderRequest.getQuantity());
        if (orderSuccessful) {
            informationService.inform(productOrderRequest.getUser());
            productOrderRepository.createProductOrder(productOrderRequest.getUser(),
                    productOrderRequest.getOrderDate(),
                    productOrderRequest.getProduct(),
                    productOrderRequest.getQuantity());
        } else {
            System.out.println("Your order request has been rejected");
        }
        return new ProductOrderDto(productOrderRequest.getUser(),
                productOrderRequest.getOrderDate(),
                productOrderRequest.getProduct(),
                productOrderRequest.getQuantity(),
                orderSuccessful);
    }
}
