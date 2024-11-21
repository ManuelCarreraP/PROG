package PrimerTrimestre.Boletin7;
import java.util.Scanner;
import java.util.Random;

public class Boletin7 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        int[] numeros = new int[6];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50) + 1;
        }

        System.out.println("Array original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Array al revés:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 2");
        double maxima = 0;
        int contadorAprob = 0;
        int contadorSusp = 0;
        int contadorMedia = 0;
        double media = 0;
        double[] notas = {7.3, 5.8, 9.1, 3.4, 6.7, 8.2, 2.9, 4.5, 6.1, 1.2, 9.8, 0.5, 7.4, 3.8, 5.2, 8.9, 6.3, 6.7, 8.9, 2.3, 1.5, 8.6, 4.2, 9.3, 6.8, 7.1, 3.7, 5.6, 8.4, 0.9};
        //Aprobados y suspensos
        for (double AprobSusp : notas) {
            if (AprobSusp >= 5) contadorAprob++;
            if (AprobSusp < 5) contadorSusp++;
        }
        System.out.println("De 30 alumnos: " + contadorAprob + " han aprobado y " + contadorSusp + " han suspendido.");

        //Nota media
        for (double nota : notas) {
            contadorMedia++;
            media += nota;
        }
        System.out.println("La media es: " + media / contadorMedia);

        //Nota más alta
        for (double nota : notas) {
            if (nota > maxima) maxima = nota;
        }
        System.out.println("La nota más alta es: " + maxima);

        System.out.println();
        System.out.println("Ejercicio 3");
        String[] nombres = {"Saray", "Sofia", "Saul", "Anton", "Adriana", "Ivan F", "Daniel R", "Daniel F", "Karly", "Andrea", "Oscar", "Fernando", "Javier", "Jorge", "Piero", "Alexandre", "Ivan B", "Borja", "Manuel", "Carlos", "Fran", "Oliver", "Dima", "Jose", "Samuel", "Miguel", "Adrián M", "David", "Gael", "Adrián H"};

        Scanner scanner = new Scanner(System.in);

        // Buscar nota por nombre
        boolean encontrado = false;

        // Mostrar alumnos aprobados
        System.out.println("Lista de alumnos aprobados:");
        for (int i = 0; i < nombres.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(nombres[i] + " - " + notas[i]);
            }
        }

        // Ordenar notas en orden creciente usando algoritmo de burbuja
        double[] notasOrdenadas = notas.clone();
        for (int i = 0; i < notasOrdenadas.length - 1; i++) {
            for (int j = 0; j < notasOrdenadas.length - i - 1; j++) {
                if (notasOrdenadas[j] > notasOrdenadas[j + 1]) {
                    // Intercambio de valores
                    double temp = notasOrdenadas[j];
                    notasOrdenadas[j] = notasOrdenadas[j + 1];
                    notasOrdenadas[j + 1] = temp;
                }
            }
        }

        // Mostrar notas en orden creciente
        System.out.println("Notas en orden creciente:");
        for (double nota : notasOrdenadas) {
            System.out.println(nota);
        }

        // Buscar nota de un alumno ingresando su nombre
        System.out.print("Introduce el nombre del alumno para ver su nota: ");
        String nombreParaBuscar = scanner.nextLine();
        encontrado = false;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreParaBuscar)) {
                System.out.println("La nota de " + nombres[i] + " es: " + notas[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Alumno no encontrado.");
        }

        System.out.println();
        System.out.println("Ejercicio 4");
        System.out.print("Introduce tu DNI para saber su letra: ");
        int dni = scanner.nextInt();
        dni %= 23;
        String letras [] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",};
        for (int i = 0; i < letras.length; i++) {
            if (dni == i) {
                System.out.println("La letra correspondiente para el dni introducido es: " + letras[i]);
                break;
            }
        }

        System.out.println();
        System.out.println("Ejercicio 5");
        System.out.println("Introduce una lista de números a introducir");
        System.out.print("Introduce la cantidad de números que va a tener tu lista: ");
        int z = scanner.nextInt();
        int [] array  = new int[z];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce un numero para la posicion " + (i + 1) + " (Te quedan " + (array.length - i) + " números por introducir):");
            array[i] = scanner.nextInt();
        }
        System.out.print("Introduce el número a buscar en la lista: ");
        int x = scanner.nextInt();
        if (lista(array, x) == -1){
            System.out.println("El número introducido no se encuentra en la lista");
        } else System.out.println("El número " + x + " se encuentra en la posicion " + (lista(array, x) + 1));

        System.out.println();
        /*
        System.out.println("Ejercicio 6");
        System.out.print("Introduce la cantidad de números que va a tener tu lista: ");
        int k = scanner.nextInt();
        int [] matriz  = new int[k];
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Introduce un numero para la posicion " + (i + 1) + " (Te quedan " + (matriz.length - i) + " números por introducir):");
            matriz[i] = scanner.nextInt();
        }
        System.out.print("Introduce el número a buscar en la lista: ");
        int valor = scanner.nextInt();

        int resultado = buscar(matriz, valor);

        if (resultado == -1) {
            System.out.println("Valor no encontrado en la lista.");
        } else {
            System.out.println("Valor encontrado en la posicion: " + (resultado + 1));
        }
        */

        System.out.println();
        System.out.println("Ejercicio 7");
        System.out.println("Introduce una lista de números:");
        System.out.print("Introduce la cantidad de números que va a tener tu lista: ");
        int j = scanner.nextInt();
        int[] lista = new int[j];

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Introduce un número para la posición " + (i + 1) + " (Te quedan " + (lista.length - i) + " números por introducir): ");
            lista[i] = scanner.nextInt();
        }

        System.out.print("Introduce la posición inicial desde donde quieres cortar la lista: ");
        int inicio = scanner.nextInt();

        System.out.print("Introduce la posición final hasta donde quieres cortar la lista: ");
        int fin = scanner.nextInt();

        // Validamos las posiciones
        if (inicio < 0 || fin > lista.length || inicio >= fin) {
            System.out.println("Error: Las posiciones de inicio y fin son inválidas.");
        } else {
            int[] resultado = cortarLista(lista, inicio, fin);
            System.out.println("Lista cortada:");
            for (int num : resultado) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }

    //Funciones

    private static int lista(int [] array , int num) {
        int y = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                y = i;
                break;
            }
        }
        return y;
    }
    /*
    private static int buscar(int[] matriz, int valor) {
        int inicio = 0;
        int fin = matriz.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (matriz[medio] == valor) {
                return medio;
            } else if (matriz[medio] < valor) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }
    */
    private static int[] cortarLista(int[] lista, int inicio, int fin) {
        int[] mitad = new int[fin - inicio];
        for (int i = inicio, j = 0; i < fin; i++, j++) {
            mitad[j] = lista[i];
        }

        return mitad;
    }

}