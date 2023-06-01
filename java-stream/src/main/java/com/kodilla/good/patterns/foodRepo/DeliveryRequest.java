package com.kodilla.good.patterns.foodRepo;

public class DeliveryRequest {
        private FoodProduct foodProduct;
        private User user;
        private int deliverySize;

        public DeliveryRequest(FoodProduct foodProduct, User user, int deliverySize) {
            this.foodProduct = foodProduct;
            this.user = user;
            this.deliverySize=deliverySize;
        }
        public FoodProduct getProduct() {
            return foodProduct;
        }


        public User getUser() {
            return user;
        }

        public int getDeliverySize(){
            return deliverySize;
        }



    }
