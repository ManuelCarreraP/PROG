package TercerTrimestre.Boletin13;

import java.io.*;
import java.util.*;

public class Ej10 {
    private static Map<String, Integer> inventario = new HashMap<>();
    private static final String FICHERO = "inventario.dat";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cargarInventario();

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Dar de alta producto");
            System.out.println("2. Dar de baja producto");
            System.out.println("3. Actualizar cantidad");
            System.out.println("4. Visualizar inventario");
            System.out.println("5. Salir");
            System.out.print("Seleccione opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> darAlta();
                case 2 -> darBaja();
                case 3 -> actualizarCantidad();
                case 4 -> visualizar();
                case 5 -> {
                    salir = true;
                    guardarInventario();
                }
                default -> System.out.println("Opción inválida");
            }
        }
    }

    private static void darAlta() {
        System.out.print("Código del producto: ");
        String codigo = sc.nextLine();
        if (inventario.containsKey(codigo)) {
            System.out.println("El producto ya existe.");
        } else {
            System.out.print("Cantidad inicial: ");
            int cantidad = sc.nextInt();
            sc.nextLine();
            inventario.put(codigo, cantidad);
            System.out.println("Producto agregado.");
        }
    }

    private static void darBaja() {
        System.out.print("Código del producto a eliminar: ");
        String codigo = sc.nextLine();
        if (inventario.remove(codigo) != null) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void actualizarCantidad() {
        System.out.print("Código del producto: ");
        String codigo = sc.nextLine();
        if (inventario.containsKey(codigo)) {
            System.out.print("Nueva cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine();
            inventario.put(codigo, cantidad);
            System.out.println("Cantidad actualizada.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void visualizar() {
        if (inventario.isEmpty()) {
            System.out.println("Inventario vacío.");
            return;
        }
        System.out.println("Inventario actual:");
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            System.out.println("Código: " + entry.getKey() + ", Cantidad: " + entry.getValue());
        }
    }

    private static void guardarInventario() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO))) {
            oos.writeObject(inventario);
            System.out.println("Inventario guardado.");
        } catch (IOException e) {
            System.err.println("Error guardando inventario: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static void cargarInventario() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHERO))) {
            inventario = (Map<String, Integer>) ois.readObject();
            System.out.println("Inventario cargado.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Inventario no encontrado, iniciando uno nuevo.");
            inventario = new HashMap<>();
        }
    }
}


