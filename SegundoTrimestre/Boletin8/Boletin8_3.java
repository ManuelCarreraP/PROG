package SegundoTrimestre.Boletin8;

import java.util.Scanner;

public class Boletin8_3 {

    public static void main(String[] args) {
        System.out.println("· Ejercicio 1");
        Ejercicio1();
        System.out.println("· Ejercicio 2");
        Ejercicio2();

    }
    public static void Ejercicio1 (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca una palabra para dividirla en secuencias: ");
        String palabra = scanner.nextLine();
        if (palabra.isEmpty() || palabra == null){
            System.out.println("Introduce una palabra valida.");
            Ejercicio1();
        } else {
            System.out.print("Introduzca el número de secuencias: ");
            int n = scanner.nextInt();
            String[] secuencias = dividirEnSecuencias(palabra, n);
            System.out.println("Secuencias generadas:");
            for (String secuencia : secuencias) {
                System.out.println(secuencia);
            }
        }


    }
    public static String[] dividirEnSecuencias(String palabra, int n) {
        if (n <= 0 || n > palabra.length()) {
            System.out.println("El tamaño de la secuencia debe ser mayor que 0 y menor o igual que la longitud de la palabra.");
            Ejercicio1();
        }

        int totalSecuencias = palabra.length() - n + 1;
        String[] secuencias = new String[totalSecuencias];

        for (int i = 0; i < totalSecuencias; i++) {
            secuencias[i] = palabra.substring(i, i + n);
        }

        return secuencias;
    }
    public static void Ejercicio2(){
        String textoEntrada = "Este es el título\nEste es el contenido de la página web, esta pagina trata sobre como dividir el titulo y su contenido.";
        String [] partes = textoEntrada.split("\n", 2);

        if (partes.length > 0) {
            partes[0] = partes[0].toUpperCase();
        }
        if (partes.length > 1) {
            partes[1] = partes[1].toLowerCase();
        }
        System.out.println("Resultado: ");

        for (String parte : partes) {
            System.out.println(parte);
        }
    }


}
