package reto2;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese base");
        double base = sc.nextFloat();

        System.out.println("Ingrese altura");
        double altura = sc.nextFloat();

        Triangulo triangulo = new Triangulo(base, altura);
        triangulo.calculoArea();
        System.out.println(triangulo.toString());
    }
}
