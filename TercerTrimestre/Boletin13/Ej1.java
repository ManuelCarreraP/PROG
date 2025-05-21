package TercerTrimestre.Boletin13;

import java.util.Arrays;

public class Ej1 {
    public static <T> T[] concatenarTaboas(T[] taboa1, T[] taboa2) {
        T[] resultado = Arrays.copyOf(taboa1, taboa1.length + taboa2.length);
        System.arraycopy(taboa2, 0, resultado, taboa1.length, taboa2.length);
        return resultado;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        Integer[] b = {4, 5, 6};
        Integer[] resultado = concatenarTaboas(a, b);
        System.out.println("Resultado concatenación: " + Arrays.toString(resultado));
    }
}

