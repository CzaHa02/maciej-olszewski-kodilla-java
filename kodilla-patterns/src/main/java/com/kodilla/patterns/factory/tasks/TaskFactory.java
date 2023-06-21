package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask (final String taskFactory){
        return switch (taskFactory) {
            case DRIVING -> new DrivingTask("Driving", "Warsaw", "Delivery");
            case PAINTING -> new PaintingTask("Painting", "Red", "Wall");
            case SHOPPING -> new ShoppingTask("Shopping", "Steel Pipes", 123.5, true);
            default -> null;
          };
     }
}


