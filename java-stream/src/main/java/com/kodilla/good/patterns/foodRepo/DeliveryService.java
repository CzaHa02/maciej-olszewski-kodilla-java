package com.kodilla.good.patterns.foodRepo;

public class DeliveryService {
    public static boolean service(User user, FoodProduct foodProduct, int deliverySize) {
        System.out.println("Order for: " + user + "\n" + "Product name: " + foodProduct + "\n" + "Count of product (size value):" + deliverySize+"\n");
        return true;
    }
}

