package com.trujillo;

import java.util.Scanner;

public class ecuacion {

    static Scanner leer = new Scanner(System.in);

    public double[] calculoSegundoGrado(double a, double b, double c) {
        double discriminante;
        double[] solucion = new double[2];

        discriminante = Math.pow(b, 2) - (4 * a * c);

        if (discriminante == 0) {
            solucion[0] = 0;
            solucion[1] = -b / 2 * a;
        } else if (b == 0) {

            solucion[0] = Math.sqrt(-(c / a));

        } else if (c == 0) {
            solucion[0] = Math.sqrt(-b / a);

        } else if (b == 0 && c == 0) {
            solucion[0] = 0;
        } else if (discriminante > 0) {

            solucion[0] = (-b + Math.sqrt(discriminante)) / 2 * a;
            solucion[1] = (-b - Math.sqrt(discriminante)) / 2 * a;
        } else {
            return null;
        }

        return solucion;
    }

    public double[] segundoGrado(double a, double b, double c) {
        double [] solucion = new double[2];
        if (calculoSegundoGrado(a, b, c) == null) {
            solucion[0] = 0;
        } else {
            for (int i = 0; i < solucion.length; i++) {
                solucion[i] = calculoSegundoGrado(a, b, c)[i];
            }
        }

        return solucion;
    }

    public double primerGrado(double a, double b) {
        double resultado;

        resultado = a / b;

        return resultado;
    }

}