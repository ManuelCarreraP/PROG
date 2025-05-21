package TercerTrimestre.Boletin13;

import java.util.*;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> positivos = new ArrayList<>();

        int num;
        do {
            System.out.print("Introduce un número enteiro (-1 para finalizar): ");
            num = sc.nextInt();
            if (num >= 0) positivos.add(num);
        } while (num != -1);

        System.out.println("Elementos con índice par multiplicados por 100:");
        for (int i = 0; i < positivos.size(); i++) {
            if (i % 2 == 0) {
                System.out.println("Índice " + i + ": " + (positivos.get(i) * 100));
            }
        }
    }
}
