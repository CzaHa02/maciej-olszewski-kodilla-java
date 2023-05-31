package com.kodilla.stream.challenges;

public class ProductService {
    public boolean order(Product product, User user){
        System.out.println(user+"ordering product: "+product);
        return true;
    }
}
