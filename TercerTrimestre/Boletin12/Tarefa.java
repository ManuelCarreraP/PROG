package TercerTrimestre.Boletin12;

import java.io.*;
import java.util.*;

public class Tarefa implements Serializable {
    private String data;
    private String hora;
    private int duracion;
    private String nome;
    private String descricion;
    private boolean feita;

    private static final String FICHEIRO = "tarefas.dat";
    private static List<Tarefa> tarefas = new ArrayList<>();

    public Tarefa(String data, String hora, int duracion, String nome, String descricion, boolean feita) {
        this.data = data;
        this.hora = hora;
        this.duracion = duracion;
        this.nome = nome;
        this.descricion = descricion;
        this.feita = feita;
    }

    public static void cargarTarefas() {
        File f = new File(FICHEIRO);
        if (f.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHEIRO))) {
                tarefas = (List<Tarefa>) ois.readObject();
            } catch (Exception e) {
                System.out.println("Erro ao cargar tarefas: " + e.getMessage());
            }
        }
    }

    public static void gardarTarefas() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHEIRO))) {
            oos.writeObject(tarefas);
        } catch (IOException e) {
            System.out.println("Erro ao gardar tarefas: " + e.getMessage());
        }
    }

    public static void agregarTarefa(Scanner sc) {
        System.out.print("Data: ");
        String data = sc.nextLine();
        System.out.print("Hora: ");
        String hora = sc.nextLine();
        System.out.print("Duración (min): ");
        int duracion = Integer.parseInt(sc.nextLine());
        System.out.print("Nome tarefa: ");
        String nome = sc.nextLine();
        System.out.print("Descrición: ");
        String desc = sc.nextLine();
        System.out.print("Está feita? (s/n): ");
        boolean feita = sc.nextLine().equalsIgnoreCase("s");

        tarefas.add(new Tarefa(data, hora, duracion, nome, desc, feita));
        System.out.println("Tarefa engadida.");
    }

    public static void listarTarefas() {
        if (tarefas.isEmpty()) System.out.println("Non hai tarefas.");
        for (Tarefa t : tarefas) {
            System.out.println("[" + (t.feita ? "Feita" : "Non feita") + "] " + t.data + " " + t.hora + " - " + t.nome + ": " + t.descricion);
        }
    }

    public static void borrarTarefa(Scanner sc) {
        System.out.print("Nome da tarefa a eliminar: ");
        String nome = sc.nextLine();
        tarefas.removeIf(t -> t.nome.equalsIgnoreCase(nome));
        System.out.println("Tarefa eliminada (se existía).");
    }

    public static void modificarTarefa(Scanner sc) {
        System.out.print("Nome da tarefa a modificar: ");
        String nome = sc.nextLine();
        for (Tarefa t : tarefas) {
            if (t.nome.equalsIgnoreCase(nome)) {
                System.out.print("Nova descrición: ");
                t.descricion = sc.nextLine();
                System.out.print("Nova data: ");
                t.data = sc.nextLine();
                System.out.print("Nova hora: ");
                t.hora = sc.nextLine();
                System.out.print("Nova duración: ");
                t.duracion = Integer.parseInt(sc.nextLine());
                System.out.print("Está feita? (s/n): ");
                t.feita = sc.nextLine().equalsIgnoreCase("s");
                System.out.println("Tarefa modificada.");
                return;
            }
        }
        System.out.println("Tarefa non atopada.");
    }
}
