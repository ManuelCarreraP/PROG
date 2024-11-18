package Examen;

import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora;
        int minuto;

        int segundo;
        int segundosMas;
        System.out.print("Introduce las horas: ");
        hora = sc.nextInt();
        System.out.print("Introduce las minutos: ");
        minuto = sc.nextInt();
        System.out.print("Introduce las segundos: ");
        segundo = sc.nextInt();
        System.out.print("Introduce las segundos que le quieres añadir a la hora ("+hora+":"+minuto+":"+segundo+"): ");
        segundosMas = sc.nextInt();

        if (segundosMas >= 60) {
          minuto = minuto + 1;
          segundosMas = segundosMas - 60;
        }

        if (segundo + segundosMas >= 60) {
                segundo = segundo + segundosMas - 60;
                minuto++;
        }
        if (minuto >= 60) {
                minuto -= 60;
                hora++;
        }

        System.out.println("La hora actual es: "+hora+":"+minuto+":"+segundo);
    }
}
