package com.kodilla.spring.display;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public void displayValue(double val) {
        System.out.println("Result: " + val);
    }
}