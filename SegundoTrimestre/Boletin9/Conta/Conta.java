package SegundoTrimestre.Boletin9.Conta;

class Conta {
    private String nomeCliente, numConta;
    private double tipoInterese, saldo;

    public Conta() {}
    public Conta(String nomeCliente, String numConta, double tipoInterese, double saldo) {
        this.setNomeCliente(nomeCliente);
        this.setNumConta(numConta);
        this.setTipoInterese(tipoInterese);
        this.setSaldo(saldo);
    }

    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }
    public String getNumConta() { return numConta; }
    public void setNumConta(String numConta) { this.numConta = numConta; }
    public double getTipoInterese() { return tipoInterese; }
    public void setTipoInterese(double tipoInterese) { this.tipoInterese = tipoInterese; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public void ingresar(double cant) { if (cant > 0) setSaldo(getSaldo() + cant); }
    public void retirar(double cant) { if (cant > 0 && getSaldo() >= cant) setSaldo(getSaldo() - cant); }
    public void transferencia(Conta destino, double importe) {
        if (importe > 0 && getSaldo() >= importe) {
            this.retirar(importe);
            destino.ingresar(importe);
        }
    }
}
