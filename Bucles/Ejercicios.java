package Bucles;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        System.out.println("Mostrar los multiplos de 7 menores que 100");
        for (int i = 0; i < 100; i++){ //Recorre todos los números desde el 0 hasta el 100
            if (i % 7 == 0){ //Comprueba que el número cuando se divide entre 7 el resto es igual a 0, por lo cual es divisible
                System.out.println(i); //Lo muestra por pantalla
            }
        }

        System.out.println();
        System.out.print("Introduce un número para saber sus números primos: ");
        Scanner ej = new Scanner(System.in); //Se declara el escaner para recoger valores por consola
        int n = ej.nextInt(); //Recoge en la consola un número introducido por el usuario
        System.out.println("Los números primos entre 1 y " + n + " son:");
        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;

            // Verificar si i es primo dividiendo por todos los números menores o iguales a su raíz cuadrada
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) { // Si i es divisible por j
                    esPrimo = false; // No es primo
                    break; // Salir del bucle
                }
            }

            // Si es primo, lo mostramos
            if (esPrimo) {
                System.out.println(i);
            }
        }


        //Usando While
        System.out.println();
        System.out.println("Introduzca las notas para calcular la media");
        double nota = ej.nextDouble();
        double media = 0;          //Se declaran las variables
        int contador = 0;

        while (nota != -1) {
            media += nota; //Se suman las notas y se almacenan en la variable media
            contador++;  //Cuenta el numero de notas
            System.out.println("Introduzca las notas para calcular la media (Introduzca -1 para salir)");
            nota = ej.nextDouble(); //Vuelve a preguntar si se quieren añadir mas notas, sino se introduce -1 para salir
        }
        media /= contador;  //Se divide el resultado de la media con el número de notas introducidas
        System.out.println("La media de las notas es " + media);



        //Lo repetimos con Do While
        System.out.println();

        double nota2;
        double media2 = 0;          //Se declaran las variables
        int contador2 = 0;

        do{
            System.out.println("Introduzca las notas para calcular la media (Introduzca -1 para salir)");
            nota2 = ej.nextDouble();

            if (nota2 != -1) {
                media2 += nota2; //Se suman las notas y se almacenan en la variable media
                contador2++;  //Cuenta el numero de notas
            }

        } while (nota2 != -1);

        media2 /= contador2;  //Se divide el resultado de la media con el número de notas introducidas
        System.out.println("La media de las notas es " + media2);

        ej.close();

    }
}
