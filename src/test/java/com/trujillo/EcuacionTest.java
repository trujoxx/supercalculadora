package com.trujillo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class EcuacionTest {
    private ecuacion objCalcUnderTest;

    // Pruebas de la clase ecuacion
    @BeforeEach
    public void setUp() {
        objCalcUnderTest = new ecuacion();
    }

    @Test
    public void testPrimerGradoBad() {
        double a = 15;
        double b = 20;
        double expectedResult = 33;
        double result = objCalcUnderTest.primerGrado(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testPrimerGradoGood() {
        double a = 15;
        double b = 20;
        double expectedResult = 0.75;
        double result = objCalcUnderTest.primerGrado(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSegundorGradoBad() {
        double a = 4;
        double b = 6;
        double c = 2;
        double[] expectedResult = new double[2];
        expectedResult[0] = -1;
        expectedResult[1] = -0.5;
        double[] result = objCalcUnderTest.segundoGrado(a, b, c);

        Assertions.assertEquals(expectedResult[0], result[0]);
        Assertions.assertEquals(expectedResult[1], result[1]);

    }

    @Test
    public void testSegundorGradoGood() {
        double a = 4;
        double b = 6;
        double c = 2;
        double[] expectedResult = new double[2];
        expectedResult[0] = -8;
        expectedResult[1] = -16;
        double[] result = objCalcUnderTest.segundoGrado(a, b, c);

        Assertions.assertEquals(expectedResult[0], result[0]);
        Assertions.assertEquals(expectedResult[1], result[1]);
    }

}
