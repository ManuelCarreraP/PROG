package PrimerTrimestre.Bucles;

import java.util.Scanner;

public class ejercicios2 {
    static Scanner sc = new Scanner(System.in);
    static long numElevado (int m, int n) {

        if (n == 0) {
            return 1;  // m^0 es 1
        } else if (n < 0) {
            return 0;  // Opcional: Manejar el caso de potencias negativas
        } else {
            return m * numElevado(m, n - 1);  // m * m^(n-1)
        }

    }

    static long fabionacci ( int x) {
        long res;
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            res = fabionacci(x - 1 ) + fabionacci( x +1 );
            return res;
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduce el número que quieres elevar: ");
        int m = sc.nextInt();
        System.out.print("Introduce a cuanto lo quieres elevar: ");
        int n = sc.nextInt();

        System.out.println("El resultado es: " + numElevado(m,n));

        System.out.println();

        System.out.print("Introduce un número para saber como sería en fabionacci: ");
        int x = sc.nextInt();

        System.out.println("El resultado de fabionacci es: " + fabionacci(x));

    }

}
