package Boletin4;

import java.util.Scanner;

public class Boletin4 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de productos vendidos anualmente para clasificarlos: ");
        int productos = sc.nextInt();

        if (productos <= 100) {
            System.out.println("Consumo bajo");
        } else if (productos > 100 && productos <= 500) {
            System.out.println("Consumo medio");
        } else if (productos > 500 && productos <= 1000) {
            System.out.println("Consumo alto");
        } else if (productos > 1000) {
            System.out.println("Consumo de primera necesidad");
        }

        System.out.println();
        System.out.println("Ejercicio 2");
        System.out.println("1 - Cuadrado");
        System.out.println("2 - Triangulo");
        System.out.println("3 - Circulo");
        System.out.print("Introduce el número de la figura para calcular su superficie: ");
        int figura = sc.nextInt();

        switch (figura) {
            case 1:
                System.out.print("Introduce la longitud del lado: ");
                double lado = sc.nextDouble();
                lado = lado * lado;
                System.out.println("El área del cuadrado es: " + lado);
                break;
            case 2:
                System.out.println("Introduce el altura del triangulo");
                double altura = sc.nextDouble();
                System.out.print("Introduce la base del triangulo: ");
                double base = sc.nextDouble();
                double areaT = base * altura / 2;
                System.out.println("El área del triangulo es: " + areaT);
                break;
            case 3:
                System.out.print("Introduce el radio del circulo: ");
                double radio = sc.nextDouble();
                radio = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del circulo es: " + radio);
                break;
            default:
                System.out.println("El número introducido no pertenece a ninguna figura");
                break;
        }

        System.out.println();
        System.out.println("Ejercicio 3");
        System.out.print("Ingresa un número para saber su valor absoluto: ");
        double numero3 = sc.nextDouble();
        double valorAbsoluto = (numero3 < 0) ? - numero3 : numero3;

        System.out.println("El valor absoluto de " + numero3 + " es: " + valorAbsoluto);


        System.out.println();
        System.out.println("Ejercicio 4");
        System.out.print("Introduce un número (0-99): ");
        int numero4 = sc.nextInt();

        if (numero4 < 0 || numero4 > 99) {
            System.out.println("El número debe estar entre 0 y 99.");
        } else {
            String valor = "";
            int decenas = numero4 / 10; // Extraer decenas
            int unidades = numero4 % 10; // Extraer unidades

            switch (decenas) {
                case 0 -> valor += "";
                case 1 -> valor += (unidades == 0) ? "diez" : "diez y ";
                case 2 -> valor += "veinte";
                case 3 -> valor += "treinta";
                case 4 -> valor += "cuarenta";
                case 5 -> valor += "cincuenta";
                case 6 -> valor += "sesenta";
                case 7 -> valor += "setenta";
                case 8 -> valor += "ochenta";
                case 9 -> valor += "noventa";
            }

            if (decenas > 1 && unidades > 0) {
                valor += " y ";
            }
            switch (unidades) {
                case 1 -> valor += "uno";
                case 2 -> valor += "dos";
                case 3 -> valor += "tres";
                case 4 -> valor += "cuatro";
                case 5 -> valor += "cinco";
                case 6 -> valor += "seis";
                case 7 -> valor += "siete";
                case 8 -> valor += "ocho";
                case 9 -> valor += "nueve";
            }

            System.out.println("El número " + numero4 + " es: " + valor);
        }

        System.out.println();
        System.out.println("Ejercicio 5");
        System.out.print("Introduce los números de tu DNI para averiguar la letra: ");
        int nDNI = sc.nextInt();
        nDNI = nDNI % 23;
        switch (nDNI) {
            case 0 -> System.out.println("La letra de tu DNI es la \"T\"");
            case 1 -> System.out.println("La letra de tu DNI es la \"R\"");
            case 2 -> System.out.println("La letra de tu DNI es la \"W\"");
            case 3 -> System.out.println("La letra de tu DNI es la \"A\"");
            case 4 -> System.out.println("La letra de tu DNI es la \"G\"");
            case 5 -> System.out.println("La letra de tu DNI es la \"M\"");
            case 6 -> System.out.println("La letra de tu DNI es la \"Y\"");
            case 7 -> System.out.println("La letra de tu DNI es la \"F\"");
            case 8 -> System.out.println("La letra de tu DNI es la \"P\"");
            case 9 -> System.out.println("La letra de tu DNI es la \"D\"");
            case 10 -> System.out.println("La letra de tu DNI es la \"X\"");
            case 11 -> System.out.println("La letra de tu DNI es la \"B\"");
            case 12 -> System.out.println("La letra de tu DNI es la \"N\"");
            case 13 -> System.out.println("La letra de tu DNI es la \"J\"");
            case 14 -> System.out.println("La letra de tu DNI es la \"Z\"");
            case 15 -> System.out.println("La letra de tu DNI es la \"S\"");
            case 16 -> System.out.println("La letra de tu DNI es la \"Q\"");
            case 17 -> System.out.println("La letra de tu DNI es la \"V\"");
            case 18 -> System.out.println("La letra de tu DNI es la \"H\"");
            case 19 -> System.out.println("La letra de tu DNI es la \"L\"");
            case 20 -> System.out.println("La letra de tu DNI es la \"C\"");
            case 21 -> System.out.println("La letra de tu DNI es la \"K\"");
            case 22 -> System.out.println("La letra de tu DNI es la \"E\"");
        }

        sc.close();
    }
}
