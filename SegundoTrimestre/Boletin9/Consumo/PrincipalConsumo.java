package SegundoTrimestre.Boletin9.Consumo;

class PrincipalConsumo {
    public static void main(String[] args) {
        Consumo c1 = new Consumo();
        c1.setLitros(50);
        c1.setPGas(1.57);

        Consumo c2 = new Consumo(500, 40, 100, 1.50);
        System.out.println("Consumo medio: " + c2.consumoMedio());

        c2.setLitros(45);
        System.out.println("Velocidad media: " + c2.getTempo());
    }
}
