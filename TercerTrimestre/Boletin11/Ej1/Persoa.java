package TercerTrimestre.Boletin11.Ej1;

public class Persoa {
    private String nome;
    private String dni;

    public Persoa(String nome, String dni) throws DniNonValido {
        this.nome = nome;
        setDni(dni);
    }

    public void setDni(String dni) throws DniNonValido {
        if (!dni.matches("\\d{8}[A-HJ-NP-TV-Z]")) {
            throw new DniNonValido("DNI non válido: " + dni);
        }
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }
}