package com.trujillo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean salir = false;
        boolean volver = false;
        int opcion;

        while (!salir) {
            System.out.println("1.Área de polígonos regulares y teorema de Pitágoras");
            System.out.println("2.Operaciones aritméticas");
            System.out.println("3.Equación de 1º y 2º grado y grado superior 2 a Ruffini");
            System.out.println("0. Salir");

            System.out.println("Introduce una opción: ");
            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1.Triángulo");
                    System.out.println("2.Circulo");
                    System.out.println("3.Pentágono");
                    System.out.println("4.Rectángulo");
                    System.out.println("5.Pitágoras");
                    System.out.println("0.Volver");
                    System.out.println("Escoge una operación:");
                    opcion = s.nextInt();

                    while (!volver) {
                        switch (opcion) {
                            case 1:
                                poligonos.triangulo();
                                break;
                            case 2:
                                poligonos.circulo();
                                break;
                            case 3:
                                poligonos.pentagono();
                                break;
                            case 4:
                                poligonos.rectangulo();
                                break;
                            case 5:
                                poligonos.pitagoras();
                                break;
                            case 0:
                                volver = true;
                            default:
                        }
                    }

                    break;
                case 2:
                    System.out.println("1.Sumar");
                    System.out.println("2.Restar");
                    System.out.println("3.División");
                    System.out.println("4.Multiplicación");
                    System.out.println("0.Volver");
                    System.out.println("Escoge una operación:");
                    opcion = s.nextInt();

                    while (!volver) {
                        switch (opcion) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 0:
                                volver = true;
                            default:
                        }
                    }

                    break;
                case 0:
                    salir = true;
            }

        }
    }
}
