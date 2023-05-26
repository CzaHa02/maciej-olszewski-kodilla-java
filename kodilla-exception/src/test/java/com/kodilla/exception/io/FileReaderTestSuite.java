package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTestSuite {


    @Test
    void whenFileDosentExistsReadFileShouldThrowException() {
        FileReader fileReader = new FileReader();
        String fileName = "nie_ma_takiego_pliku.txt";
        assertThrows(FileReaderException.class, () -> fileReader.readFile2(fileName));
    }

    @Test
    public void testReadFileWithName() {
        FileReader fileReader = new FileReader();
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile2("nie_ma_takiego_pliku.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile2(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile2("names.txt"))
        );
    }


    @Test
    public void testSecondChallenge() {
        double x = 2;
        double y = 1.5;
        SecondChallenge secondChallenge = new SecondChallenge();

        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));
        System.out.println(secondChallenge);
    }
}