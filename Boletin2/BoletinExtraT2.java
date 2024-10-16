package Boletin2;

import java.util.Scanner;

public class BoletinExtraT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio1");
        System.out.print("Ingrese la tarifa original: ");
        double tarifa = scanner.nextDouble();
        System.out.print("Ingrese el precio pagado: ");
        double precioPagado = scanner.nextDouble();

        double descuentoAplicado = (1 - (precioPagado / tarifa)) * 100;
        System.out.println("El descuento aplicado es:" + descuentoAplicado);

        System.out.println();
        System.out.println("Ejercicio2");
        System.out.print("Introduce la temperatura en grados centígrados: ");
        double centigrados = scanner.nextDouble();

        double fahrenheit = (centigrados * 9 / 5) + 32;
        double kelvin = centigrados + 273.15;

        System.out.printf("Temperatura en Fahrenheit: %.2f°F\n", fahrenheit);
        System.out.printf("Temperatura en Kelvin: %.2fK\n", kelvin);

        System.out.println();
        System.out.println("Ejercicio3");
        System.out.print("Introduce la cantidad de billetes de 100 €: ");
        int billetes100_3 = scanner.nextInt();

        System.out.print("Introduce la cantidad de billetes de 20 €: ");
        int billetes20_3 = scanner.nextInt();

        System.out.print("Introduce la cantidad de billetes de 5 €: ");
        int billetes5_3 = scanner.nextInt();

        System.out.print("Introduce la cantidad de monedas de 1 €: ");
        int monedas1_3 = scanner.nextInt();

        int totalEuros = (billetes100_3 * 100) + (billetes20_3 * 20) + (billetes5_3 * 5) + monedas1_3;
        System.out.println("El total en euros es: " + totalEuros + " €");

        System.out.println();
        System.out.println("Ejercicio4");
        System.out.print("Introduce una cantidad en euros: ");
        int cantidad = scanner.nextInt();

        int billetes100 = (cantidad >= 100) ? cantidad / 100 : 0;
        cantidad = (cantidad >= 100) ? cantidad % 100 : cantidad;

        int billetes20 = (cantidad >= 20) ? cantidad / 20 : 0;
        cantidad = (cantidad >= 20) ? cantidad % 20 : cantidad;

        int billetes5 = (cantidad >= 5) ? cantidad / 5 : 0;
        cantidad = (cantidad >= 5) ? cantidad % 5 : cantidad;

        int monedas1 = cantidad;

        System.out.println("Desglose:");
        System.out.println("Billetes de 100€: " + billetes100);
        System.out.println("Billetes de 20€: " + billetes20);
        System.out.println("Billetes de 5€: " + billetes5);
        System.out.println("Monedas de 1€: " + monedas1);

        System.out.println();
        System.out.println("Ejercicio5");
        System.out.print("Introduce el sueldo fijo(€): ");
        double sueldoFijo = scanner.nextDouble();

        System.out.print("Introduce el importe total de las ventas (€): ");
        double ventas = scanner.nextDouble();

        System.out.print("Introduce el número de km recorridos: ");
        double kilometros = scanner.nextDouble();

        System.out.print("Introduce el número de días de desplazamientos: ");
        int diasDesplazamientp = scanner.nextInt();

        double comision = ventas * 0.05;

        double kilometraje = kilometros * 2;

        double dietas = diasDesplazamientp* 30;

        double sueldoBruto = sueldoFijo + comision + kilometraje + dietas;

        double irpf = sueldoBruto * 0.18;

        double retencionSeguridadSocial = 36;

        double sueldoLiquido = sueldoBruto - irpf - retencionSeguridadSocial;

        System.out.println("Sueldo bruto: " + sueldoBruto + " €");
        System.out.println("Sueldo líquido: " + sueldoLiquido + " €");

        scanner.close();
    }
}