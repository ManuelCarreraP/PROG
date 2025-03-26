package SegundoTrimestre.Boletin10.Asociacion;

abstract class Persoa {
    protected String dni, nome;

    public Persoa(String dni, String nome) {
        this.dni = dni;
        this.nome = nome;
    }

    public abstract double gastosIngresos();
    public abstract String aCadea();
}

