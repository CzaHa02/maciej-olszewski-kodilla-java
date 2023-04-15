package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Nested
@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {
@BeforeEach
 public void before() {
    System.out.println("Test: Start");
}
@AfterEach
    public void after() {
        System.out.println("Test: Stop");
    }

    @DisplayName("Test add  figure")
    @Test
    void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square();
        Shape circle = new Circle();
        Shape triangle = new Triangle();
 
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

    }

    @DisplayName("Test  remove figure")
    @Test

    void testRemoveFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square();
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        shapeCollector.removeFigure(square);
        shapeCollector.removeFigure(circle);
        shapeCollector.removeFigure(triangle);
    }

    @DisplayName("Test get figure")
    @Test
    void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square();
        shapeCollector.addFigure(square);

        Shape getShape = shapeCollector.getFigure(0);

        assertEquals(square, getShape);
    }



    @DisplayName("Test show figures")
    @Test
    void testShowFigures() {

        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square();
        Shape circle = new Circle();
        Shape triangle= new Triangle();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        shapeCollector.showFigures();




    }
}