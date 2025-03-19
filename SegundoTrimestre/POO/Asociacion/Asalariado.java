package SegundoTrimestre.POO.Asociacion;

import java.util.Date;

public class Asalariado extends Traballador {
    private double soldo;
    private String cargo;
    private double porcentajeSeguridadSocial;
    private double porcentajeIRPF;

    public Asalariado(String dni, String nome, Date dataIngreso, double soldo, String cargo, double porcentajeSeguridadSocial, double porcentajeIRPF ) {
        super(dni, nome, dataIngreso);
        this.soldo = soldo;
        this.cargo = cargo;
        this.porcentajeSeguridadSocial = porcentajeSeguridadSocial;
        this.porcentajeIRPF = porcentajeIRPF;
    }

    @Override
    public String aCadea() {
        return "DNI: " + super.dni + ", Nome: " + super.nome + ", Cargo: " + cargo +
                ", Soldo: " + soldo + ", Seguridade Social: " + porcentajeSeguridadSocial + "%, Data de Ingreso: " + super.dataIngreso + ", IRPF: " + porcentajeIRPF + "%";
    }

    @Override
    public double gastosIngresos() {
        return soldo + (soldo * porcentajeSeguridadSocial / 100 + (soldo * porcentajeIRPF / 100));
    }
}
