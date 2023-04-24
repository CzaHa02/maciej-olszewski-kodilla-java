package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String name;
    private final List<Country> countries = new ArrayList<>();

    public Continent(final String name) {
        this.name = name;
    }

    public void addCountry(final Country country) {
        countries.add(country);
    }

    public String getName() {
        return name;
    }

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }

}