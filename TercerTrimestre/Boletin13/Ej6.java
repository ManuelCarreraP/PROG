package TercerTrimestre.Boletin13;

import java.util.*;

public class Ej6 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();

        // Insertar 100 números aleatorios entre 1 y 10
        for (int i = 0; i < 100; i++) {
            lista.add(rand.nextInt(10) + 1);
        }

        // Crear conjunto sin repetir elementos
        Set<Integer> senRepetir = new HashSet<>(lista);

        // Encontrar elementos repetidos
        Set<Integer> repetidos = new HashSet<>();
        Set<Integer> vistos = new HashSet<>();

        for (Integer n : lista) {
            if (!vistos.add(n)) {
                repetidos.add(n);
            }
        }

        // Elementos que sólo aparecen una vez (únicos)
        Set<Integer> unicos = new HashSet<>(senRepetir);
        unicos.removeAll(repetidos);

        System.out.println("Lista completa: " + lista);
        System.out.println("Conjunto sin repetir: " + senRepetir);
        System.out.println("Elementos repetidos: " + repetidos);
        System.out.println("Elementos únicos: " + unicos);
    }
}

