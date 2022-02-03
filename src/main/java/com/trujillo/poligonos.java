package com.trujillo;

import java.util.Scanner;

public class poligonos {
    static Scanner s = new Scanner(System.in);

    public static double triangulo() {

        double area;
        double b;
        double a;

        System.out.println("Introduce la base: ");
        b = s.nextDouble();

        System.out.println("Introduce la altura: ");
        a = s.nextDouble();

        area = (b * a) / 2;

        System.out.println("El area es de " + area);

        return area;
    }

    public static double rectangulo() {

        double area;
        double b;
        double a;

        System.out.println("Introduce la base: ");
        b = s.nextDouble();

        System.out.println("Introduce la altura: ");
        a = s.nextDouble();

        area = (b * a);

        System.out.println("El area es de " + area);

        return area;
    }

    public static double circulo() {

        double area;
        double r;

        System.out.println("Introduce el radio: ");
        r = s.nextDouble();

        area = Math.PI * (r * r);

        System.out.println("El area es de " + area);

        return area;
    }

    public static double pentagono() {

        double area;
        double l;

        System.out.println("Introduce la cantidad de lados: ");
        l = s.nextDouble();

        area = (5 * l * (l / 2)) / 2;

        System.out.println("El area es de " + area);

        return area;

    
    }

    public static double pitagoras(){

        double c1,c2,h;

        c1= s.nextDouble();
        c2= s.nextDouble();

        h= Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2));

        System.out.println("La hipotenusa del triángulo es "+ h);

        return h;
    }

}
