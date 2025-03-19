package SegundoTrimestre.POO.Libro;

/**
 * Clase que representa un libro
 */
public class Libro {
    //Propiedades da clase libro
    public String titulo;
    public String autor;
    private int numPaginas;
    private double precio;
    private int cantidad;


    public Libro(String tit, String aut, int pax, double prec, int cant){
        titulo = tit;
        autor = aut;
        setNumPaginas(pax);
        setPrecio(prec);
        setCantidad(cant);
    }

    public String getTitulo(){return titulo;}
    public String getAutor(){return autor;}
    public int getNumPaginas(){return numPaginas;}
    public double getPrecio(){return precio;}
    public int getCantidad(){return cantidad;}


    public void setTitulo(String nuevoTitulo) {titulo = nuevoTitulo;}
    public void setAutor(String novoAutor){autor = novoAutor;}
    public void setNumPaginas(int novoNumPaginas){
        if (novoNumPaginas > 0) numPaginas = novoNumPaginas;
        else System.out.println("La cantidad de las páginas no pueden ser negativas");
    }
    public void setPrecio(double novoPrecio){
        if (novoPrecio > 0) precio = novoPrecio;
        else System.out.println("El precio no puede ser negativo");
    }
    public void setCantidad(int novaCantidad){
        if (novaCantidad > 0) cantidad = novaCantidad;
        else System.out.println("La cantidad no puede ser negativa") ;
    }


    public boolean venderLibro(int cantidadVenta){
        //Todo - Por facer
        if (cantidad >= cantidadVenta){
            actualizarCantidade(-cantidadVenta);
            return true;
        } else return false;

    }
    public void rexistrarEntradaLibro(int cantidadEntrada){
        actualizarCantidade(cantidadEntrada);
    }
    private void actualizarCantidade(int cantidadActu){
        cantidad += cantidadActu;
    }
   /* public ________ comparLibro(){

    }

    */
}
