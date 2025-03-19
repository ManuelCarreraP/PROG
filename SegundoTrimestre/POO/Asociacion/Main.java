package SegundoTrimestre.POO.Asociacion;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date dataSocio1 = new Date(120, 0, 1);
        Date dataSocio2 = new Date(121, 1, 15);
        Date dataAsalariado = new Date(117, 2, 1);
        Date dataVoluntario = new Date(121, 5, 1);

        Socio socio1 = new Socio("12345678A", "Juan Pérez", "Calle Falsa 123", "A Coruña", dataSocio1, 20.0);
        Socio socio2 = new Socio("23456789B", "Ana Gómez", "Calle Real 456", "Madrid", dataSocio2, 30.0);

        Asalariado asalariado1 = new Asalariado("34567890C", "Pedro Martínez", dataAsalariado, 1500.0, "Director", 15.0, 3.2);
        Asalariado asalariado2 = new Asalariado("45678901D", "Lucía Fernández", dataAsalariado, 1200.0, "Secretaria", 10.0, 2.7);

        Voluntario voluntario1 = new Voluntario("56789012E", "Carlos López", dataVoluntario, 30, "Médico", 10);
        Voluntario voluntario2 = new Voluntario("67890123F", "Marta Pérez", dataVoluntario, 25, "Enxeñeiro", 12);

        Asociacion asociacion = new Asociacion();

        asociacion.engadirSocio(socio1);
        asociacion.engadirSocio(socio2);
        asociacion.engadirTraballador(asalariado1);
        asociacion.engadirTraballador(asalariado2);
        asociacion.engadirTraballador(voluntario1);
        asociacion.engadirTraballador(voluntario2);

        System.out.println("Socios:");
        for (Socio socio : asociacion.getSocios()) {
            System.out.println(socio.aCadea());
        }

        System.out.println("\nTraballadores:");
        for (Traballador traballador : asociacion.getTraballadores()) {
            System.out.println(traballador.aCadea());
        }

        double balance = asociacion.calcularBalance();
        System.out.println("\nBalance da Asociación: " + balance);
    }
}

