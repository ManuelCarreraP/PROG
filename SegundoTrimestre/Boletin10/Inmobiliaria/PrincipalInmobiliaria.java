package SegundoTrimestre.Boletin10.Inmobiliaria;

class PrincipalInmobiliaria {
    public static void main(String[] args) {
        Garaxe garaxe1 = new Garaxe("Rúa Nova", "12", "Santiago", 15000, 2.5, 5.0, 1, true);
        LocalComercial local1 = new LocalComercial("Avda. Principal", "5", "A Coruña", 80000, true, true, false, "A", "1", 100, "Ben situado");
        Vivenda vivenda1 = new Vivenda("Camiño Real", "30", "Lugo", 120000, "B", "3", 3, true, false, true, "Luminoso");

        System.out.println(garaxe1.aCadea() + " - Ganancia: " + garaxe1.calcularGanancia(true));
        System.out.println(local1.aCadea() + " - Ganancia: " + local1.calcularGanancia(false));
        System.out.println(vivenda1.aCadea() + " - Ganancia: " + vivenda1.calcularGanancia(true));
    }
}
