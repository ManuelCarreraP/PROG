package TercerTrimestre.Boletin13;

import java.util.*;

public class Ej7 {
    public static <E> Set<E> union(Set<E> conxunto1, Set<E> conxunto2) {
        Set<E> resultado = new HashSet<>(conxunto1);
        resultado.addAll(conxunto2);
        return resultado;
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> resultado = union(s1, s2);
        System.out.println("Unión: " + resultado);
    }
}

