package com.trujillo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while(!salir){
            System.out.println("1.Área de polígonos regulares y teorema de Pitágoras");
            System.out.println("2.Operaciones aritméticas");
            System.out.println("3.Equación de 1º y 2º grado y grado superior 2 a Ruffini");
            System.out.println("0. Salir");

            System.out.println("Introduce una opción: ");
            opcion = s.nextInt();

            switch (opcion){
                case 1:
                System.out.println("1.Triángulo");
                System.out.println("2.Circulo");
                System.out.println("3.Pentágono");
                System.out.println("4.Rectángulo");
                System.out.println("Escoge una operación:");
                opcion = s.nextInt();
                    switch(opcion){
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
                        default:
                    }
                break;
                case 2:

                case 0:
                salir = true;
            }

        } 
    }
}
