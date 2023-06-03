package com.kodilla.good.patterns.PrivateFlyCompany;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlySystem {
    private List<Fly> flies;

    public FlySystem() {
        this.flies = new ArrayList<>();
    }

    public void addFly(Fly fly) {
        flies.add(fly);
    }

    public List<Fly> findFromCity(String city) {
        return flies.stream()
                .filter(fly -> fly.getStartCity().equals(city))
                .collect(Collectors.toList());
    }

    public List<Fly> findToCity(String city) {
        return flies.stream()
                .filter(fly -> fly.getEndCity().equals(city))
                .collect(Collectors.toList());
    }

    public List<Fly> findThroghCity(String city) {
        return flies.stream()
                .filter(fly -> fly.getMiddleCity().equals(city) )
                .collect(Collectors.toList());
    }
}