package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator) {
        String beautifiedText = poemDecorator.decorate(text);
        System.out.println(beautifiedText);
    }
}



