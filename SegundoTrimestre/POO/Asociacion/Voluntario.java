package SegundoTrimestre.POO.Asociacion;

import java.util.Date;

public class Voluntario extends Traballador {
    private int idade;
    private String profesion;
    private int horasDedicadas;

    public Voluntario(String dni, String nome, Date dataIngreso, int idade, String profesion, int horasDedicadas) {
        super(dni, nome, dataIngreso);
        this.idade = idade;
        this.profesion = profesion;
        this.horasDedicadas = horasDedicadas;
    }

    @Override
    public String aCadea() {
        return "DNI: " + super.dni + ", Nome: " + super.nome + ", Idade: " + idade +
                ", Profesión: " + profesion + ", Horas Dedicadas: " + horasDedicadas +
                ", Data de Ingreso: " + super.dataIngreso;
    }

    @Override
    public double gastosIngresos() {
        return 3.0;
    }
}



