package com.trujillo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        aritmetica aritmetica = new aritmetica();
        poligonos poligonos = new poligonos();
        ecuacion ecuacion = new ecuacion();

        Scanner s = new Scanner(System.in);
        boolean volver = false;
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("1.Área de polígonos regulares y teorema de Pitágoras");
            System.out.println("2.Operaciones aritméticas");
            System.out.println("3.Equación de 1º y 2º grado y grado superior 2 a Ruffini");
            System.out.println("0. Salir");

            System.out.println("Introduce una opción: ");
            opcion = s.nextInt();
            volver = false;
            switch (opcion) {

                case 1:
                    volver = false;
                    while (!volver) {
                        System.out.println("1.Triángulo");
                        System.out.println("2.Circulo");
                        System.out.println("3.Pentágono");
                        System.out.println("4.Rectángulo");
                        System.out.println("5.Pitágoras");
                        System.out.println("0.Volver");
                        System.out.println("Escoge una operación:");
                        opcion = s.nextInt();

                        switch (opcion) {
                            case 1:
                                poligonos.triangulo(4, 2);
                                break;
                            case 2:
                                poligonos.circulo(5);
                                break;
                            case 3:
                                poligonos.pentagono(5);
                                break;
                            case 4:
                                poligonos.rectangulo(3, 2);
                                break;
                            case 5:
                                poligonos.pitagoras(5, 6);
                                break;
                            case 0:
                                volver = true;
                                break;
                        }
                    }

                    break;
                case 2:
                    volver = false;

                    while (!volver) {
                        System.out.println("1.Sumar");
                        System.out.println("2.Restar");
                        System.out.println("3.División");
                        System.out.println("4.Multiplicación");
                        System.out.println("5.Logaritmo");
                        System.out.println("6.Raiz Cuadrada");
                        System.out.println("7.Exponente");
                        System.out.println("0.Volver");
                        System.out.println("Escoge una operación:");
                        opcion = s.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println(aritmetica.suma(2, 4));
                                break;
                            case 2:
                                System.out.println(aritmetica.resta(2, 4));
                                break;
                            case 3:
                                System.out.println(aritmetica.division(2, 4));
                                break;
                            case 4:
                                System.out.println(aritmetica.multiplicacion(2, 4));
                                break;
                            case 5:
                                System.out.println(aritmetica.logaritmo(4));
                                break;
                            case 6:
                                System.out.println(aritmetica.raiz(4));
                                break;
                            case 7:
                                System.out.println(aritmetica.exponente(2, 4));
                                break;
                            case 0:
                                volver = true;
                            default:
                        }
                    }

                    break;
                case 3:
                    volver = false;
                    while (!volver) {
                        System.out.println("1.Ecuación de primer grado");
                        System.out.println("2.Ecuación de segundo grado");
                        System.out.println("0.Volver");
                        System.out.println("Escoge una operación:");
                        opcion = s.nextInt();
                        switch (opcion) {
                            case 1:
                                ecuacion.primerGrado(5, 2);
                                break;
                            case 2:
                                System.out.println(ecuacion.segundoGrado(1, 8, 12));
                                break;
                            case 0:
                                volver = true;
                        }
                    }
                case 0:
                    salir = true;
            }

        }
    }
}
