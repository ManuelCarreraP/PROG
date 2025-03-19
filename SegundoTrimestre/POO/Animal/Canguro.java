package SegundoTrimestre.POO.Animal;

public class Canguro extends Mamiferos {
    public Canguro(String nombre, int edad, String tipoSonido) {
        super(nombre, edad);
        //this.tipoSonido = tipoSonido;
    }

    public void desplazar(){
        System.out.println(getNombre()+ " com....");
    }

    public String parir() {
        return "Cría";
    }
    public void comer(){
        System.out.println("Comiendo");
    }
    public void voz(){
        System.out.println("Voz de canguro");
    }
}
