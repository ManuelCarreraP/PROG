package SegundoTrimestre.Boletin9.Consumo;

class Consumo {
    private double km, litros, vMed, pGas;

    public Consumo() {}
    public Consumo(double km, double litros, double vMed, double pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    public double getTempo() { return km / vMed; }
    public double consumoMedio() { return (litros / km) * 100; }
    public double consumoEuros() { return consumoMedio() * pGas; }

    public void setKms(double km) { this.km = km; }
    public void setLitros(double litros) { this.litros = litros; }
    public void setVMed(double vMed) { this.vMed = vMed; }
    public void setPGas(double pGas) { this.pGas = pGas; }
}
