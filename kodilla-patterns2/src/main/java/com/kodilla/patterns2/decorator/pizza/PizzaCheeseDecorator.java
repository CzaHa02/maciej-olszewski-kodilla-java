package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaCheeseDecorator extends AbstractPizzaOrderDecorator{
    public PizzaCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
@Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(6.00));
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " addintionaly + double cheese";
    }
}

