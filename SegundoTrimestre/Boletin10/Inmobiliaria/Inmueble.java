package SegundoTrimestre.Boletin10.Inmobiliaria;

abstract class Inmueble {
    protected String rua, numero, localidade;
    protected double prezo;

    public Inmueble(String rua, String numero, String localidade, double prezo) {
        this.rua = rua;
        this.numero = numero;
        this.localidade = localidade;
        this.prezo = prezo;
    }

    public abstract double calcularGanancia(boolean venda);
    public abstract String aCadea();
}

