package Examen;

import java.util.Scanner;

public class Examen3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase para pasarla a nomenclatura Camel, si no introduces la frase se declarará la frase: \"Gústame almORZar cOn moITAS Froitas\"");
        System.out.print("Presiona el boton \"Enter\" si no quieres introducir una frase, sino escribela aquí: ");
        String frase = sc.nextLine();
        if (frase.isEmpty()) {
            frase = "Gústame almORZar cOn moITAS Froitas";
        }
        System.out.println("Ejercicio 1");
        String Ej1 = Camel(frase);
        System.out.println("La frase original es: " + frase);
        System.out.println("Se convierte con la nomenclatura Camel en: " + Ej1);
        System.out.println("Ejercicio 2");
        System.out.println("Introduce una frase para contar sus vocales, si no introduces la frase/palabra se declarará la frase: \"Gústame almORZar cOn moITAS Froitas\"");
        System.out.print("Presiona el boton \"Enter\" si no quieres introducir una frase/palabra, sino escribela aquí: ");
        String frase2 = sc.nextLine();
        if (frase2.isEmpty()) {
            frase2 = "Gústame almORZar cOn moITAS Froitas";
        }
        int Ej2 = ContarVocales(frase2);
        System.out.println("En la frase anterior hay " + Ej2 + " vocales");

    }
    public static String Camel(String frase){
        String [] palabras = frase.split(" ");
        String resultado = "";
        String primera;
        for (int i = 0; i < palabras.length; i++){
            resultado += palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1).toLowerCase();
        }
        primera = String.valueOf(resultado.charAt(0));
        resultado = resultado.replace(primera, primera.toLowerCase());
        return resultado;
    }
    public static int ContarVocales(String frase){
        String vocales = frase.toLowerCase().replaceAll("[^aeiouáéíóú]","");
        return vocales.length();
    }
}
