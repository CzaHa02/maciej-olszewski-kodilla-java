package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TaskFactoryTestSuite {


    @Test
    void DrivingTaskTest() {
        TaskFactory taskFactory = new TaskFactory();
        Task delivery = taskFactory.makeTask(TaskFactory.DRIVING);
        DrivingTask drivingTaskTest = new DrivingTask("Driving","Warsaw","Delivery");

        Assertions.assertEquals(drivingTaskTest.getTaskName(),delivery.getTaskName());
        System.out.println(delivery+ "  =  "+ drivingTaskTest);

    }


    @Test
    void PaintingTaskTest(){
        TaskFactory taskFactory = new TaskFactory();
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        PaintingTask paintingTask =  new PaintingTask("Painting", "Red", "Wall");

        Assertions.assertEquals(paintingTask.getTaskName(),painting.getTaskName());
        System.out.println(painting +"  =  "+ paintingTask);
    }


    @Test
    void ShoppingTaskTest(){
        TaskFactory taskFactory = new TaskFactory();
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        ShoppingTask shoppingTask = new ShoppingTask("Shopping", "Steel Pipes", 123.5, true);

        Assertions.assertEquals(shoppingTask.getTaskName(),shopping.getTaskName());
        System.out.println(shoppingTask +"  =  "+ shopping);
    }
}
