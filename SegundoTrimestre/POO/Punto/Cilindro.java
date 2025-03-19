package SegundoTrimestre.POO.Punto;

public class Cilindro extends Circulo{
    private double altura;

    public Cilindro(int x, int y, int r, double h) {
        super(x, y, r);
        setAltura(h);

    }
    public void setAltura(double h){
        if (h > 0) altura = h;
        else System.out.println("La altura no puede ser negativa");
    }
    public double getAltura(){return altura;}
    public double calcularArea(){
        return 2 * Math.PI * getRadio() * altura + 2 * Math.PI * getRadio() * getRadio();
    }
    public int calcularVolumen(){
        return (int) (Math.PI * getRadio() * getRadio() * altura);
    }
    public String toString(){
        return "Punto: (" + x + "," + y + ")\nRadio: " + getRadio() + "\nAltura: " + altura + "\nArea: " + calcularArea() + "\nVolumen: " + calcularVolumen();
    }
}
