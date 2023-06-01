package com.kodilla.good.patterns.foodRepo;



public class deliverySystem {
    public static void main(String[] args) {


        FoodDelivers foodDelivers = new FoodDelivers();
        OrdersBase ordersBase = new OrdersBase();

DeliveryService deliveryService = new DeliveryService();
DeliveryMachine deliveryMachine =new DeliveryMachine(deliveryService);

        DeliveryRequest deliveryRequest1 = new DeliveryRequest(ordersBase.glutenFreeBread, foodDelivers.delivers3GFS, 240);
        DeliveryRequest deliveryRequest2 = new DeliveryRequest(ordersBase.milkBottles, foodDelivers.deliversHS, 200);
        DeliveryRequest deliveryRequest3 = new DeliveryRequest(ordersBase.proteinShake, foodDelivers.deliversHS, 525);
        DeliveryRequest deliveryRequest4 = new DeliveryRequest(ordersBase.oranges, foodDelivers.deliversEFS, 1000);

        deliveryMachine.process(deliveryRequest1);
        deliveryMachine.process(deliveryRequest2);
        deliveryMachine.process(deliveryRequest3);
        deliveryMachine.process(deliveryRequest4);
    }
}
