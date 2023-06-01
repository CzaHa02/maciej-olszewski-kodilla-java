package com.kodilla.good.patterns.foodRepo;

public class User {
    private String Name;
    @Override
    public String toString() {
        return Name;
    }


    public User(String name) {
         Name= name;
    }



}
