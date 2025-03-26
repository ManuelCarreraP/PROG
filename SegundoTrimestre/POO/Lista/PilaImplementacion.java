package SegundoTrimestre.POO.Lista;

public class PilaImplementacion extends Lista implements Pila {
    public PilaImplementacion() {
        super();
    }

    public void apilar(int x) {
        this.insertarPrincipio(x);
    }

    public int desapilar() {
        return this.borrarElemento();
    }

}
