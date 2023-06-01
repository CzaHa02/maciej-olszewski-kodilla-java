package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private Product product;
    private User user;

    public OrderRequest(Product product, User user) {
        this.product = product;
        this.user = user;
    }
    public Product getProduct() {
        return product;
    }


    public User getUser() {
        return user;
    }


}
