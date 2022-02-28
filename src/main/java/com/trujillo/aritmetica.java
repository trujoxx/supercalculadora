package com.trujillo;

import java.util.Scanner;

public class aritmetica {
    static Scanner s = new Scanner(System.in);

    public static double suma(double a, double b) {

        double resultado = a + b;

        return resultado;
    }

    public static double resta() {

        System.out.println("Introduce el primer número");
        int a = s.nextInt();
        System.out.println("Introduce el segundo número");
        int b = s.nextInt();

        int resultado = a - b;

        return resultado;
    }

    public static double division() {

        System.out.println("Introduce el primer número");
        double a = s.nextDouble();
        System.out.println("Introduce el segundo número");
        double b = s.nextDouble();

        double resultado = a / b;

        return resultado;
    }

    public static double multiplicacion() {

        System.out.println("Introduce el primer número");
        double a = s.nextDouble();
        System.out.println("Introduce el segundo número");
        double b = s.nextDouble();

        double resultado = a * b;

        return resultado;
    }

    public static double raiz() {
        double resultado;

        System.out.println("Introduce un número");
        double a = s.nextDouble();

        if (a <= 0) {
            resultado = 0;
        } else {
            resultado = Math.sqrt(a);
        }

        return resultado;

    }

    public static double exponente() {
        double resultado;

        System.out.println("Introduce un número");
        double a = s.nextDouble();
        System.out.println("Introduce el exponente");
        int b = s.nextInt();

        if (a <= 0) {
            resultado = 0;
        } else {
            resultado = Math.pow(a, b);
        }

        return resultado;

    }

    public static double logaritmo() {
        double resultado;

        System.out.println("Introduce un número");
        double a = s.nextDouble();

        if (a <= 0) {
            resultado = 0;
        } else {
            resultado = Math.log(a);
        }

        return resultado;

    }
}