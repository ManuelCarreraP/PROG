package SegundoTrimestre.POO.Calendario;

import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    private Data(int dia, int mes, int ano) {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    private int getDia() {
        return dia;
    }

    private void setDia(int dia) {
        this.dia = dia;
    }

    private int getMes() {
        return mes;
    }

    private void setMes(int mes) {
        this.mes = mes;
    }

    private int getAno() {
        return ano;
    }

    private void setAno(int ano) {
        this.ano = ano;
    }

    private void incrementarDia() {
        if (++this.dia > diasNoMes()) {
            this.setDia(1);
            incrementarMes();
        }
    }

    private void incrementarMes() {
        if (++this.mes > 12) {
            this.setMes(1);
            incrementarAno();
        }
    }

    private void incrementarAno() {
        this.setAno(this.ano + 1);
    }

    private int diasNoMes() {
        switch (mes) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return (esBisiesto() ? 29 : 28);
            default:
                return 31;
        }
    }

    private boolean esBisiesto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private String mostrarData() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    private boolean dataIgual(Data outraData) {
        return this.dia == outraData.getDia() && this.mes == outraData.getMes() && this.ano == outraData.getAno();
    }

    // Funciones para mejorar el MAIN

    private static void mostrarFechaActual(Data data) {
        System.out.println("Fecha actual: " + data.mostrarData());
    }

    private static void incrementarFecha(Data data, Scanner scanner) {
        System.out.print("Desea incrementar el día? (+1) (s/n): ");
        if (scanner.next().equalsIgnoreCase("s")) {
            data.incrementarDia();
        }

        System.out.print("Desea incrementar el mes? (+1) (s/n): ");
        if (scanner.next().equalsIgnoreCase("s")) {
            data.incrementarMes();
        }

        System.out.print("Desea incrementar el año? (+1) (s/n): ");
        if (scanner.next().equalsIgnoreCase("s")) {
            data.incrementarAno();
        }
    }

    private static void mostrarFechaActualizada(Data data) {
        System.out.println("Fecha actualizada: " + data.mostrarData());
    }

    private static void compararFechas(Data data, Scanner scanner) {
        System.out.println("Ingrese una fecha para comparar: ");
        System.out.print("Introduzca el día: ");
        int dia = scanner.nextInt();
        System.out.print("Introduzca el mes: ");
        int mes = scanner.nextInt();
        System.out.print("Introduzca el año: ");
        int ano = scanner.nextInt();
        Data otraData = new Data(dia, mes, ano);

        if (data.dataIgual(otraData)) {
            System.out.println("Las fechas son iguales.");
        } else {
            System.out.println("Las fechas son diferentes.");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data(27, 2, 2034);

        mostrarFechaActual(data);
        incrementarFecha(data, scanner);
        mostrarFechaActualizada(data);
        compararFechas(data, scanner);

        scanner.close();
    }

}




