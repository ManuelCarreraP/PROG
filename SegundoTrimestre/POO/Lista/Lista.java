/*
- Constructor con táboa con 0 elementos
- Obter número de elementos
- Insertar número o final da lista
- Insertar número o principio da lista
- Insertar número en un lugar da lista especificado por un índice
- Obter un elemento especificado por un indice
- Buscar un número na lista, devoltando o indice onde se encontra ou -1 se non se atopou
- Mostrar todos os elementos da lista
 */

package SegundoTrimestre.POO.Lista;

import java.util.Scanner;

public class Lista {
    private int[] tabla;
    private int numElementos;

    public Lista() {
        this.tabla = new int[0];
        this.numElementos = 0;
    }

    private void incrementarNumElementos() {
        this.numElementos++;
    }


    public void insertarFinal(int num) {
        int[] nuevaTabla = new int[this.numElementos + 1];
        System.arraycopy(this.tabla, 0, nuevaTabla, 0, this.numElementos);
        nuevaTabla[this.numElementos] = num;
        this.tabla = nuevaTabla;
        incrementarNumElementos();
    }

    public void insertarPrincipio(int num) {
        int[] nuevaTabla = new int[this.numElementos + 1];
        nuevaTabla[0] = num;
        System.arraycopy(this.tabla, 0, nuevaTabla, 1, this.numElementos);
        this.tabla = nuevaTabla;
        incrementarNumElementos();
    }

    public void insertarIndice(int num, int indice) {
        if (indice < 0 || indice > this.numElementos) {
            System.out.println("Índice fuera de rango");
            return;
        }
        int[] nuevaTabla = new int[this.numElementos + 1];
        System.arraycopy(this.tabla, 0, nuevaTabla, 0, indice);
        nuevaTabla[indice] = num;
        System.arraycopy(this.tabla, indice, nuevaTabla, indice + 1, this.numElementos - indice);
        this.tabla = nuevaTabla;
        incrementarNumElementos();
    }

    public void insertarNumero(int num) {
        insertarFinal(num);
    }

    public int obtenerElemento(int indice) {
        if (indice < 0 || indice >= this.numElementos) {
            System.out.println("Índice fuera de rango");
            return -1;
        }
        return this.tabla[indice];
    }

    public int buscar(int num) {
        for (int i = 0; i < this.numElementos; i++) {
            if (this.tabla[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public void mostrar() {
        for (int i = 0; i < this.numElementos; i++) {
            System.out.println(i + 1 + ": " + this.tabla[i]);
        }
    }

    public void borrarElemento() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Deseas borrar un elemento de la lista? (s/n): ");
        String respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("n")) {
            System.out.println("No se borrará ningún elemento.");
            return;
        }

        boolean elementoEncontrado = false;

        do {
            System.out.print("Introduce el elemento que deseas borrar: ");
            int elemento = scanner.nextInt();

            for (int i = 0; i < this.numElementos; i++) {
                if (this.tabla[i] == elemento) {
                    int[] nuevaTabla = new int[this.numElementos - 1];
                    System.arraycopy(this.tabla, 0, nuevaTabla, 0, i);
                    System.arraycopy(this.tabla, i + 1, nuevaTabla, i, this.numElementos - i - 1);
                    this.tabla = nuevaTabla;
                    this.numElementos--;
                    elementoEncontrado = true;
                    System.out.println("Elemento borrado con éxito.");
                    break;
                }
            }

            if (!elementoEncontrado) {
                System.out.println("El elemento no se encuentra en la lista.");
            }

            System.out.print("¿Deseas borrar otro elemento? (s/n): ");
            respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
            elementoEncontrado = false;
        } while (true);
    }

    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos elementos deseas introducir en la lista?");
        int numElementos = scanner.nextInt();

        for (int i = 0; i < numElementos; i++) {
            System.out.println("Introduce el elemento " + (i + 1) + ":");
            int elemento = scanner.nextInt();
            lista.insertarNumero(elemento);
        }
        System.out.println("Lista actual:");
        lista.mostrar();

        System.out.println("¿Deseas insertar un elemento al principio de la lista? (s/n)");
        if (scanner.next().equalsIgnoreCase("s")) {
            System.out.println("Introduce el elemento a insertar:");
            lista.insertarPrincipio(scanner.nextInt());
            System.out.println("Lista después de insertar al principio:");
            lista.mostrar();
        }

        System.out.println("¿Deseas insertar un elemento al final de la lista? (s/n)");
        if (scanner.next().equalsIgnoreCase("s")) {
            System.out.println("Introduce el elemento a insertar:");
            lista.insertarFinal(scanner.nextInt());
            System.out.println("Lista después de insertar al principio:");
            lista.mostrar();
        }

        System.out.println("¿Deseas insertar un elemento en un índice específico? (s/n)");
        if (scanner.next().equalsIgnoreCase("s")) {
            System.out.println("Introduce el índice:");
            int indice = scanner.nextInt();
            System.out.println("Introduce el elemento a insertar:");
            lista.insertarIndice(scanner.nextInt(), indice - 1);
            System.out.println("Lista después de la inserción:");
            lista.mostrar();
        }

        System.out.println("¿Deseas buscar un elemento? (s/n)");
        if (scanner.next().equalsIgnoreCase("s")) {
            System.out.println("Introduce el elemento a buscar:");
            int indice = lista.buscar(scanner.nextInt());
            System.out.println(indice != -1 ? "El elemento está en la posición: " + (indice + 1) : "Elemento no encontrado");
        }

        System.out.println("¿Deseas obtener un elemento por índice? (s/n)");
        if (scanner.next().equalsIgnoreCase("s")) {
            System.out.println("Introduce el índice:");
            int indice = scanner.nextInt();
            int elemento = lista.obtenerElemento(indice - 1);
            if (elemento != -1) {
                System.out.println("El elemento en la posición " + indice + " es " + elemento);
            }
        }

        lista.borrarElemento();

        System.out.println("Lista después de borrar elementos:");
        lista.mostrar();
        scanner.close();
    }
}





