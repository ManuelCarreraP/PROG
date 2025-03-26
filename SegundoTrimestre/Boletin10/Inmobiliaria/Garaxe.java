package SegundoTrimestre.Boletin10.Inmobiliaria;

class Garaxe extends Inmueble {
    private double ancho, longo;
    private int numPraza;
    private boolean adega;

    public Garaxe(String rua, String numero, String localidade, double prezo, double ancho, double longo, int numPraza, boolean adega) {
        super(rua, numero, localidade, prezo);
        this.ancho = ancho;
        this.longo = longo;
        this.numPraza = numPraza;
        this.adega = adega;
    }

    public double calcularGanancia(boolean venda) {
        return venda ? prezo * 0.03 : prezo;
    }

    public String aCadea() {
        return "Garaxe en " + rua + ", " + localidade + " - Prezo: " + prezo;
    }
}