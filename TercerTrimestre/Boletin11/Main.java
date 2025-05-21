package TercerTrimestre.Boletin11;

import TercerTrimestre.Boletin11.Ej1.Deportista;
import TercerTrimestre.Boletin11.Ej1.DniNonValido;
import TercerTrimestre.Boletin11.Ej1.LicenzaNonValida;
import TercerTrimestre.Boletin11.Ej2.Data;
import TercerTrimestre.Boletin11.Ej2.FormatoDataErroneo;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        try {
            Deportista deportista = new Deportista("Ana", "12345678Z", "2024fut000001");
            System.out.println("Deportista creado: Licenza = " + deportista.getLicenza());
        } catch (DniNonValido | LicenzaNonValida e) {
            System.err.println("Erro en Ej1: " + e.getMessage());
        }

        // Ejercicio 2
        try {
            Data data = new Data(29, 2, 2024);
            System.out.println("Data creada correctamente: " + data);
        } catch (FormatoDataErroneo e) {
            System.err.println("Erro en Ej2: " + e.getMessage());
        }
    }
}