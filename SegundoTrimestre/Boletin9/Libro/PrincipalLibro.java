package SegundoTrimestre.Boletin9.Libro;

class PrincipalLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("El Quijote", "Cervantes", 1605, (short) 863);
        libro2.amosar();

        libro1.setTitulo("1984");
        libro1.setAutor("George Orwell");
        libro1.setAno(1949);
        libro1.setNumPaginas((short) 328);
        libro1.amosar();
    }
}
