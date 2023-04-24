 package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("83000000"));
        Country france = new Country("France", new BigDecimal("67000000"));

        Country china = new Country("China", new BigDecimal("1400000000"));
        Country japan = new Country("Japan", new BigDecimal("126000000"));
        Country southKorea = new Country("South Korea", new BigDecimal("51000000"));

        Country egypt = new Country("Egypt", new BigDecimal("100000000"));
        Country nigeria = new Country("Nigeria", new BigDecimal("206000000"));
        Country southAfrica = new Country("South Africa", new BigDecimal("59000000"));

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);

        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(japan);
        asia.addCountry(southKorea);

        Continent africa = new Continent("Africa");
        africa.addCountry(egypt);
        africa.addCountry(nigeria);
        africa.addCountry(southAfrica);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);


        BigDecimal totalPopulation = world.getPeopleQuantity();


        BigDecimal expectedPopulation = new BigDecimal("2130000000");
        Assertions.assertEquals(expectedPopulation, totalPopulation);
    }
}