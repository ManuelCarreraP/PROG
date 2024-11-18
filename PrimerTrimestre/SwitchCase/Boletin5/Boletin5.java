package PrimerTrimestre.SwitchCase.Boletin5;
import java.math.BigInteger;
import java.util.Scanner;

public class Boletin5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio 1");
        System.out.println("Introduce 10 números para saber cuales son negativos, positivos o 0s");
        double numero1;
        int contador1= 0;
        int contadorCero = 0;
        int contadorPos= 0;
        int contadorNeg = 0;
        while (contador1 < 10) {
            System.out.print("Introduce un número: ");
            numero1 = sc.nextDouble();
            contador1++;

            if (numero1 > 0){
                contadorPos++;
            } else if (numero1 < 0){
                contadorNeg++;
            } else{
                contadorCero++;
            }
        }
        System.out.println("Hay " + contadorPos + " numeros positivos, " + contadorNeg + " numeros negativos, " + contadorCero + " numeros cero.");

        System.out.println();
        System.out.println("Ejercicio 2");
        BigInteger producto = BigInteger.ONE;  // Inicializa producto como 1
        int suma2 = 0;

        for (int i = 10; i <= 90; i++) {
            suma2 += i;                            // Sumamos el valor de i a la variable suma
            producto = producto.multiply(BigInteger.valueOf(i));  // Multiplicamos usando BigInteger
        }
            System.out.println("La suma de los números entre 10 y 90 es: " + suma2);
        System.out.println("El producto de los números entre 10 y 90 es: " + producto);

        System.out.println();
        System.out.println("Ejercicio 3");
        double resultado = 0;
        System.out.print("Introduce la base del rectángulo (número positivo): ");
        double base = sc.nextDouble();
        while (base <= 0) {
            System.out.println("La base debe ser un número positivo. Intenta de nuevo.");
            System.out.print("Introduce la base del rectángulo (número positivo): ");
            base = sc.nextDouble();
        }

        System.out.print("Introduce la altura del rectángulo (número positivo): ");
        double altura = sc.nextDouble();
        while (altura <= 0) {
            System.out.println("La altura debe ser un número positivo. Intenta de nuevo.");
            System.out.print("Introduce la altura del rectángulo (número positivo): ");
            altura = sc.nextDouble();
        }
        resultado = base*altura;
        System.out.println("El área del rectangulo es: " + resultado);

        System.out.println();
        System.out.println("Ejercicio 4");
        System.out.print("Introduce un número para saber su tabla de multiplicar (1-10): ");
        int multiplicador = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(multiplicador + " x " + i + " = " + multiplicador * i);
        }

        System.out.println();
        System.out.println("Ejercicio 5");
        double sueldoTrabajadores = 0;
        int contador5 = 0;
        int contadorX = 0;
        int contadorY = 0;
        int contadorZ = 0;
        do {
            System.out.println("Introduce el sueldo del trabajador (Introduce \"0\" para salir)");
            sueldoTrabajadores = sc.nextDouble();
            if (sueldoTrabajadores < 0) {
                System.out.println("No se admiten sueldos negativos. Por favor, introduce un sueldo válido.");
                continue; // Volver a pedir el sueldo sin contar este
            }

            // Terminar si el sueldo es 0
            if (sueldoTrabajadores == 0) {
                break;
            }

            // Contar el sueldo
            contador5++;

            // Contar sueldos en los rangos especificados
            if (sueldoTrabajadores >= 1000 && sueldoTrabajadores <= 1750) {
                contadorX++;
            } else if (sueldoTrabajadores < 1000) {
                contadorY++;
            } else  contadorZ++;

        } while (true); // Bucle infinito hasta que se introduce un 0

        // Calcular y mostrar resultados
        System.out.println("Hay " + contadorX + " trabajadores que su sueldo está entre 1000€ y 1750€.");

        if (contador5 > 0) {
            double porcentaje = (contadorY * 100.0) / contador5;
            System.out.printf("El %.2f%% de los trabajadores tienen un sueldo inferior a 1000€ (" + contadorY + ")", porcentaje);
        } else {
            System.out.println("No se han registrado trabajadores.");
        }
        System.out.println();
        System.out.println("Hay " + contadorZ + " trabajadores que su sueldo es mayor a 1750€");

        System.out.println();
        System.out.println("Ejercicio 6");
        int numero6;

        // Solicitar un número
        System.out.print("Introduce un número para calcular su factorial: ");
        numero6 = sc.nextInt();

        // Verificar que o número é non negativo
        if (numero6 < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = 1; // Utilizamos long para evitar desbordamentos en números grandes
            for (int i = 1; i <= numero6; i++) {
                factorial *= i; // Calcular o factorial
            }
            System.out.println("El factorial de " + numero6 + " es: " + factorial);
        }

        System.out.println();
        System.out.println("Ejercicio 7");
        System.out.print("Introduzca la altura del triangulo para dibujarlo: ");
        int alturaDibujarlo = sc.nextInt();
        // Debuxar o triángulo
        for (int i = 1; i <= alturaDibujarlo; i++) {
            // Imprimir espazos antes dos asteriscos
            for (int j = alturaDibujarlo; j > i; j--) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Salto de liña despois de cada fila
            System.out.println();
        }

        System.out.println();
        System.out.println("Ejercicio 8");
        System.out.println("Introduce por lo menos 10 números para calcular su suma (999 para salir)");
        System.out.println("Aunque pongas 999 para salir, si no tienes los 10 números minimos introducidos el bucle se seguira ejecutando");
        int contador8 = 0;
        double numero8 = 0;
        double suma8 = 0;

        do {
            System.out.print("Introduce un número: ");
            numero8 = sc.nextDouble();
            if (numero8 == 999 && contador8 >= 10) {
                break;
            }

            suma8 += numero8;
            contador8++;

        } while (contador8 < 10 || sc.nextLine().equals(""));

        System.out.println("La suma de los números introducidos es: " + suma8);
        sc.close();

    }
}
