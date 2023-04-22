package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(" Usa",text -> ":) " +text.toUpperCase().repeat(10)+" (:" );
        poemBeautifier.beautify("Poland ",text -> ":) " +text.toUpperCase().repeat(10)+" (:" );
        poemBeautifier.beautify(" France",text -> ":) " +text.repeat(10)+" (:" );
        poemBeautifier.beautify(" Canada",text -> ":) " +text.toUpperCase().repeat(10).replaceAll( "NADA" , "STORAMA")+" (:" );
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}