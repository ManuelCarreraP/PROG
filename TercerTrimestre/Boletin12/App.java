package TercerTrimestre.Boletin12;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente.cargarDatos();
        Tarefa.cargarTarefas();

        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1 - Xestión de clientes");
            System.out.println("2 - Xestor de notas");
            System.out.println("3 - Contar palabras dun ficheiro");
            System.out.println("4 - Xestor de tarefas");
            System.out.println("0 - Saír");
            System.out.print("Elixe unha opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1 -> xestionClientes(sc);
                case 2 -> Notas.xestorNotas(sc);
                case 3 -> ContadorPalabras.contarPalabras(sc);
                case 4 -> xestorTarefas(sc);
                case 0 -> System.out.println("Gardando e saíndo...");
                default -> System.out.println("Opción non válida");
            }
        } while (opcion != 0);

        Cliente.gardarDatos();
        Tarefa.gardarTarefas();
    }

    private static void xestionClientes(Scanner sc) {
        int op;
        do {
            System.out.println("\n--- XESTIÓN DE CLIENTES ---");
            System.out.println("1 - Engadir cliente");
            System.out.println("2 - Modificar cliente");
            System.out.println("3 - Eliminar cliente");
            System.out.println("4 - Listar clientes");
            System.out.println("0 - Volver");
            System.out.print("Opción: ");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> Cliente.engadirCliente(sc);
                case 2 -> Cliente.modificarCliente(sc);
                case 3 -> Cliente.eliminarCliente(sc);
                case 4 -> Cliente.listarClientes();
                case 0 -> {}
                default -> System.out.println("Opción incorrecta");
            }
        } while (op != 0);
    }

    private static void xestorTarefas(Scanner sc) {
        int op;
        do {
            System.out.println("\n--- XESTOR DE TAREFAS ---");
            System.out.println("1 - Agregar tarefa");
            System.out.println("2 - Modificar tarefa");
            System.out.println("3 - Borrar tarefa");
            System.out.println("4 - Listar tarefas");
            System.out.println("0 - Volver");
            System.out.print("Opción: ");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> Tarefa.agregarTarefa(sc);
                case 2 -> Tarefa.modificarTarefa(sc);
                case 3 -> Tarefa.borrarTarefa(sc);
                case 4 -> Tarefa.listarTarefas();
                case 0 -> {}
                default -> System.out.println("Opción incorrecta");
            }
        } while (op != 0);
    }
}
