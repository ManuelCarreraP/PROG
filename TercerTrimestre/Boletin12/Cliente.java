package TercerTrimestre.Boletin12;

import java.io.*;
import java.util.*;

public class Cliente implements Serializable {
    private String id;
    private String nome;
    private String telefono;

    private static final String FICHEIRO = "clientes.dat";
    private static List<Cliente> lista = new ArrayList<>();

    public Cliente(String id, String nome, String telefono) {
        this.id = id;
        this.nome = nome;
        this.telefono = telefono;
    }

    public static void cargarDatos() {
        File f = new File(FICHEIRO);
        if (f.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHEIRO))) {
                lista = (List<Cliente>) ois.readObject();
            } catch (Exception e) {
                System.out.println("Erro ao cargar os clientes: " + e.getMessage());
            }
        }
    }

    public static void gardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHEIRO))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Erro ao gardar os clientes: " + e.getMessage());
        }
    }

    public static void engadirCliente(Scanner sc) {
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();
        lista.add(new Cliente(id, nome, telefono));
        System.out.println("Cliente engadido correctamente.");
    }

    public static void listarClientes() {
        if (lista.isEmpty()) System.out.println("Non hai clientes.");
        for (Cliente c : lista) {
            System.out.println("ID: " + c.id + ", Nome: " + c.nome + ", Teléfono: " + c.telefono);
        }
    }

    public static void modificarCliente(Scanner sc) {
        System.out.print("ID do cliente a modificar: ");
        String id = sc.nextLine();
        for (Cliente c : lista) {
            if (c.id.equals(id)) {
                System.out.print("Novo nome: ");
                c.nome = sc.nextLine();
                System.out.print("Novo teléfono: ");
                c.telefono = sc.nextLine();
                System.out.println("Cliente modificado.");
                return;
            }
        }
        System.out.println("Cliente non atopado.");
    }

    public static void eliminarCliente(Scanner sc) {
        System.out.print("ID do cliente a eliminar: ");
        String id = sc.nextLine();
        lista.removeIf(c -> c.id.equals(id));
        System.out.println("Cliente eliminado (se existía).");
    }
}

