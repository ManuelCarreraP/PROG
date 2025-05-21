package TercerTrimestre.Boletin13;

import java.util.*;

class Academico implements Comparable<Academico> {
    String nome;
    int anoIngreso;

    public Academico(String nome, int anoIngreso) {
        this.nome = nome;
        this.anoIngreso = anoIngreso;
    }

    @Override
    public int compareTo(Academico o) {
        return this.nome.compareTo(o.nome);
    }

    @Override
    public String toString() {
        return nome + " (" + anoIngreso + ")";
    }
}

public class Ej11 {
    public static boolean nuevoAcademico(Map<Character, Academico> academia, Academico novo, Character letra) {
        if (!Character.isLetter(letra)) return false;
        if (academia.containsKey(letra)) return false;
        academia.put(letra, novo);
        return true;
    }

    public static void main(String[] args) {
        Map<Character, Academico> academia = new HashMap<>();

        Academico a1 = new Academico("Alonso", 2001);
        Academico a2 = new Academico("Beatriz", 1999);
        Academico a3 = new Academico("Carlos", 2010);
        Academico a4 = new Academico("Diana", 2005);
        Academico a5 = new Academico("Eva", 2008);

        nuevoAcademico(academia, a1, 'A');
        nuevoAcademico(academia, a2, 'B');
        nuevoAcademico(academia, a3, 'C');
        nuevoAcademico(academia, a4, 'D');
        nuevoAcademico(academia, a5, 'E');

        // Sen letra, orde por nome
        System.out.println("Académicos sen letra, por nome:");
        academia.values().stream()
                .sorted()
                .forEach(System.out::println);

        // Sen letra, orde por ano de ingreso
        System.out.println("\nAcadémicos sen letra, por ano ingreso:");
        academia.values().stream()
                .sorted(Comparator.comparingInt(a -> a.anoIngreso))
                .forEach(System.out::println);

        // Con letra, orde por letra (clave), nome e ano
        System.out.println("\nAcadémicos con letra, por orde clave, nome e ano:");
        academia.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
