package SegundoTrimestre.POO.Libro;

public class CasaLibro {
    public static void main(String[] args) {
        Libro quijote = new Libro("El Quijote","Miguel de Cervantes", 750, -40, 1);
        quijote.setTitulo("Las intrepidas aventuras del Quijote");
        quijote.setAutor("Borjitapro");
        System.out.println(quijote.getAutor()+" | "+quijote.getTitulo());
        if (quijote.venderLibro(5)) System.out.println("Venta realizada");
        else System.out.println("Error en la venta. Hay en stock?");
        quijote.rexistrarEntradaLibro(10);
        if (quijote.venderLibro(5)) System.out.println("Venta realizada");
        else System.out.println("Error en la venta. Hay en stock?");
        quijote.setPrecio(-15.0);
        System.out.println("El precio es: " + quijote.getPrecio());
    }

}
