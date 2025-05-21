package TercerTrimestre.Boletin13;

import java.util.*;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> positivos = new ArrayList<>();
        List<Double> negativos = new ArrayList<>();

        double num;
        do {
            System.out.print("Introduce un número real (0 para finalizar): ");
            num = sc.nextDouble();
            if (num > 0) positivos.add(num);
            else if (num < 0) negativos.add(num);
        } while (num != 0);

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);

        double sumaPositivos = positivos.stream().mapToDouble(Double::doubleValue).sum();
        double sumaNegativos = negativos.stream().mapToDouble(Double::doubleValue).sum();

        System.out.println("Suma positivos: " + sumaPositivos);
        System.out.println("Suma negativos: " + sumaNegativos);

        positivos.removeIf(x -> x > 10);
        negativos.removeIf(x -> x < -10);

        System.out.println("Positivos filtrados: " + positivos);
        System.out.println("Negativos filtrados: " + negativos);
    }
}
