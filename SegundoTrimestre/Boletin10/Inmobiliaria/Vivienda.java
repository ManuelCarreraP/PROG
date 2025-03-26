package SegundoTrimestre.Boletin10.Inmobiliaria;

class Vivenda extends Inmueble {
    private String portal, piso;
    private int numHabitacions;
    private boolean prazaGaraxe, trasteiro, adega;
    private String observacions;

    public Vivenda(String rua, String numero, String localidade, double prezo, String portal, String piso, int numHabitacions, boolean prazaGaraxe, boolean trasteiro, boolean adega, String observacions) {
        super(rua, numero, localidade, prezo);
        this.portal = portal;
        this.piso = piso;
        this.numHabitacions = numHabitacions;
        this.prazaGaraxe = prazaGaraxe;
        this.trasteiro = trasteiro;
        this.adega = adega;
        this.observacions = observacions;
    }

    public double calcularGanancia(boolean venda) {
        return venda ? prezo * 0.02 : prezo;
    }

    public String aCadea() {
        return "Vivenda en " + rua + ", " + localidade + " - Prezo: " + prezo;
    }
}
