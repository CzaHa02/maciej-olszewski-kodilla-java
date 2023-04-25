package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        return IntStream.of(numbers)
                .average()
                .orElse(numbers.length);

    }
}