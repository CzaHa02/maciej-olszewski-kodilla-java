package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
        private InformationService informationService;
        private ProductService productService;
        private OrderRepository orderRepository;

        public ProductOrderService(InformationService informationService, ProductService productService, OrderRepository orderRepository) {
            this.informationService = informationService;
            this.productService = productService;
            this.orderRepository = orderRepository;
        }

        public OrderDto process(OrderRequest orderRequest) {
            boolean isOrdered = productService.order(orderRequest.getProduct(), orderRequest.getUser());

            if (isOrdered) {
                informationService.inform(orderRequest.getUser());
                orderRepository.createOrder(orderRequest.getProduct(), orderRequest.getUser());
                return new OrderDto(orderRequest.getUser(), true);
            } else {
                return new OrderDto(orderRequest.getUser(), false);
            }
        }
    }