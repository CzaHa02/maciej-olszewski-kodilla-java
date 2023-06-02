package com.kodilla.good.patterns.PrivateFlyCompany;

public class Fly {
    private String startCity;
    private String endCity;

    public Fly(String startCity, String endCity) {
        this.startCity = startCity;
        this.endCity = endCity;
    }

    public String getStartCity() {
        return startCity;
    }

    public String getEndCity() {
        return endCity;
    }
}