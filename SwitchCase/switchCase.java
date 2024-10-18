package SwitchCase;
import java.util.Scanner;

public class switchCase {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); //Inicialización del escaner

            /*
            Programa que solicita al usuario un número para decir si el alumno esta suspenso o aprobado (con su nota correspondiente)
             */
            System.out.print("Introduce la nota (del 0 al 10): ");
            int nota = scanner.nextInt();

            //Se compara la variable introducida por el usuario con el número de los case
            switch (nota) {
                case 0:
                    System.out.println("\uD83D\uDC80"); break;
                case 1: //Otra opcion: case 1, 2, 3, 4 -> System.out.printf("Suspenso"); Si se hace esto se tiene que hacer en el switch al completo, no se puede mezclar
                    System.out.println("Pusiste el nombre y ya"); break;
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

            /*
            Programa que depues de solicitar un número a un usuario te lo pasa a formato letra
             */
            System.out.println();
            System.out.println("Número de 0 al 99 pasado a letras");

            // Solicitar el número
            System.out.print("Introduce un número (0-99): ");
            int numero = scanner.nextInt();

            if (numero < 0 || numero > 99) {
                System.out.println("El número debe estar entre 0 y 99.");
            } else {
                String valor = "";
                int decenas = numero / 10; // Extraer decenas
                int unidades = numero % 10; // Extraer unidades

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

                System.out.println("El número " + numero + " es: " + valor);
            }

            scanner.close();
            }

        }



