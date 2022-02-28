package com.trujillo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private aritmetica objCalcUnderTest;

    @BeforeEach
    public void setUp() {
        objCalcUnderTest = new aritmetica();
    }

    @Test
    public void testAdd() {
        double a = 15;
        double b = 20;
        int expectedResult = 33;
        long result = (long) objCalcUnderTest.suma(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void good() {
        double a = 15;
        double b = 20;
        int expectedResult = 35;
        long result = (long) objCalcUnderTest.suma(a, b);
        Assertions.assertEquals(expectedResult, result);
    }
}
