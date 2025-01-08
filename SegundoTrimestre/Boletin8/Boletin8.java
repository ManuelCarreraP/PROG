package SegundoTrimestre.Boletin8;

public class Boletin8 {
    public static void main(String[] args) {
        System.out.println("\nEjercicio 1");
        String texto1 = "Isto é Java!";
        System.out.println("La longitud de \"" + texto1 + "\" es: " + texto1.length());

        System.out.println("\nEjercicio 2");
        String texto2 = "Java";
        System.out.println("El texto \"" + texto2 + "\" separado por caracteres es: ");
        for (int i = 0; i < texto2.length(); i++) {
            System.out.println("Carácter " + (i + 1) + ": " + texto2.charAt(i));
        }

        System.out.println("\nEjercicio 3");
        String texto3 = "Java dende 0";
        String textoInvertido = "";

        for (int i = texto3.length() - 1; i >= 0; i--) {
            textoInvertido += texto3.charAt(i);
        }
        System.out.println("El texto \"" + texto3 + "\" invertido es: " + textoInvertido);

        System.out.println("\nEjercicio 4");
        String texto4 = "James Gosling Created Java";
        System.out.println("El texto \"" + texto4 + "\" sin espacios es: " + texto4.replaceAll(" ", ""));

        System.out.println("\nEjercicio 5");
        String texto5 = "java java java";
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        for (int i = 0; i < texto5.length(); i++) {
            char caracter = texto5.charAt(i);
            if (Character.isLetter(caracter)) {
                boolean esVocal = false;
                for (char v : vocales) {
                    if (caracter == v) {
                        esVocal = true;
                        break;
                    }
                }
                if (esVocal) {
                    contadorVocales++;
                } else {
                    contadorConsonantes++;
                }
            }
        }
        System.out.println("El texto \"" + texto5 + "\" tiene: " + contadorVocales + " vocales y " + contadorConsonantes + " consonantes.");

        System.out.println("\nEjercicio 6");
        String texto6 = "www. javadende0. com";

        String parte1 = texto6.substring(0, 9);
        String parte2 = texto6.substring(9);
        String t6concatenado = parte1 + parte2;

        System.out.println("Parte 1: " + parte1);
        System.out.println("Parte 2: " + parte2);
        System.out.println("Cadena concatenada: " + t6concatenado);

        System.out.println("\nEjercicio 7");
        String texto7 = "javeros";
        String t7May = "";
        String t7Min = "";
        for (int i = 0; i < texto7.length(); i++) {
            char caracter = texto7.charAt(i);
            caracter = Character.toUpperCase(caracter);
            t7May += caracter;
        }

        for (int i = 0; i < texto7.length(); i++) {
            char caracter = texto7.charAt(i);
            caracter = Character.toLowerCase(caracter);
            t7Min += caracter;
        }
        System.out.println("El texto \"" + texto7 + "\" pasado a mayusculas es: \"" + t7May + "\" y pasado a minustulas es: \"" + t7Min + "\".");

        System.out.println("\nEjercicio 8");
        String texto8 = "Java";
        String text8 = "JavaScript";
        if (texto8.equals(text8)) {
            System.out.println("El texto \"" + texto8 + "\" y el texto \"" + text8 + "\" son iguales");

        }else System.out.println("El texto \"" + texto8 + "\" y el texto \"" + text8 + "\" son diferentes");

        System.out.println("\nEjercicio 9");
        String texto9 = "Jeve jeve jeve";
        String resultado = texto9.replaceAll("[aeiouAEIOU]", "a");
        System.out.println("El texto \"" + texto9 + "\" con todas sus vocales pasadas a \"a\" es: \"" +  resultado + "\"");

        System.out.println("\nEjercicio 10");
        String texto10 = "ABCD";

        for (int i = 0; i < texto10.length(); i++) {
            char caracter = texto10.charAt(i);
            int ascii = (int) caracter;
            System.out.println("Carácter: " + caracter + " -> ASCII: " + ascii);
        }

        System.out.println("\nEjercicio 11");
        String texto11 = "Ola, son alumno de DAM1, e son programador desde o 2024";

        int contadorLetras = 0;
        int contadorDigitos = 0;
        int contadorEspacios = 0;

        for (int i = 0; i < texto11.length(); i++) {
            char caracter = texto11.charAt(i);

            if (Character.isLetter(caracter)) {
                contadorLetras++;
            }

            else if (Character.isDigit(caracter)) {
                contadorDigitos++;
            }

            else if (caracter == ' ') {
                contadorEspacios++;
            }
        }

        System.out.println("El texto \"" + texto11 + "\" tiene: ");
        System.out.println("Número de letras: " + contadorLetras);
        System.out.println("Número de dígitos: " + contadorDigitos);
        System.out.println("Número de espacios en blanco: " + contadorEspacios);
    }
}
