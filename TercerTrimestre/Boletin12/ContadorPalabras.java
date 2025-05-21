package TercerTrimestre.Boletin12;

import java.io.*;
import java.util.*;

public class ContadorPalabras {
    public static void contarPalabras(Scanner sc) {
        System.out.print("Nome do ficheiro .txt: ");
        String nomeFicheiro = sc.nextLine();
        File ficheiro = new File(nomeFicheiro);
        if (!ficheiro.exists()) {
            System.out.println("Ficheiro non existe.");
            return;
        }

        Map<String, Integer> frecuencia = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ficheiro))) {
            String liña;
            while ((liña = br.readLine()) != null) {
                liña = liña.replaceAll("[.,;:!?()\"]", "").toLowerCase();
                String[] palabras = liña.split("\\s+");
                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro: " + e.getMessage());
            return;
        }

        try (PrintWriter pw = new PrintWriter("resumo_palabras.txt")) {
            for (Map.Entry<String, Integer> entrada : frecuencia.entrySet()) {
                String liña = entrada.getKey() + ": " + entrada.getValue();
                System.out.println(liña);
                pw.println(liña);
            }
        } catch (IOException e) {
            System.out.println("Erro ao escribir resumo: " + e.getMessage());
        }
    }
}
