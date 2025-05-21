package TercerTrimestre.Boletin12;

import java.io.*;
import java.util.*;

public class Notas {
    private static final String FICHEIRO = "notas.txt";

    public static void xestorNotas(Scanner sc) {
        int opcion;
        do {
            System.out.println("\n--- XESTOR DE NOTAS ---");
            System.out.println("1 - Engadir nota");
            System.out.println("2 - Listar notas");
            System.out.println("3 - Buscar por palabra clave");
            System.out.println("0 - Volver ao menú principal");
            System.out.print("Opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1 -> engadirNota(sc);
                case 2 -> listarNotas();
                case 3 -> buscarNotas(sc);
                case 0 -> {}
                default -> System.out.println("Opción non válida");
            }
        } while (opcion != 0);
    }

    public static void engadirNota(Scanner sc) {
        System.out.print("Escribe a nota: ");
        String nota = sc.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FICHEIRO, true))) {
            bw.write(nota);
            bw.newLine();
            System.out.println("Nota gardada.");
        } catch (IOException e) {
            System.out.println("Erro ao gardar a nota: " + e.getMessage());
        }
    }

    public static void listarNotas() {
        try (BufferedReader br = new BufferedReader(new FileReader(FICHEIRO))) {
            String liña;
            System.out.println("\n--- NOTAS GARDADAS ---");
            while ((liña = br.readLine()) != null) {
                System.out.println(liña);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler as notas: " + e.getMessage());
        }
    }

    public static void buscarNotas(Scanner sc) {
        System.out.print("Palabra clave: ");
        String clave = sc.nextLine().toLowerCase();
        try (BufferedReader br = new BufferedReader(new FileReader(FICHEIRO))) {
            String liña;
            boolean atopada = false;
            while ((liña = br.readLine()) != null) {
                if (liña.toLowerCase().contains(clave)) {
                    System.out.println(liña);
                    atopada = true;
                }
            }
            if (!atopada) System.out.println("Non se atoparon coincidencias.");
        } catch (IOException e) {
            System.out.println("Erro ao buscar: " + e.getMessage());
        }
    }
}

