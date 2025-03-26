package SegundoTrimestre.Boletin10.Asociacion;

class Asalariado extends Persoa {
    private double soldo, ssPorcentaxe, irpfPorcentaxe;

    public Asalariado(String dni, String nome, double soldo, double ssPorcentaxe, double irpfPorcentaxe) {
        super(dni, nome);
        this.soldo = soldo;
        this.ssPorcentaxe = ssPorcentaxe;
        this.irpfPorcentaxe = irpfPorcentaxe;
    }

    public double gastosIngresos() {
        return -(soldo + soldo * 0.15);
    }

    public String aCadea() {
        return "Asalariado: " + nome + " - DNI: " + dni + " - Soldo: " + soldo;
    }
}