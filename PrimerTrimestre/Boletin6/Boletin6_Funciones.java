package PrimerTrimestre.Boletin6;

import java.util.Scanner;

public class Boletin6_Funciones {

        // Ejercicio 1: Mostrar todos los números comprendidos entre dos enteros
        public static void mostrarNumerosEntre(int num1, int num2) {
            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            for (int i = num1 + 1; i < num2; i++) {
                System.out.println(i);
            }
        }

        // Ejercicio 2: Mostrar "Ecoo..." n veces
        public static void eco(int n) {
            for (int i = 0; i < n; i++) {
                System.out.println("Ecoo...");
            }
        }

        // Ejercicio 3: Calcular área o volumen de un cubo
        public static void areaOvolumenCubo(int opcion, double lado) {
            if (opcion == 1) {
                double area = 6 * lado * lado;
                System.out.println("El área del cubo es: " + area);
            } else if (opcion == 2) {
                double volumen = lado * lado * lado;
                System.out.println("El volumen del cubo es: " + volumen);
            } else {
                System.out.println("Opción no válida. Use 1 para área y 2 para volumen.");
            }
        }

        // Ejercicio 4: Convertir días, horas y minutos a segundos
        public static int convertirASegundos(int dias, int horas, int minutos) {
            int segundos = (dias * 24 * 3600) + (horas * 3600) + (minutos * 60);
            return segundos;
        }

        // Ejercicio 5: Diferencia en minutos entre dos instantes de tiempo
        public static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
            int totalMin1 = (hora1 * 60) + minuto1;
            int totalMin2 = (hora2 * 60) + minuto2;
            return Math.abs(totalMin2 - totalMin1);
        }

        // Ejercicio 6: Comprobar si dos números son amigos
        public static boolean sonAmigos(int a, int b) {
            return (sumaDivisoresPropios(a) == b) && (sumaDivisoresPropios(b) == a);
        }

        // Función auxiliar para calcular la suma de divisores propios
        private static int sumaDivisoresPropios(int num) {
            int suma = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    suma += i;
                }
            }
            return suma;
        }

        public static void main(String[] args) {
            // Pruebas de los ejercicios

            // Ejercicio 1
            System.out.println("Ejercicio 1:");
            mostrarNumerosEntre(3, 10);

            // Ejercicio 2
            System.out.println("Ejercicio 2:");
            eco(5);

            // Ejercicio 3
            System.out.println("Ejercicio 3:");
            areaOvolumenCubo(1, 3.0);  // Área de un cubo con lado 3
            areaOvolumenCubo(2, 3.0);  // Volumen de un cubo con lado 3

            // Ejercicio 4
            System.out.println("Ejercicio 4:");
            System.out.println("Segundos totales: " + convertirASegundos(1, 1, 1));

            // Ejercicio 5
            System.out.println("Ejercicio 5:");
            System.out.println("Diferencia en minutos: " + diferenciaMin(10, 30, 12, 45));

            // Ejercicio 6
            System.out.println("Ejercicio 6:");
            System.out.println("¿Son amigos 220 y 284? " + sonAmigos(220, 284));
        }
    }



