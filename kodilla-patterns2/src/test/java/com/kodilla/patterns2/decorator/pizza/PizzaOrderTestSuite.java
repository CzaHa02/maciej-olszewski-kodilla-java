package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {
    @Test
    public void testCheeseAddedGetCost() {

        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new PizzaCheeseDecorator(pizzaOrder);

        BigDecimal theCost = pizzaOrder.getCost();


        assertEquals(new BigDecimal(21), theCost);
    }
    @Test
    public void testCheeseAddedGetDescription(){

        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new PizzaCheeseDecorator(pizzaOrder);

        String description = pizzaOrder.getDescription();

        assertEquals("standard pizza with: dough, tomato sauce addintionaly + double cheese", description);
    }




    @Test
    public void testIngredientsAddedGetCost() {

        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new IngredientsDecorator(pizzaOrder);

        BigDecimal theCost = pizzaOrder.getCost();


        assertEquals(new BigDecimal(35), theCost);
    }

    @Test
    public void testIngredientsAddedGetDescription(){

        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new IngredientsDecorator(pizzaOrder);

        String description = pizzaOrder.getDescription();

        assertEquals("standard pizza with: dough, tomato sauce addintionaly + becon, tomato, mushrooms, onions, black olives", description);
    }

}
