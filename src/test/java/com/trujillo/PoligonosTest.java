package com.trujillo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PoligonosTest {

    private poligonos objCalcUnderTest;

    // Pruebas de la clase poligonos
    @BeforeEach
    public void setUp() {
        objCalcUnderTest = new poligonos();
    }

    @Test
    public void testTrianguloBad() {
        double a = 15;
        double b = 20;
        double expectedResult = 33;
        double result = (long) objCalcUnderTest.triangulo(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testTrianguloGood() {
        double a = 15;
        double b = 20;
        double expectedResult = 150;
        double result = (long) objCalcUnderTest.triangulo(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testRectanguloBad() {
        double a = 3;
        double b = 1;
        double expectedResult = 2;
        double result = (long) objCalcUnderTest.rectangulo(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testRectanguloGood() {
        double a = 3;
        double b = 1;
        double expectedResult = 3;
        double result = (long) objCalcUnderTest.rectangulo(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testCirculoBad() {
        double a = 3;
        double expectedResult = 25;
        double result = (long) objCalcUnderTest.circulo(a);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testCirculoGood() {
        double a = 6;
        double expectedResult = 113;
        double result = (long) objCalcUnderTest.circulo(a);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testPentagonoBad() {
        double a = 8;
        double expectedResult = 3;
        double result = (long) objCalcUnderTest.pentagono(a);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testPentagonoGood() {
        double a = 12;
        double expectedResult = 180;
        double result = (long) objCalcUnderTest.pentagono(a);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testPitagorasBad() {
        double a = 12;
        double b = 2;
        double expectedResult = 13;
        double result = (long) objCalcUnderTest.pitagoras(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testPitagorasGood() {
        double a = 6;
        double b = 2;
        double expectedResult = 6;
        double result = (long) objCalcUnderTest.pitagoras(a, b);
        Assertions.assertEquals(expectedResult, result);
    }
    
}
