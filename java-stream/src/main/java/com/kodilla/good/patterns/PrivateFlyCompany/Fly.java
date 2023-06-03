package com.kodilla.good.patterns.PrivateFlyCompany;

public class Fly {
    private String startCity;
    private String endCity;
    private String middleCity;

    public Fly(String startCity, String endCity ,String middleCity) {
        this.startCity = startCity;
        this.endCity = endCity;
        this.middleCity=middleCity;
    }

    public String getStartCity() {
        return startCity;
    }

    public String getEndCity() {
        return endCity;
    }

    public String getMiddleCity(){return middleCity;}
}