package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public static void main(String[]args){

    }
    public ArrayList<Integer> exterminate (List<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);

            }
        }
        return evenNumbers;
    }


    }






          
