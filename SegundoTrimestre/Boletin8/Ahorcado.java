package SegundoTrimestre.Boletin8;

import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego del ahorcado.");
        String palabra = "";
        do {
            System.out.print("Introduce la palabra a adivinar: ");
            palabra = scanner.nextLine().toLowerCase();
            palabra = palabra.replace(" ","");
            if (palabra.isEmpty() || palabra.length() < 2) {
                System.out.println("La palabra no puede estar vacía o debe tener al menos 2 caracteres. Inténtalo de nuevo.");
            }
        } while (palabra.isEmpty() || palabra.length() < 2);

        limpiarPantalla();

        jugarAhorcado(palabra, scanner);

        scanner.close();
    }

    private static void jugarAhorcado(String palabra, Scanner scanner) {
        String letrasAcertadas = "";
        String letrasFalladas = "";
        int intentosFallidos = 0;

        while (intentosFallidos <= 10 && !palabraAdivinada(palabra, letrasAcertadas)) {
            mostrarEstadoJuego(palabra, letrasAcertadas, letrasFalladas, intentosFallidos);

            System.out.print("Introduce una letra: ");
            String letra = scanner.nextLine().toLowerCase();

            if (letra.isEmpty() || letra.length() > 1 || !Character.isLetter(letra.charAt(0))) {
                System.out.println("Por favor, introduce una letra válida.");
                continue;
            }

            if (palabra.contains(letra)) {
                if (letrasAcertadas.contains(letra)) {
                    System.out.println("Ya has acertado esta letra.");
                } else {
                    letrasAcertadas += letra;
                }
            } else {
                if (letrasFalladas.contains(letra)) {
                    System.out.println("Ya has fallado esta letra.");
                } else {
                    letrasFalladas += letra;
                    intentosFallidos++;
                }
            }
        }

        mostrarEstadoJuego(palabra, letrasAcertadas, letrasFalladas, intentosFallidos);

        if (intentosFallidos > 10) {
            System.out.println("Has perdido. La palabra era: " + palabra);
        } else {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabra);
        }
    }

    private static boolean palabraAdivinada(String palabra, String letrasAcertadas) {
        for (char c : palabra.toCharArray()) {
            if (!letrasAcertadas.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    private static void mostrarEstadoJuego(String palabra, String letrasAcertadas, String letrasFalladas, int intentosFallidos) {
        System.out.println("\nPalabra: " + palabraOculta(palabra, letrasAcertadas));
        System.out.println("Letras falladas: " + letrasFalladas);
        mostrarAhorcado(intentosFallidos);
    }

    private static String palabraOculta(String palabra, String letrasAcertadas) {
        String oculta = "";
        for (char c : palabra.toCharArray()) {
            if (letrasAcertadas.contains(String.valueOf(c))) {
                oculta += c;
            } else {
                oculta += "_";
            }
        }
        return oculta;
    }

    private static void mostrarAhorcado(int intentosFallidos) {
        String[] estados = {
                "",
                "\n\n\n\n\n\n\n-------",
                "   |\n   |\n   |\n   |\n   |\n   |\n-------",
                "   _________\n   |\n   |\n   |\n   |\n   |\n-------",
                "   _________\n   |/     \n   |\n   |\n   |\n   |\n-------",
                "   _________\n   |/     |\n   |      \n   |\n   |\n   |\n-------",
                "   _________\n   |/     |\n   |      o\n   |\n   |\n   |\n-------",
                "   _________\n   |/     |\n   |      o\n   |      |\n   |\n   |\n-------",
                "   _________\n   |/     |\n   |      o\n   |     /|\n   |\n   |\n-------",
                "   _________\n   |/     |\n   |      o\n   |     /|\\\n   |\n   |\n-------",
                "   _________\n   |/     |\n   |      o\n   |     /|\\\n   |     / \n   |\n-------",
                "   _________\n   |/     |\n   |      o\n   |     /|\\\n   |     / \\\n   |\n-------"
        };

        if (intentosFallidos >= 0 && intentosFallidos < estados.length) {
            System.out.println(estados[intentosFallidos]);
        } else {
            System.out.println("Error: Número de intentos fallidos fuera de rango.");
        }
    }

    private static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}





