package TercerTrimestre.Boletin13;

import java.util.ArrayList;

public class Ej2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numeros.add((int) (Math.random() * 10) + 1);
        }

        System.out.println("Antes da eliminación: " + numeros);

        numeros.removeIf(n -> n == 5 || n == 7);

        System.out.println("Despois da eliminación: " + numeros);
    }
}
