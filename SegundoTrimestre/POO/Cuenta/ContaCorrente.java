package SegundoTrimestre.POO.Cuenta;

public class ContaCorrente {
    private double saldo;
    private int numCC;
    private String titular;

    public ContaCorrente(int numCC, String titular) {
        this.saldo = 0;
        this.numCC = numCC;
        this.titular = titular;
    }

    public ContaCorrente(int numCC, String titular, double saldo) {
        this.saldo = saldo;
        this.numCC = numCC;
        this.titular = titular;

    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumCC() {
        return numCC;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente para retirar la cantidad solicitada.");
        }
    }

    public void transferir(ContaCorrente destino, double cantidad) {

    }


    public static void main(String[] args) {

    }
}
