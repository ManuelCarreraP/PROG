package SegundoTrimestre.Boletin10.Asociacion;

class Socio extends Persoa {
    private double cuotaMensual;

    public Socio(String dni, String nome, double cuotaMensual) {
        super(dni, nome);
        this.cuotaMensual = cuotaMensual;
    }

    public double gastosIngresos() {
        return cuotaMensual;
    }

    public String aCadea() {
        return "Socio: " + nome + " - DNI: " + dni + " - Cuota: " + cuotaMensual;
    }
}

