package TercerTrimestre.Boletin11.Ej1;

public class Deportista extends Persoa {
    private String licenza;

    public Deportista(String nome, String dni, String licenza) throws DniNonValido, LicenzaNonValida {
        super(nome, dni);
        setLicenza(licenza);
    }

    public void setLicenza(String licenza) throws LicenzaNonValida {
        if (!licenza.matches("\\d{4}[a-z]{3}\\d{6}")) {
            throw new LicenzaNonValida("Licenza non válida: " + licenza);
        }
        this.licenza = licenza;
    }

    public String getLicenza() {
        return licenza;
    }
}