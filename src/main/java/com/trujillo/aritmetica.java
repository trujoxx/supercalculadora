package com.trujillo;

import java.util.Scanner;

public class aritmetica {
    static Scanner s = new Scanner(System.in);

    public double suma(double a, double b) {

        double resultado = a + b;

        return resultado;
    }

    public double resta(double a, double b) {

        double resultado = a - b;

        return resultado;
    }

    public double multiplicacion(double a, double b) {

        double resultado = a * b;

        return resultado;
    }

    public double division(double a, double b) {

        double resultado = a / b;

        return resultado;
    }

    public double raiz(double a) {
        double resultado;

        if (a <= 0) {
            resultado = 0;
        } else {
            resultado = Math.sqrt(a);
        }

        return resultado;

    }

    public double exponente(double a, double b) {
        double resultado;

        resultado = Math.pow(a, b);

        return resultado;

    }

    public double logaritmo(double a) {
        double resultado;

        if (a <= 0) {
            resultado = 0;
        } else {
            resultado = Math.log(a);
        }

        return resultado;

    }
}