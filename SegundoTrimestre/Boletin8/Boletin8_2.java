package SegundoTrimestre.Boletin8;

import java.util.Scanner;

public class Boletin8_2 {
    public static void main(String[] args) {
        //Ejercicio1();
        //Ejercicio2();
        System.out.println("Ejercicio 10:");
        Ejercicio10();
        System.out.println();
        System.out.println("Ejercicio 11:");
        Ejercicio11();
        System.out.println();
        System.out.println("Ejercicio 12: ");
        Ejercicio12();
    }
    public static void Ejercicio1 (){
        String palabra = "reflexo";
        imprimirPrimerosDos(palabra);
        imprimirUltimosTres(palabra);
        imprimirCadaDos(palabra);
        imprimirSentidoEInverso(palabra);
    }
    public static void Ejercicio2(){
        String palabra = "separar";
        char caracter = ',';

        System.out.println(insertarEntreLetras(palabra, caracter));

        String texto = "meu arquivo de texto.txt";
        System.out.println(reemplazarEspacios(texto, '_'));

        String clave = "súa clave é: 1540";
        System.out.println(reemplazarDigitos(clave, 'X'));

        String mascara = "2552552550";
        System.out.println(insertarCadaTres(mascara, '.'));
    }

    //Ejercicio 1
    public static void imprimirPrimerosDos(String cadena) {
        if (cadena.length() >= 2) {
            System.out.println(cadena.substring(0, 2));
        } else {
            System.out.println("A cadea é demasiado curta");
        }
    }

    public static void imprimirUltimosTres(String cadena) {
        if (cadena.length() >= 3) {
            System.out.println(cadena.substring(cadena.length() - 3));
        } else {
            System.out.println("A cadea é demasiado curta");
        }
    }

    public static void imprimirCadaDos(String cadena) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cadena.length(); i += 2) {
            resultado.append(cadena.charAt(i));
        }
        System.out.println(resultado.toString());
    }

    public static void imprimirSentidoEInverso(String cadena) {
        StringBuilder inverso = new StringBuilder(cadena);
        System.out.println(cadena + inverso.reverse().toString());
    }

    //Ejericio 2
    public static String insertarEntreLetras(String cadena, char caracter) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            resultado.append(cadena.charAt(i));
            if (i < cadena.length() - 1) {
                resultado.append(caracter);
            }
        }
        return resultado.toString();
    }

    public static String reemplazarEspacios(String cadena, char caracter) {
        return cadena.replace(' ', caracter);
    }

    public static String reemplazarDigitos(String cadena, char caracter) {
        return cadena.replaceAll("[0-9]", String.valueOf(caracter));
    }

    public static String insertarCadaTres(String cadena, char caracter) {
        StringBuilder resultado = new StringBuilder();
        int count = 0;

        for (int i = 0; i < cadena.length(); i++) {
            resultado.append(cadena.charAt(i));
            count++;

            if (count == 3 && i < cadena.length() - 1) {
                resultado.append(caracter);
                count = 0;
            }
        }

        return resultado.toString();
    }

    public static void Ejercicio10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la contraseña: ");
        String contraseña = scanner.nextLine();

        if (validarContraseña(contraseña) == true) {
            if (contMays(contraseña) == true) {
                if (contMin(contraseña) == true) {
                    if (contNum(contraseña) == true) {
                        System.out.println("Contraseña valida!!");
                    } else {
                        System.out.println();
                        System.out.println("La contraseña no es valida, introduzca una contraseña con numeros:");
                        Ejercicio10();
                    }
                } else {
                    System.out.println();
                    System.out.println("La contraseña no es valida, introduzca una contraseña con al menos 1 minuscula:");
                    Ejercicio10();
                }
            } else {
                System.out.println();
                System.out.println("La contraseña no es valida, introduzca una contraseña con al menos mayuscula:");
                Ejercicio10();
            }
        } else {
            System.out.println();
            System.out.println("La contraseña no es válida, introduzca una contraseña con al menos 8 caracteres: ");
            Ejercicio10();
        }

    }
    public static boolean validarContraseña(String contraseña) {
        if (contraseña.length() < 8) {
            return false;
        }
        return true;
    }
    public static boolean contMays(String contraseña){
        boolean tieneMayuscula = false;
        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
        }
        return tieneMayuscula;
    }

    public static boolean contMin(String contraseña) {
        boolean tieneMinuscula = false;
        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
            if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            }
        }
        return tieneMinuscula;
    }

    public static boolean contNum(String contraseña){
        boolean tieneNumero = false;
        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);

            if (Character.isDigit(c)) {
                tieneNumero = true;
            }
        }
        return  tieneNumero;
    }
    public static void Ejercicio11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca el apellido:");
        String apellido = scanner.nextLine();

        String nomFormateado = formatear(nombre, apellido);
        System.out.println("Nombre formateado: " + nomFormateado);
    }

    public static String formatear(String nombre, String apellido) {
        nombre = primeraMayuscula(nombre.replace(" ", ""));
        apellido = primeraMayuscula(apellido.replace(" ", ""));
        return nombre + " " + apellido;
    }

    public static String primeraMayuscula(String texto) {
        if (texto == null || texto.isEmpty()) {
            return "";
        }
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }

    public static void Ejercicio12(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un texto para contar las palabras, caracteres y saber la palabra más larga: ");
        String texto = scanner.nextLine();
        if (texto == null || texto.isEmpty()) {
            System.out.println("Debes introducir texto");
            System.out.println();
            Ejercicio12();
        } else {
            System.out.println("Hay " + contPalabras(texto) + " palabras.");
            System.out.println("Hay " + contCaracteres(texto) + " caracteres.");
            System.out.println("La palabra más larga es:  \"" + palabraLarga(texto) + "\". ");
        }


    }
    private static int contPalabras(String texto) {
        String palabras [] = texto.split(" ");
        int contador = palabras.length;
        return contador;
    }
    private static int contCaracteres(String texto) {
        texto = texto.replace(" ", "");
        int contador = texto.length();
        return contador;
    }

    private static String palabraLarga (String texto) {
        String palabras [] = texto.split(" ");
        int contador = palabras.length;
        String palabraLarga = "";
        for (int i = 0; i < contador; i++) {
            if (palabras[i].length() > palabraLarga.length()) {
                palabraLarga = palabras[i];
            }
        }
        return palabraLarga;
    }

}