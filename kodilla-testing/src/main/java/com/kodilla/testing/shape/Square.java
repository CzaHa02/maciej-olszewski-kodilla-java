package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name = "Square";
    private String field = "45";

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public String getField() {
        return field;
    }
}
