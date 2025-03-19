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
        while (segundosMas >= 60){
            minuto += 1;
            segundosMas -= 60;
        }

        while (segundo + segundosMas >= 60) {
                segundo = segundo + segundosMas - 60;
                minuto++;
        }
        while (minuto >= 60) {
                minuto -= 60;
                hora++;
        }

        System.out.println("La hora actual es: "+hora+":"+minuto+":"+segundo);
        /*
        int total = 3600 * hora + 60 * minuto + segundo + segundosMas;
        int totalH = (total / 3600) % 24;
        int totalM = (total % 3600) / 60;
        int totalS = (total % 3600) % 60;
        System.out.println("La hora actual es: "+totalH+":"+totalM+":"+totalS);
        */
    }
}
