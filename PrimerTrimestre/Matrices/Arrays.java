package PrimerTrimestre.Matrices;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número (1-5) para decirte la edad de un jugador: ");
        int jugador = sc.nextInt();

        String nombres[] = {"Cristiano Ronaldo", "Leo Messi", "Erling Haaland", "Kylian Mbappe", "Neymar Jr"};
        // [] puede ir antes o despues de la variable
        int[] edades = new int[5];
        edades[0] = 39;
        edades[1] = 37;
        edades[2] = 24;
        edades[3] = 25;
        edades[4] = 32;

        System.out.println(nombres[jugador - 1] + " tiene " + edades[jugador - 1] + " años ");

        int minimo = edades[0];
        for (int i = 0 ; i < edades.length; i++) {
            if (minimo>edades[i]) {
                minimo = edades[i];
            }
        }
        System.out.println("La edad minima de los jugadores es: " + minimo);

        System.out.println("Estas son las edades:");
        for (int edad : edades) {
            System.out.println(edad);
            if (edad < minimo) minimo = edad;
        }
        System.out.println("Esta es la edad minima: " + minimo);
        System.out.println();
        System.out.println("Estos son los nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }
}

