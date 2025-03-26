package SegundoTrimestre.Boletin9.Coche;

public class PrincipalCoche {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.acelerar(50);
        System.out.println("Velocidad: " + coche.getVelocidade());
        coche.frenar(20);
        System.out.println("Velocidad tras frenar: " + coche.getVelocidade());
    }
}
