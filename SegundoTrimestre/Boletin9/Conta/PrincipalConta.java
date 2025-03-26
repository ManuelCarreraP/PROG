package SegundoTrimestre.Boletin9.Conta;

class PrincipalConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Pedro", "123456789", 1.5, 1000);
        Conta conta2 = new Conta("Maria", "987654321", 1.5, 500);

        conta1.transferencia(conta2, 200);
        System.out.println("Saldo conta1: " + conta1.getSaldo());
        System.out.println("Saldo conta2: " + conta2.getSaldo());
    }
}
