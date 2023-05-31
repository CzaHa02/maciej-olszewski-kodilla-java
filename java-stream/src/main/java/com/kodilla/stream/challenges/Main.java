package com.kodilla.stream.challenges;

public class Main {
    public static void main(String[] args) {

        InformationService informationService = new InformationService();
        ProductService productService = new ProductService();
        OrderRepository orderRepository = new OrderRepository();


        ProductOrderService productOrderService = new ProductOrderService(informationService, productService, orderRepository);
       CustomerBase customerBase = new CustomerBase();



        OrderRequest orderRequest = new OrderRequest(customerBase.productEBike, customerBase.user1 );
        OrderRequest orderRequest2 = new OrderRequest(customerBase.productJigSaw, customerBase.user4);
        OrderRequest orderRequest3 = new OrderRequest(customerBase.productiPhone,customerBase.user6);



        OrderDto orderDto = productOrderService.process(orderRequest);
         productOrderService.process(orderRequest2);
        productOrderService.process(orderRequest3);






        if (orderDto.isOrdered()) {
            System.out.println("Order placed successfully for customer: " + orderDto.getUser());
        } else {
            System.out.println("Order failed for user: " + orderDto.getUser());
        }
    }
}