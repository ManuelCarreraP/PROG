package SegundoTrimestre.Boletin10.Asociacion;

class Voluntario extends Persoa {
    private int idade, horas;
    private String profesion;

    public Voluntario(String dni, String nome, int idade, String profesion, int horas) {
        super(dni, nome);
        this.idade = idade;
        this.profesion = profesion;
        this.horas = horas;
    }

    public double gastosIngresos() {
        return -3;
    }

    public String aCadea() {
        return "Voluntario: " + nome + " - DNI: " + dni + " - Prof.: " + profesion;
    }
}
