package com.trujillo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
public class AritmeticaTest {
    private aritmetica objCalcUnderTest;

    // Pruebas de la clase aritmetica
    @BeforeEach
    public void setUp() {
        objCalcUnderTest = new aritmetica();
    }

    @Test
    public void testSumaBad() {
        double a = 15;
        double b = 20;
        double expectedResult = 33;
        double result = (long) objCalcUnderTest.suma(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSumaGood() {
        double a = 15;
        double b = 20;
        double expectedResult = 35;
        double result = objCalcUnderTest.suma(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testRestaGood() {
        double a = 25;
        double b = 20;
        double expectedResult = 5;
        double result = objCalcUnderTest.resta(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testRestaBad() {
        double a = 15;
        double b = 20;
        double expectedResult = 35;
        double result = objCalcUnderTest.resta(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiplicacionGood() {
        double a = 7;
        double b = 5;
        double expectedResult = 35;
        double result = objCalcUnderTest.multiplicacion(a, b);
        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    public void testMultiplicacionBad() {
        double a = 15;
        double b = 20;
        double expectedResult = 35;
        double result = objCalcUnderTest.multiplicacion(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivisionGood() {
        double a = 70;
        double b = 2;
        double expectedResult = 35;
        double result = objCalcUnderTest.division(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivisionBad() {
        double a = 15;
        double b = 20;
        double expectedResult = 35;
        double result = objCalcUnderTest.division(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testRaizGood() {
        double a = 64;
        double expectedResult = 8;
        double result = objCalcUnderTest.raiz(a);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testRaizBad() {
        double a = 35;
        double expectedResult = 5;
        double result = objCalcUnderTest.raiz(a);
        Assertions.assertEquals(expectedResult, result);
    }


    @Test
    public void testExponenteGood() {
        double a = 2;
        double b = 2;
        double expectedResult = 4;
        double result = objCalcUnderTest.exponente(a, b);
        Assertions.assertEquals(expectedResult, result);
    }
    

    @Test
    public void testExponenteBad() {
        double a = 2;
        double b = 2;
        double expectedResult = 6;
        double result = objCalcUnderTest.exponente(a, b);
        Assertions.assertEquals(expectedResult, result);
    }
    

    @Test
    public void testLogGood() {
        double a = 1;
        double expectedResult = 0;
        double result = objCalcUnderTest.logaritmo(a);
        Assertions.assertEquals(expectedResult, result);
    }


    @Test
    public void testLogBad() {
        double a = 2;
        double expectedResult = 4;
        double result = objCalcUnderTest.logaritmo(a);
        Assertions.assertEquals(expectedResult, result);
    }
    
    


}
