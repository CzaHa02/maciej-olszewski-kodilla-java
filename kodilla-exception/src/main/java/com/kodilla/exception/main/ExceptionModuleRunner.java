package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        String fileName = "names";
        try {
            fileReader.readFile2(fileName);
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }
}
