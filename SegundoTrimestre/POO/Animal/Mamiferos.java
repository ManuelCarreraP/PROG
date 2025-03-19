package SegundoTrimestre.POO.Animal;

public abstract class Mamiferos extends Animal {

    public Mamiferos(String nombre, int edad) {
        super(nombre, edad);
    }
    public void amamantar(){
        System.out.println("Amamantando");
    }
    public abstract String parir();
}
