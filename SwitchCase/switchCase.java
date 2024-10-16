package SwitchCase;

import java.util.Scanner;

public class switchCase {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce la nota (del 0 al 10):");
            int nota = scanner.nextInt();

            switch (nota) {
                case 0:
                    System.out.println("\uD83D\uDC80"); break;
                case 1: //case 1, 2, 3, 4 -> System.out.printf("Suspenso"); Si se hace esto se tiene que hacer en el switch al completo, no se puede mezclar
                    System.out.println("El nombre y ya"); break;
                case 2:
                    System.out.println("A la recuperación de cabeza"); break;
                case 3:
                    System.out.println("Te da para media"); break;
                case 4:
                    System.out.println("Insuficiente"); break;
                case 5:
                    System.out.println("Suficiente"); break;
                case 6:
                    System.out.println("Bien"); break;
                case 7:
                    System.out.println("Notable bajo"); break;
                case 8:
                    System.out.println("Notable"); break;
                case 9:
                    System.out.println("Sobresaliente bajo"); break;
                case 10:
                    System.out.println("Sobresaliente"); break;
                default:
                    System.out.println("Nota no válida. Debe ser un número entre 0 y 10."); break;
            }

            System.out.println();
            System.out.println("Número de 0 al 99 pasado a letras");
            System.out.print("Introduce el primer número del valor (0-9): ");
            int numero = scanner.nextInt();

            System.out.print("Tu número tiene segundo valor (0-9)? (introduce un número o -1 para no): ");
            int numero2 = scanner.nextInt();

            String valor1 = "";
            String valor2 = "";
            if (numero < 0 || numero > 9) {
                System.out.println("El primer número debe estar entre 0 y 9.");
            } else {

                valor1 = switch (numero) {
                    case 0 -> "cero";
                    case 1 -> "uno";
                    case 2 -> "veinte";
                    case 3 -> "treinta";
                    case 4 -> "cuarenta";
                    case 5 -> "cincuenta";
                    case 6 -> "sesenta";
                    case 7 -> "setenta";
                    case 8 -> "ochenta";
                    case 9 -> "noventa";
                    default -> "";
                };
            }

            if (numero2 != -1) {
                if (numero2 < 0 || numero2 > 9) {
                    System.out.println("El segundo número debe estar entre 0 y 9 o -1 para no.");
                } else {
                    valor2 = switch (numero2) {
                        case 0 -> "cero";
                        case 1 -> "uno";
                        case 2 -> "dos";
                        case 3 -> "tres";
                        case 4 -> "cuatro";
                        case 5 -> "cinco";
                        case 6 -> "seis";
                        case 7 -> "siete";
                        case 8 -> "ocho";
                        case 9 -> "nueve";
                        default -> "";
                    };
                }
            }

            System.out.print("El número " + numero + (numero2 != -1 ? + numero2 : "") + " es: " + valor1);
            if (!valor2.isEmpty()) {
                System.out.print(" y " + valor2);
            }
            }

        }



