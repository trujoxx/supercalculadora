package com.trujillo;

import java.util.Scanner;

public class poligonos {
    static Scanner s = new Scanner(System.in);

    public double triangulo(double b, double a) {

        double area;

        area = (b * a) / 2;

        System.out.println("El area es de " + area);

        return area;
    }

    public double rectangulo(double b, double a) {

        double area;

        area = (b * a);

        System.out.println("El area es de " + area);

        return area;
    }

    public double circulo(double r) {

        double area;

        area = Math.PI * (r * r);

        System.out.println("El area es de " + area);

        return area;
    }

    public double pentagono(double l) {

        double area;

        area = (5 * l * (l / 2)) / 2;

        System.out.println("El area es de " + area);

        return area;

    
    }

    public double pitagoras(double c1, double c2){

        double h;

        h= Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2));

        System.out.println("La hipotenusa del triángulo es "+ h);

        return h;
    }

}
