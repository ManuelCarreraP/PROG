package SegundoTrimestre.POO.Asociacion;

import java.util.ArrayList;
import java.util.List;

public class Asociacion {
    private List<Socio> socios;
    private List<Traballador> traballadores;

    public Asociacion() {
        socios = new ArrayList<>();
        traballadores = new ArrayList<>();
    }

    public void engadirSocio(Socio socio) {
        socios.add(socio);
    }

    public void engadirTraballador(Traballador traballador) {
        traballadores.add(traballador);
    }

    public double calcularBalance() {
        double balance = 0.0;

        for (Socio socio : socios) {
            balance += socio.gastosIngresos();
        }
        for (Traballador traballador : traballadores) {
            balance -= traballador.gastosIngresos();
        }

        return balance;
    }

    public List<Socio> getSocios() {
        return socios;
    }

    public List<Traballador> getTraballadores() {
        return traballadores;
    }
}

