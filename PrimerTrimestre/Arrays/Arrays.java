package PrimerTrimestre.Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número (1-5) para decirte la edad de un jugador: ");
        int jugador = sc.nextInt();

        String nombre[] = {"Cristiano Ronaldo", "Leo Messi", "Erling Haaland", "Kylian Mbappe", "Neymar Jr"};
        // [] puede ir antes o despues de la variable
        int [] edades = new int [5];
        edades[0] = 39;
        edades[1] = 37;
        edades[2] = 24;
        edades[3] = 25;
        edades[4] = 32;
        System.out.println(nombre[jugador - 1] + " tiene " + edades[jugador - 1] + " años ");

    }
}
