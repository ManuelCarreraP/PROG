package SegundoTrimestre.POO.Vehiculo;

// Clase base abstracta (Abstracción)
abstract class Vehiculo {
    // Atributos encapsulados (Encapsulamiento)
    private String marca;
    private String modelo;
    private int ano;

    // Constructor
    public Vehiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método abstracto (Abstracción)
    public abstract void mostrarDetalles();

    // Método común
    public void encender() {
        System.out.println("El vehículo está encendido.");
    }

    // Getters y Setters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
}

// Subclase Coche que hereda de Vehiculo (Herencia)
class Coche extends Vehiculo {
    private int puertas;

    // Constructor
    public Coche(String marca, String modelo, int ano, int puertas) {
        super(marca, modelo, ano);
        this.puertas = puertas;
    }

    // Implementación del método abstracto (Polimorfismo)
    @Override
    public void mostrarDetalles() {
        System.out.println("Coche: " + getMarca() + " " + getModelo() + " (" + getAno() + ") - " + puertas + " puertas");
    }
}

// Subclase Moto que hereda de Vehiculo (Herencia)
class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, String modelo, int ano, boolean tieneSidecar) {
        super(marca, modelo, ano);
        this.tieneSidecar = tieneSidecar;
    }

    // Implementación del método abstracto (Polimorfismo)
    @Override
    public void mostrarDetalles() {
        System.out.println("Moto: " + getMarca() + " " + getModelo() + " (" + getAno() + ") - Sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}

// Interfaz para vehículos eléctricos (Interfaces)
interface VehiculoElectrico {
    void cargarBateria();
}

// Clase Tesla que hereda de Coche e implementa la interfaz VehiculoElectrico
class Tesla extends Coche implements VehiculoElectrico {
    private int autonomia;

    public Tesla(String modelo, int ano, int autonomia) {
        super("Tesla", modelo, ano, 4);
        this.autonomia = autonomia;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tesla: " + getModelo() + " (" + getAno() + ") - Autonomía: " + autonomia + " km");
    }

    // Implementación del método de la interfaz
    @Override
    public void cargarBateria() {
        System.out.println("Cargando batería del Tesla...");
    }
}

// Clase principal para probar el sistema
public class Main {
    public static void main(String[] args) {
        // Creación de objetos
        Coche coche1 = new Coche("Toyota", "Corolla", 2022, 4);
        Moto moto1 = new Moto("Honda", "CBR", 2021, false);
        Tesla tesla1 = new Tesla("Model S", 2023, 600);

        // Uso del polimorfismo
        Vehiculo[] vehiculos = { coche1, moto1, tesla1 };

        for (Vehiculo v : vehiculos) {
            v.mostrarDetalles();
            v.encender();
            System.out.println();
        }

        // Uso de la interfaz
        tesla1.cargarBateria();
    }

    /*
        · Clase Vehiculo: Es abstracta y define un método mostrarDetalles() que debe ser implementado por sus subclases.
        · Clase Coche y Moto: Heredan de Vehiculo y sobrescriben el método mostrarDetalles(), aplicando polimorfismo.
        · Interfaz VehiculoElectrico: Define un método cargarBateria(), que es implementado en Tesla.
        · Clase Tesla: Hereda de Coche y también implementa la interfaz VehiculoElectrico.
        · Uso del polimorfismo: Se usa un arreglo de Vehiculo[] para almacenar distintos tipos de vehículos y llamar a mostrarDetalles() de manera genérica.
        · Interfaz en acción: Tesla implementa VehiculoElectrico y usa su método cargarBateria().
     */
}
