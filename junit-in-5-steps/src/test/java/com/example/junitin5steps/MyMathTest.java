package com.example.junitin5steps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {

    private MyMath math = new MyMath();

    @Test
    void testZero() {
        int[] numbers = {};

        int result = math.calculateSum(numbers);

        int expectedResult = 0;
        assertEquals(expectedResult, result);
        // absence of failure is success
        // test condition or assert
    }

    @Test
    void test() {
        int[] numbers = {1, 2, 3};

        int result = math.calculateSum(numbers);

        int expectedResult = 6;
        assertEquals(expectedResult, result);
        // absence of failure is success
        // test condition or assert
    }
}
