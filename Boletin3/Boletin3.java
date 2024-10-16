package Boletin3;

import java.util.Scanner;

public class Boletin3 {
    public static void main(String[] args) {
        Scanner boletin3 = new Scanner(System.in);
        System.out.println("Ejercicio1");
        System.out.println("Introduzca el número para saber si es positivo.");

        int num = boletin3.nextInt();
        if (num >= 0) {
            System.out.println(num + " es positivo");
        } else
            System.out.println(num + " es negativo");


        System.out.println();
        System.out.println("Ejercicio2");
        System.out.println("Introduce el primer número");
        short num2_1 = boletin3.nextShort();
        System.out.println("Introduce el segundo número");
        short num2_2 = boletin3.nextShort();
        if (num2_1 >= num2_2) {
            System.out.println("La resta de " + num2_1 + " - " + num2_2 + " = " + (num2_1 - num2_2));
        } else
            System.out.println("La suma de " + num2_1 + " + " + num2_2 + " = " + (num2_1 + num2_2));

        System.out.println();
        System.out.println("Ejercicio3");
        System.out.println("Introduce un número cualquiera");
        int num3 = boletin3.nextInt();

        if (num3 > 0) {
            System.out.println(num3 + " es positivo");
        } else if (num3 < 0) {
            System.out.println(num3 + " es negativo");
        } else {
            System.out.println(num3 + " es 0");
        }
        boletin3.close();


        System.out.println();
        System.out.println("Ejercicio4");
        String nombre1 = "Manuel Carrera Pazó";
        double peso1 = 67.64;
        String nombre2 = "Borja de Saá Vazquez";
        double peso2 = 54.71;

        if (peso1 > peso2) {
            double redondeo = Math.round(peso1-peso2);
            System.out.println(nombre1 + " pesa más que " + nombre2 + " con una diferencia de " + redondeo);
        } else if (peso2 > peso1) {
            double redondeo = Math.round(peso2-peso1);
            System.out.println(nombre2 + " pesa más que " + nombre1 + " con una diferencia de " + redondeo);
        }

        System.out.println();
        System.out.println("Ejercicio5");
        int num5_1 = 7;
        int num5_2 = 14;
        int num5_3 = 9;

        if (num5_1 > num5_2 && num5_1 > num5_3) {
            System.out.println("El número mayor entre " + num5_1 + ", " + num5_2 + " y "  + num5_3 + " es: " + num5_1);
        } else if (num5_2 > num5_1 && num5_2 > num5_3) {
            System.out.println("El número mayor entre " + num5_1 + ", " + num5_2 + " y " + num5_3 + " es: " + num5_2);
        } else if (num5_3 > num5_1 && num5_3 > num5_2){
            System.out.println("El número mayor entre " + num5_1 + ", " + num5_2 + " y " + num5_3 + " es: " + num5_3);
        }

    }

}


