package reto1;

import java.util.Scanner;

public class Boleteria {

    static double valorCompra;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Por favor introduzca el valor de su compra");
        valorCompra = sc.nextFloat();
        boletasPorCompra(valorCompra);
    }

    public static int boletasPorCompra(double valorCompra){
        int cantidadBoletas = 0;

        //condicional que compara el valor de compra y le  da un valor según su valor.

        if (valorCompra>=100000 && valorCompra<500000){
            cantidadBoletas=1;
        }else {
            if(valorCompra>=500000  && valorCompra<1000000){
                cantidadBoletas=3;
            }else{
                if(valorCompra>=1000000 && valorCompra<1200000){
                    cantidadBoletas=5;
                }else {
                    if (valorCompra>=1200000){
                        cantidadBoletas=8;
                    }
                }
            }
        }

        System.out.println(cantidadBoletas);

        return cantidadBoletas;
    }
}
