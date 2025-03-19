package Examen;

import java.util.Scanner;

public class Examen2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] libros = new String[20];
        int libro;

        do {
            System.out.println("1 - Salir");
            System.out.println("2 - Engadir un libro");
            System.out.println("3 - Visualizar os libros");
            System.out.println("4 - Eliminar un libro");
            System.out.print("Selecciona una acción: ");
            libro = scanner.nextInt();

            if (libro == 2) {
                if(engadirLibro(libros) == true) {
                    System.out.println("Operacion exitosa");
                }else System.out.println("Operacion erronea");

            } else if (libro == 3) {
                visualizarLibros(libros);

            } else if (libro == 4) {
                if(eliminarLibros(libros) == true) {
                    System.out.println("Operacion exitosa");
                }else System.out.println("Operacion erronea");

            } else if (libro == 1) {
                System.out.println("Saliendo");
            } else {
                System.out.print("Opcion no valida, vuelva a introducir un número del menú: ");
                libro = scanner.nextInt();
            }
        } while (libro != 1);

    }

    public static boolean engadirLibro(String [] libros) {
        Scanner scanner = new Scanner(System.in);
        boolean resultado = false;
        System.out.println("Introduce el libro a añadir:");
        String libroA = scanner.nextLine();
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = libroA;
                resultado = true;
                break;
            }
        }
        return resultado;

    }
    public static boolean eliminarLibros(String [] libros) {
        Scanner scanner = new Scanner(System.in);
        boolean resultado = false;
        System.out.println("Introduce el indice del libro a eliminar");
        int libroE = scanner.nextInt();
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == libros[libroE]) {
                libros[i] = null;
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    public static void visualizarLibros(String [] libros) {
        for (int i = 0; i <= libros.length; i++) {
            if (libros[i] != null) {
                System.out.println("El libro es " + libros[i] + " (posicion " + i + ")");
            } else{
                System.out.println("Baleiro");
                break;
            }
        }
    }
}
