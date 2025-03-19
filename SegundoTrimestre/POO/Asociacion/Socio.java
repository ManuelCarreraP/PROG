package SegundoTrimestre.POO.Asociacion;
import java.util.Date;

public class Socio extends Asociacion {
    private String dni;
    private String nome;
    private String direccion;
    private String provincia;
    private Date dataAlta;
    private double cuotaMensual;

    public Socio(String dni, String nome, String direccion, String provincia, Date dataAlta, double cuotaMensual) {
        this.dni = dni;
        this.nome = nome;
        this.direccion = direccion;
        this.provincia = provincia;
        this.dataAlta = dataAlta;
        this.cuotaMensual = cuotaMensual;
    }

    public String aCadea() {
        return "DNI: " + dni + ", Nome: " + nome + ", Dirección: " + direccion + ", Provincia: " + provincia +
                ", Data de Alta: " + dataAlta + ", Cuota: " + cuotaMensual;
    }

    public double gastosIngresos() {
        return cuotaMensual;
    }
}


