package SegundoTrimestre.POO.Punto;

public class Circulo extends Punto {

    private double radio;
    public Circulo (int x, int y, double r){
        super(x,y);
        radio = r;
    }
    public double getRadio(){return radio;}

    public void setRadio(double r){
        radio = r;
    }
    public double calcularArea(double radio){
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }

    public void mostrarCirculo(){
        System.out.println("Punto: (" + x + "," + y + ")");
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + calcularArea(8));
        System.out.println("Perimetro: " + calcularPerimetro());
    }


    public static void main(String[] args) {
        Circulo circulo = new Circulo(10, 20, 5);
        circulo.mostrarCirculo();

        circulo.setRadio(7);
        circulo.mostrarCirculo();
    }

}
