package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name = "Triangle";
    private String field = "145";

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public String getField() {
        return field;
    }
}
