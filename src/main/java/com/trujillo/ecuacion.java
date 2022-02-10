package com.trujillo;

import java.util.Scanner;

public class ecuacion {

    static Scanner leer = new Scanner(System.in);

    public static double[] calculoSegundoGrado() {
        double a, b, c, discriminante;
        double[] solucion = new double[2];

        System.out.println("Indique el valor de a:");
        a = leer.nextDouble();
        System.out.println("Indique el valor de b:");
        b = leer.nextDouble();
        System.out.println("Indique el valor de c:");
        c = leer.nextDouble();

        discriminante = Math.pow(b, 2) - 4 * a * c;

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

    public static String segundoGrado() {
        String mensaje = "";
        if (calculoSegundoGrado() == null) {
            mensaje = "No tiene solución";
        } else {
            for (double resultado : calculoSegundoGrado()) {
                mensaje = "La solución: " + resultado;
            }
        }

        return mensaje;
    }

    public static void primerGrado() {
        double a, b, resultado;
        System.out.println("Indique el valor de a");
        a = leer.nextDouble();
        System.out.println("Indique el valor de b");
        b = leer.nextDouble();

        resultado = a / b;

        System.out.println("El valor de x en la ecuación es " + resultado);
    }

}