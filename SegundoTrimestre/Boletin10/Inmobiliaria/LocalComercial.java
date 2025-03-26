package SegundoTrimestre.Boletin10.Inmobiliaria;

class LocalComercial extends Inmueble {
    private boolean acondicionado, fachadaRua, entradaMercadorias;
    private String portal, piso, observacions;
    private double metrosCadrados;

    public LocalComercial(String rua, String numero, String localidade, double prezo, boolean acondicionado, boolean fachadaRua, boolean entradaMercadorias, String portal, String piso, double metrosCadrados, String observacions) {
        super(rua, numero, localidade, prezo);
        this.acondicionado = acondicionado;
        this.fachadaRua = fachadaRua;
        this.entradaMercadorias = entradaMercadorias;
        this.portal = portal;
        this.piso = piso;
        this.metrosCadrados = metrosCadrados;
        this.observacions = observacions;
    }

    public double calcularGanancia(boolean venda) {
        return venda ? prezo * 0.02 : prezo;
    }

    public String aCadea() {
        return "Local Comercial en " + rua + ", " + localidade + " - Prezo: " + prezo;
    }
}
