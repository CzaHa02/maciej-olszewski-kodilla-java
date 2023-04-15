package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name = "Circle";
    private String field = "25";
    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public String getField() {
        return field;
    }
}