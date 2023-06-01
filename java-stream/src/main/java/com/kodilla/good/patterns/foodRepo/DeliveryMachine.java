package com.kodilla.good.patterns.foodRepo;


public class DeliveryMachine {

    private DeliveryService deliveryService;




    public DeliveryMachine( DeliveryService deliveryService) {

        this.deliveryService = deliveryService;

    }



    public DeliveryDto process(DeliveryRequest deliveryRequest) {
       DeliveryService.service( deliveryRequest.getUser(),deliveryRequest.getProduct(),deliveryRequest.getDeliverySize());
        return null;
    }
}




