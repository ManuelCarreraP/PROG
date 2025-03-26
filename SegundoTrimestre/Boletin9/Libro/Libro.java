package SegundoTrimestre.Boletin9.Libro;

class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    // Constructor por defecto
    public Libro() {}

    // Constructor con parámetros
    public Libro(String titulo, String autor, int ano, short numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public short getNumPaginas() { return numPaginas; }
    public void setNumPaginas(short numPaginas) { this.numPaginas = numPaginas; }

    public float getValoracion() { return valoracion; }
    public void setValoracion(float valoracion) { this.valoracion = valoracion; }

    public void amosar() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Año: " + ano + ", Páginas: " + numPaginas + ", Valoración: " + valoracion);
    }
}
