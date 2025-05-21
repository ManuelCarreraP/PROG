package TercerTrimestre.Boletin13;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ej9 {
    static class Rexistro implements Serializable {
        private static final long serialVersionUID = 1L;
        double temperatura;
        Date hora;

        public Rexistro(double temperatura) {
            this.temperatura = temperatura;
            this.hora = new Date();
        }

        @Override
        public String toString() {
            return String.format("%.2f ºC ás %tT", temperatura, hora);
        }
    }

    private static List<Rexistro> rexistros = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sair = false;
        while (!sair) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Novo rexistro");
            System.out.println("2. Listar rexistros");
            System.out.println("3. Estatísticas");
            System.out.println("4. Sair");
            System.out.print("Escolla opción: ");
            int op = sc.nextInt();
            switch (op) {
                case 1 -> novoRexistro();
                case 2 -> listarRexistros();
                case 3 -> mostrarEstatisticas();
                case 4 -> {
                    sair = true;
                    gardarFicheiro();
                }
                default -> System.out.println("Opción inválida");
            }
        }
    }

    private static void novoRexistro() {
        System.out.print("Introduza temperatura en ºC: ");
        double temp = sc.nextDouble();
        rexistros.add(new Rexistro(temp));
        System.out.println("Rexistro gardado.");
    }

    private static void listarRexistros() {
        if (rexistros.isEmpty()) {
            System.out.println("Non hai rexistros.");
            return;
        }
        System.out.println("Rexistros:");
        for (Rexistro r : rexistros) {
            System.out.println(r);
        }
    }

    private static void mostrarEstatisticas() {
        if (rexistros.isEmpty()) {
            System.out.println("Non hai rexistros.");
            return;
        }
        double max = rexistros.stream().mapToDouble(r -> r.temperatura).max().orElse(Double.NaN);
        double min = rexistros.stream().mapToDouble(r -> r.temperatura).min().orElse(Double.NaN);
        double avg = rexistros.stream().mapToDouble(r -> r.temperatura).average().orElse(Double.NaN);

        System.out.printf("Máximo: %.2f ºC\nMínimo: %.2f ºC\nPromedio: %.2f ºC\n", max, min, avg);
    }

    private static void gardarFicheiro() {
        try {
            String data = new SimpleDateFormat("yyyyMMdd").format(new Date());
            String nomeFicheiro = "rexistros" + data + ".dat";
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeFicheiro))) {
                oos.writeObject(rexistros);
                System.out.println("Datos gardados en " + nomeFicheiro);
            }
        } catch (IOException e) {
            System.err.println("Erro gardando ficheiro: " + e.getMessage());
        }
    }
}

