package Boletin2;

import java.util.Scanner;

public class Boletin2 {
    public static void main(String[] args) {
        Scanner boletin2 = new Scanner(System.in);
        System.out.println("· Boletin 2_1");
        int baseT = 4;
        int alturaT = 3;
        int areaT = baseT*alturaT/2;

        System.out.println("El área del triangulo es = " + areaT);
        System.out.println();

        System.out.println("· Boletin 2_2");
        int ladoC = 3;
        int areaC = ladoC*ladoC;
        System.out.println("El área del cuadrado es = " + areaC);

        System.out.println();
        System.out.println("· Boletin 2_3");
        String tipo = "";

        while (!tipo.equals("Euros") && !tipo.equals("Dolares")) {
            System.out.println("¿Qué conversión quieres hacer? Introduce \"Euros\" si es de euros a dólares, o \"Dolares\" para convertir de dólares a euros:");
            tipo = boletin2.nextLine();

            if (tipo.equals("Euros")) {
                System.out.println("Introduce la cantidad de euros para convertirlos a dólares:");
                double euros = boletin2.nextDouble();
                double resultadoD = euros * 1.106;
                System.out.println(euros + "€ son " + resultadoD + "$");

            } else if (tipo.equals("Dolares")) {
                System.out.println("Introduce la cantidad de dólares para convertirlos a euros:");
                double dolares = boletin2.nextDouble();
                double resultadoE = dolares * 0.903;
                System.out.println(dolares + "$ son " + resultadoE + "€");
            } else {
                System.out.println("Has escrito mal \"Euros\" o \"Dolares\", revisa las mayusculas o los fallos y vuelve a introducir el dato correctamente.");
            }
            boletin2.nextLine();
        }


        System.out.println();
        System.out.println("· Boletín 2_4");

        System.out.println("Introduzca el primer número:");
        int num1 = boletin2.nextInt(); //Falla y no entiendo porque.

        System.out.println("Introduzca el segundo número:");
        int num2 = boletin2.nextInt();

        boletin2.close();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        if (num2 != 0) {
            double cociente = (double) num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + cociente);
        } else {
            System.out.println("No se puede dividir entre 0.");
        }

    }
}
