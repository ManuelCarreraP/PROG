package SegundoTrimestre.POO.Asociacion;
import java.util.Date;

public abstract class Traballador extends Asociacion {
    public String dni;
    public String nome;
    public Date dataIngreso;

    public Traballador(String dni, String nome, Date dataIngreso) {
        this.dni = dni;
        this.nome = nome;
        this.dataIngreso = dataIngreso;
    }

    public abstract String aCadea();
    public abstract double gastosIngresos();
}



