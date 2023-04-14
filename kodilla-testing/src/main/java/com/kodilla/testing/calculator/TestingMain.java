package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 5);
        Integer resultAdd = calculator.getAdd();
        Integer resultSub = calculator.getSub();

        if (resultAdd.equals(calculator.getAdd())) {
            System.out.println(" Add test OK");
            if (resultSub.equals(calculator.getSub())) {
                System.out.println(" Sub test OK");
            } else {
                System.out.println(" Error!");

            }
        }
    }
}

