package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    private static OddNumbersExterminator oddNumbersExterminator;

    @BeforeAll
    static void addExterminator() {
        oddNumbersExterminator = new OddNumbersExterminator();
    }

    @BeforeEach
    public void before() {
        System.out.println("Test: started");
    }

    @AfterEach
    public void after() {
        System.out.println("Test: ok end");
    }

    @DisplayName("Testing program with empty list")

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        List<Integer> emptyListTest = new ArrayList<Integer>();
        List<Integer> emptyList = oddNumbersExterminator.exterminate(emptyListTest);
        Assertions.assertTrue(emptyList.isEmpty());
    }

    @DisplayName("Testing program with normal odd and even list")

    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> evenList = new ArrayList<Integer>();
        for (Integer evenOddNumber : evenList) {
            if (evenOddNumber % 2 >= 0)
                evenList.add(evenOddNumber);
            List<Integer> evenOddNumbers = oddNumbersExterminator.exterminate(evenList);
            Assertions.assertTrue(evenOddNumbers.contains(evenOddNumber));


                    }
                }
            }












