package TercerTrimestre.Boletin13;

import java.util.ArrayList;
import java.util.Iterator;

public class Ej3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numeros.add((int) (Math.random() * 10) + 1);
        }

        System.out.println("Antes da eliminación: " + numeros);

        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            int n = it.next();
            if (n == 5 || n == 7) {
                it.remove();
            }
        }

        System.out.println("Despois da eliminación con iterador: " + numeros);
    }
}

