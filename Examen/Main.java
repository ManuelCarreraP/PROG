package Examen;

abstract class Barcos {
    private int metrosEscola;
    private int toneladasCarga;
    private int calado;
    private int potencia;
    private int velocidadeNudos;
    private float consumoDia;
    private String nome;
    private String matricula;
    private int numTripulantes;
    private int diasEmbarcados;
    private float precioFuel;

    public Barcos(int metrosEscola, int toneladasCarga, int calado, int potencia, int velocidadeNudos, float consumoDia, String nome, String matricula, int numTripulantes, int diasEmbarcados, float precioFuel){
        this.metrosEscola = metrosEscola;
        this.toneladasCarga = toneladasCarga;
        this.calado = calado;
        this.potencia = potencia;
        this.velocidadeNudos = velocidadeNudos;
        this.consumoDia = consumoDia;
        this.nome = nome;
        this.matricula = matricula;
        this.numTripulantes = numTripulantes;
        this.diasEmbarcados = diasEmbarcados;
        this.precioFuel = precioFuel;
    }

    public int getMetrosEscola() { return metrosEscola; }
    public int getToneladasCarga() { return toneladasCarga; }
    public int getCalado() { return calado; }
    public int getPotencia() { return potencia; }
    public int getVelocidadeNudos() { return velocidadeNudos; }
    public float getConsumoDia() { return consumoDia; }
    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public int getNumTripulantes() { return numTripulantes; }
    public int getnumDiasEmbarcados() { return diasEmbarcados; }
    public float getPrecioFuel(){return precioFuel;}

    public abstract void aCadea();

    public abstract float calculoConsumo(int dias, float €L, float consumoDia);


}
interface tipoCamara {
    void tipoCamara();
}
class Extractores extends Barcos implements tipoCamara{
    private String arte;
    public Extractores(int metrosEscola, int toneladasCarga, int calado, int potencia, int velocidadeNudos, float consumoDia, String nome, String matricula, int numTripulantes, int diasEmbarcados,float precioFuel, String arte){
        super(metrosEscola, toneladasCarga, calado, potencia, velocidadeNudos, consumoDia, nome, matricula, numTripulantes, diasEmbarcados, precioFuel);
        this.arte = arte;
    }


    @Override
    public void tipoCamara(){
        System.out.println("Extractores -  Cámara frigorífica");
    }

    @Override
    public float calculoConsumo(int dias, float precioFuel, float consumoDia) {
        float resultado;
        resultado = consumoDia * dias * precioFuel;
        return resultado;
    }

    @Override
    public void aCadea() {
        System.out.println("Extractor- Metros Escola: " + getMetrosEscola() + ", Toneladas Carga: " + getToneladasCarga() + ", Calado: " + getCalado() + ", Potencia: " + getPotencia() + ", Velocidade en Nudos: " + getVelocidadeNudos() + ", Consumo por dia: " + getConsumoDia() + ", Nome: " + getNome() + ", Matricula: " + getMatricula() + ", Numero tripulantes: " + getNumTripulantes() + ", Arte: " + arte + ", Calculo consumo: " + calculoConsumo(getnumDiasEmbarcados(),getPrecioFuel(),getConsumoDia()));
    }
}
class Auxiliares extends Barcos implements tipoCamara{
    private boolean compartimentosFuel;
    public Auxiliares(int metrosEscola, int toneladasCarga, int calado, int potencia, int velocidadeNudos, float consumoDia, String nome, String matricula, int numTripulantes, int diasEmbarcados,float precioFuel, boolean compartimentosFuel){
        super(metrosEscola, toneladasCarga, calado, potencia, velocidadeNudos, consumoDia, nome, matricula, numTripulantes, diasEmbarcados, precioFuel);
        this.compartimentosFuel = compartimentosFuel;
    }

    @Override
    public void tipoCamara(){
        System.out.println("Auxiliares -  Cámara conxeladora");
    }

    @Override
    public float calculoConsumo(int dias, float precioFuel, float consumoDia) {
        float resultado;
        resultado = consumoDia * dias * precioFuel;
        return resultado;
    }

    @Override
    public void aCadea() {
        System.out.println("Auxiliares- Metros Escola: " + getMetrosEscola() + ", Toneladas Carga: " + getToneladasCarga() + ", Calado: " + getCalado() + ", Potencia: " + getPotencia() + ", Velocidade en Nudos: " + getVelocidadeNudos() + ", Consumo por dia: " + getConsumoDia() + ", Nome: " + getNome() + ", Matricula: " + getMatricula() + ", Numero tripulantes: " + getNumTripulantes() + ", Compartimentos fuel: " + (compartimentosFuel ? "Sí" : "No") + ", Calculo consumo: " + calculoConsumo(getnumDiasEmbarcados(),getPrecioFuel(),getConsumoDia()));
    }
}
public class Main {
    public static void main(String[] args) {
        // Creación de objetos
        Extractores extractor = new Extractores(100, 3, 20, 62, 12, 7, "Chucha", "2723E", 34, 90, 4, "Arrastrero");
        Auxiliares auxiliar = new Auxiliares(170, 6, 27, 78, 10, 9, "Caravela", "273627M", 67, 150, 5, true);


        // Uso del polimorfismo
        Barcos[] barco1 = {extractor};

        for (Barcos v : barco1) {
            v.aCadea();
            v.calculoConsumo(extractor.getnumDiasEmbarcados(), extractor.getPrecioFuel(), extractor.getConsumoDia());
            System.out.println();
        }

        Barcos[] barco2 = {auxiliar};
        for (Barcos x : barco2) {
            x.aCadea();
            x.calculoConsumo(auxiliar.getnumDiasEmbarcados(), auxiliar.getPrecioFuel(), auxiliar.getConsumoDia());
            System.out.println();
        }


        // Uso de la interfaz
        extractor.tipoCamara();
        auxiliar.tipoCamara();
    }

}




