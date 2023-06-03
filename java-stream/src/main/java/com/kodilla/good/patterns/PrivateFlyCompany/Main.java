package com.kodilla.good.patterns.PrivateFlyCompany;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlySystem flySystem = new FlySystem();


        flySystem.addFly(new Fly("GDANSK", "WROCLAW",""));
        flySystem.addFly(new Fly("KRAKOW", "WROCLAW",""));
        flySystem.addFly(new Fly("GDANSK", "KRAKOW",""));
        flySystem.addFly(new Fly("KRAKOW", "KRAKOW",""));

        flySystem.addFly(new Fly("WROCLAW", "GDANSK","KRAKOW"));


        List<Fly> fliesFromGdansk = flySystem.findFromCity("GDANSK");
        System.out.println("Flies from Gdansk:");
        for (Fly fly : fliesFromGdansk) {
            System.out.println(fly.getStartCity() + " -> " + fly.getEndCity());
        }


        List<Fly> fliesToWroclaw = flySystem.findToCity("WROCLAW");
        System.out.println("Flies to Wroclaw:");
        for (Fly fly : fliesToWroclaw) {
            System.out.println(fly.getStartCity() + " -> " + fly.getEndCity());
        }


        List<Fly> fliesThroughKrakow = flySystem.findThroghCity("KRAKOW");
        System.out.println("Flies through Krakow:");
        for (Fly fly : fliesThroughKrakow) {
            System.out.println(fly.getStartCity()+ " -> " + fly.getMiddleCity() + " -> " + fly.getEndCity());
            System.out.println(fly.getEndCity()+ " -> " + fly.getMiddleCity() + " -> " + fly.getStartCity());

            }
        }
    }
